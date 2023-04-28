package org.howard.edu.ood.finals.problem;

import java.util.Set;

public class Driver {

	public static void main(String[] args) throws EmptySongDatabaseException {
		SongsDatabase db = new SongsDatabase();
		
		db.addSong("Rap", "Savage");
		db.addSong("Rap", "Rap God");
		
		Set<String> songs = db.getSongs("Rap");
		
		System.out.println("Songs with genre Rap : ");
		for(String song: songs) {
			System.out.println(song);
		}
		
		System.out.println("Genre of Song Rap God is: " + db.getGenreOfSong("rap god"));

;	}
}