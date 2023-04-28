package org.howard.edu.ood.finals.problem;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;

/**
 * The class SongsDatabase is implemented to to keep track of songs titles as per their genre
 * The class uses HashMap to map a genre with a set of songs belonging to that genre
 * Some methods are addSong, getGenreOfSong etc.  
 * @author Sanzv
 *
*/
public class SongsDatabase {
	private Map<String, HashSet<String>> songsMap;
	
	
	/**
	 * A default constructor to initialize SongsDatabase
	 */
	public SongsDatabase(){
		songsMap = new HashMap<String, HashSet<String>>();
	}	
	
	/**
	 * Add a song title to a genre in the Hashmap.
	 * @param genre
	 * @param songTitle
	 */
	public void addSong(String genre, String songTitle) {
		HashSet<String> s = songsMap.get(genre);
		if(s == null) {
			s = new HashSet<String>();
		}
		s.add(songTitle);
		songsMap.put(genre, s);
	}
	
	/**
	 * Returns the set of songs in the current genre. If no genre,throws EmptySetException.
	 * @param genre
	 * @return
	 */
	public Set<String> getSongs(String genre) throws EmptySongDatabaseException {
		HashSet<String> s = songsMap.get(genre);
		if(s == null) {
			throw new EmptySongDatabaseException("There is no such Genre.");
		}
		return s;
	}
	
	/**
	 * Returns the genre of the given song. If no genre, throws EmptySetException
	 * @param songTitle
	 * @return
	 */
	public String getGenreOfSong(String songTitle)  throws EmptySongDatabaseException{
		Set<String> genres = songsMap.keySet();
		for(String g: genres) {
			HashSet<String> songs = songsMap.get(g);
			for(String song: songs) {
				song = song.toLowerCase();
				if(song.equals(songTitle.toLowerCase())) {
					return g;
				}
			}
		}
		throw new EmptySongDatabaseException("There is no such Song.");
		
	}

}
