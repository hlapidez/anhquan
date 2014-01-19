package de.anhquan.mytelephonenumber;

import android.app.Activity;
import android.os.Bundle;

/**
 * This Activity will be launched after the application is installed from PlayStore.
 * Because this application is the widget, this activity will help users how to use it (Widget is somehow confusing to non-tech users)
 * @author anhquan
 *
 */
public class Info extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.info_layout);
	}
}
