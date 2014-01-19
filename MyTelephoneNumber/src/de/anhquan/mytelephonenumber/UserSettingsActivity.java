package de.anhquan.mytelephonenumber;

import android.app.Activity;
import android.os.Bundle;

public class UserSettingsActivity extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		getFragmentManager()
		.beginTransaction()
		.replace(android.R.id.content, new SettingsFragment())
		.commit();
	}

}