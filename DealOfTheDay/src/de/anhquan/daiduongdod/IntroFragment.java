package de.anhquan.daiduongdod;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import android.app.Fragment;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebView;
import de.anhquan.daiduongdod.utils.JsonParser;

public class IntroFragment extends Fragment {

	WebView webView;
	public IntroFragment() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.fragment_intro, container,
				false);

		webView = (WebView) rootView.findViewById(R.id.webview);

		// webView.loadUrl("http://daiduong-restaurant.de/pages/impressum");

		new LoadPageTask().execute("http://daiduong-restaurant.de/pages/impressum");
		return rootView;
	}

	/*
	 * Async Task to make http call
	 */
	private class LoadPageTask extends AsyncTask<String, Integer, String> {

		
		@Override
		protected void onPreExecute() {
			webView.loadData("Please wait ...", "text/plain", "utf-8");
		}

		@Override
		protected void onPostExecute(String result) {			
			webView.loadData(result, "text/html;charset:utf-8", "utf-8");
		}

		@Override
		protected String doInBackground(String... params) {
			JsonParser jsonParser = new JsonParser();
			String json = jsonParser.getJSONFromUrl(params[0]);
			String str="";
			try {
				Document doc = Jsoup.connect(
						"http://daiduong-restaurant.de/pages/impressum").get();
				Element content = doc.getElementById("page");
				if (content!=null)
					str = content.html();
			} catch (IOException e) {
				e.printStackTrace();
			}

			return str;
		}

	}
}
