package de.anhquan.mytelephonenumber;

import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;

public class SettingsFragment extends PreferenceFragment {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// 
        PreferenceManager.setDefaultValues(getActivity(),
                R.xml.user_settings, false);

		// Load the preferences from an XML resource
		addPreferencesFromResource(R.xml.user_settings);
	}

}
