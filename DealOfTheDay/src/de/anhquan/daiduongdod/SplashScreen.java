package de.anhquan.daiduongdod;

import org.json.JSONException;
import org.json.JSONObject;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Window;
import de.anhquan.daiduongdod.utils.JsonParser;

public class SplashScreen extends ActionBarActivity {

	String productDescription;
	String price;
	
	public static String EXTRA_MESSAGE_PRODUCT_DESCRIPTION = "PRODUCT_DESCRIPTION";
	public static String EXTRA_MESSAGE_PRICE = "PRICE";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_splash);
		
		new PrefetchData().execute("http://daiduong-restaurant.de/products/dod.js");
	}

	/*
	 * Async Task to make http call
	 */
	private class PrefetchData extends AsyncTask<String, Integer, Integer> {
		
		
		@Override
		protected void onPreExecute() {
			//setSupportProgressBarIndeterminateVisibility(true);
		}

		@Override
		protected void onPostExecute(Integer result) {
			super.onPostExecute(result);
			// After completing http call
			// will close this activity and lauch main activity
			Intent i = new Intent(SplashScreen.this, MainActivity.class);
			i.putExtra(EXTRA_MESSAGE_PRODUCT_DESCRIPTION, productDescription);
			i.putExtra(EXTRA_MESSAGE_PRICE, price);
			startActivity(i);
			
			// hide the progressbar
			//setSupportProgressBarIndeterminateVisibility(false);

			// close this activity
			finish();
			
		}

		@Override
		protected Integer doInBackground(String... params) {
			JsonParser jsonParser = new JsonParser();
			String json = jsonParser
					.getJSONFromUrl(params[0]);

			Log.d("Response: ", json);

			if (json != null) {
				try {
					JSONObject jObj = new JSONObject(json);
					productDescription = jObj.getString("description");
					int priceInCent = Integer.parseInt(jObj.getString("price"));
					int priceInEur = priceInCent / 100;
					int cent = priceInCent - priceInEur*100;
					price = priceInEur + "," + cent +" EUR";
					
				} catch (JSONException e) {
					Log.e("JSONException", e.getMessage());
				}

			}

			return null;
		}

	}

}
