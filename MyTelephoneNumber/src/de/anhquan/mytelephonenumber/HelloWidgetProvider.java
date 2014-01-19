package de.anhquan.mytelephonenumber;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.graphics.Color;
import android.preference.PreferenceManager;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.widget.RemoteViews;

public class HelloWidgetProvider extends AppWidgetProvider implements OnSharedPreferenceChangeListener{

	public static final String LOG_TAG = HelloWidgetProvider.class
			.getCanonicalName();

	public static final String CLICK_ACTION = "de.anhquan.mytelephonenumber.CLICK_ACTION";
	public static final String APPWIDGET_UPDATE = "android.appwidget.action.APPWIDGET_UPDATE";
	public static final String APPWIDGET_ENABLED = "android.appwidget.action.APPWIDGET_ENABLED";
	
	@Override
	public void onEnabled(Context context) {
		super.onEnabled(context);
		Log.v(LOG_TAG, "HelloWidgetProvider::onEnabled");
	}

	@Override
	public void onUpdate(Context context, AppWidgetManager appWidgetManager,
			int[] appWidgetIds) {
		super.onUpdate(context, appWidgetManager, appWidgetIds);
		Log.v(LOG_TAG, "HelloWidgetProvider::onUpdate");
	}

	@Override
	public void onReceive(Context context, Intent intent) {
		final String action = intent.getAction();
		final RemoteViews view = new RemoteViews(context.getPackageName(),
				R.layout.hellowidget_layout);
		Log.v(LOG_TAG, "HelloWidgetProvider::OnReceive > action = " + action);
		if (action.equals(CLICK_ACTION)) {
			Log.v(LOG_TAG, "It is called when the widget is clicked !");

			Intent intent2 = new Intent(context, UserSettingsActivity.class );
			intent2.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

			context.startActivity(intent2);
		} else if (action.equals(APPWIDGET_UPDATE)) {
			Log.v(LOG_TAG, "It is called when the widget is updated !");
			// Bind the click intent for the widget

			final Intent refreshIntent = new Intent(context,
					HelloWidgetProvider.class);
			refreshIntent.setAction(CLICK_ACTION);
			final PendingIntent refreshPendingIntent = PendingIntent
					.getBroadcast(context, 0, refreshIntent,
							PendingIntent.FLAG_UPDATE_CURRENT);
			view.setOnClickPendingIntent(R.id.txtMessage, refreshPendingIntent);
			
			updateView(context, view);

		} else if (action.equals(APPWIDGET_ENABLED)) {
			Log.v(LOG_TAG, "It is called when the widget is enabled!");
			PreferenceManager.setDefaultValues(context, R.xml.user_settings, false);
			SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
			prefs.registerOnSharedPreferenceChangeListener(this);
			SharedPreferences.Editor editor1 = prefs.edit();
			editor1.putString("pref_my_phone_number", findMyPhoneNumber(context));
			editor1.commit();
		}

	}
	
	public String findMyPhoneNumber(Context context){
		TelephonyManager tMgr = (TelephonyManager)context.getSystemService(Context.TELEPHONY_SERVICE);
		String myPhoneNumber = tMgr.getLine1Number();

		return myPhoneNumber;
	}
	
	private void updateView(Context context, RemoteViews view) {
		Log.d(LOG_TAG, "HelloWidgetProvider::buildUpdate");

		SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);

		Boolean prefixVisible = prefs.getBoolean("pref_visible", true);
		String prefix = prefs.getString("pref_prefix", "My Number");
		String myNumber = prefs.getString("pref_my_telephone_number", "");
		String textColor = prefs.getString("pref_text_color", "#111111");
		
		String msg = (prefixVisible ? prefix + " : " : "")  + myNumber;
		
		view.setTextViewText(R.id.txtMessage, msg);
		view.setTextColor(R.id.txtMessage, Color.parseColor(textColor));
		ComponentName cName = new ComponentName(context,
				HelloWidgetProvider.class.getCanonicalName());
		AppWidgetManager appWidgetManager = AppWidgetManager
				.getInstance(context);
		appWidgetManager.updateAppWidget(cName, view);

	}

	@Override
	public void onSharedPreferenceChanged(SharedPreferences arg0, String arg1) {
		Log.d(LOG_TAG, "onSharedPreferenceChanged");
		
	}
}
