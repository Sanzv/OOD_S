package org.howard.edu.ood.finals.problem;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * A class containing the unit test cases of the SongDatabase class. 
 * @author sanzv
 *
 */
public class SongsDatabaseTest {
	
	SongsDatabase db;
	
	@BeforeEach
	protected void setUp() {
		db = new SongsDatabase();
	}

	@Test
	@DisplayName("Test case for add Songs method")
	public void testAddSong() throws EmptySongDatabaseException {
		
		Set<String> rapSongs = new HashSet<String>();
		rapSongs.add("Savage");
		db.addSong("Rap", "Savage");
		Set<String> songs = db.getSongs("Rap");
		assertTrue(songs.equals(rapSongs));
		
		rapSongs.add("Gin and Juice");
		db.addSong("Rap", "Gin and Juice");
		songs = db.getSongs("Rap");
		assertTrue(songs.equals(rapSongs));

		Set<String> jaazSongs = new HashSet<String>();
		jaazSongs.add("Always There");
		db.addSong("Jaaz", "Always There");
		songs = db.getSongs("Jaaz");
		assertTrue(songs.equals(jaazSongs));
		
	}
	
	@Test
	@DisplayName("Test case for getSongs method")
	public void testGetSongs_WithException() throws EmptySongDatabaseException {
		Throwable exception = assertThrows(EmptySongDatabaseException.class, () -> {db.getSongs("Rap");});
		assertNotNull(exception.getMessage());
		assertEquals("There is no such Genre.", exception.getMessage());
		
	}
	
	@Test
	@DisplayName("Test case for getSongs method")
	public void testGetSongs() throws EmptySongDatabaseException {
		db.addSong("Rap", "Savage");
		db.addSong("Rap", "Gin and Juice");
		
		Set<String> result = new HashSet<String>();
		result.add("Savage");
		result.add("Gin and Juice");
		
		Set <String> songs = db.getSongs("Rap");
		assertTrue(songs.equals(result));
		
	}


	@Test
	@DisplayName("Test case for getGenreOfSong method with Exception")
	public void testGetGenreOfSong_WithException() throws EmptySongDatabaseException{
		Throwable exception = assertThrows(EmptySongDatabaseException.class, () -> {db.getGenreOfSong("Savage");});
		assertNotNull(exception.getMessage());
		assertEquals("There is no such Song.", exception.getMessage());
	}
	
	
	@Test
	@DisplayName("Test case for getGenreOfSong method")
	public void testGetGenreOfSong() throws EmptySongDatabaseException{
		db.addSong("Rap", "Savage");
		db.addSong("Jazz", "Always There");
		assertEquals(db.getGenreOfSong("Savage"), "Rap");
		assertEquals(db.getGenreOfSong("Always There"), "Jazz");
		assertEquals(db.getGenreOfSong("savage"), "Rap");
		assertEquals(db.getGenreOfSong("always there"), "Jazz");


	}
		

}
