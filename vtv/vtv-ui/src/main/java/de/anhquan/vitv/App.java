package de.anhquan.vitv;

import java.io.IOException;

import de.anhquan.vitv.internal.TVPlayer;
import de.anhquan.vitv.internal.TVPlayerDisplay;

public class App {

	public static void main(String[] args) throws IOException {
		TVPlayer player = new TVPlayer();
		TVPlayerDisplay tv = new TVPlayerDisplay(player);
		
		tv.displayAndWait();
	}

}
