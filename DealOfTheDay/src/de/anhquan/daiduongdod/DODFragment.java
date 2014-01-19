package de.anhquan.daiduongdod;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DODFragment extends Fragment{
	
	LinearLayout llStats;
	WebView txtProductDescription;
	TextView txtPrice;
	
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_dod, container, false);
        
		Activity activity = getActivity();
		//update app title with current date
		Calendar c = Calendar.getInstance();
		SimpleDateFormat df = new SimpleDateFormat("dd.MM.yyyy");
		String formattedDate = df.format(c.getTime());
//		String title = activity.getTitle().toString() + " ("+formattedDate+")";
//		activity.setTitle(title);

		llStats = (LinearLayout) rootView.findViewById(R.id.llStats);
		txtProductDescription = (WebView) rootView.findViewById(R.id.webview);
		txtProductDescription.setBackgroundColor(0x00000000);
		txtPrice = (TextView) rootView.findViewById(R.id.txtPrice);
		Button btOrder = (Button)rootView.findViewById(R.id.btOrder);
		btOrder.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Uri uri = Uri.parse("http://daiduong-restaurant.de/products/dod");
				Intent intent = new Intent(Intent.ACTION_VIEW, uri);
				startActivity(intent);				
			}
		});

		// layout background transparent
		llStats.getBackground().setAlpha(150);
		llStats.setVisibility(View.VISIBLE);

		Intent i = activity.getIntent();
		String productDescription = i.getStringExtra(SplashScreen.EXTRA_MESSAGE_PRODUCT_DESCRIPTION);
		String price = i.getStringExtra(SplashScreen.EXTRA_MESSAGE_PRICE);

		if (productDescription!=null){
			// Diplaying the text
			String htmlDescription ="<html><head><style type=\"text/css\">body{color: #fff;}</style></head><body>"+productDescription+"</body></html>";
			txtProductDescription.loadData(htmlDescription, "text/html;charset=utf-8", "UTF-8");
			txtPrice.setText("Nur "+price);
		}
		else{
			String htmlDescription ="<html><body>Sorry! Keine verbindung mit daiduong-restaurant.de</body></html>";
			txtProductDescription.loadData(htmlDescription, "text/html;charset=utf-8", "UTF-8");
		}
				
        return rootView;
	}

}
