package de.anhquan.daiduongdod;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SpeisekarteFragment extends Fragment {
	
	public SpeisekarteFragment(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_speisekarte, container, false);
         
        return rootView;
    }
}
