package edu.neumont.csc150.openmedia;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieTests {

	private String apiKey = "";
	
	@Test
	public void testAvengersSearch() {
		OpenMediaClient c = new OpenMediaClient(apiKey);
		MovieSearchResultList r = c.searchMoviesByTitle("avengers", 1);
		Assertions.assertEquals("96", r.getTotalResults());
	}
	
	@Test
	public void testRetrieveAgeOfUltron() {
		OpenMediaClient c = new OpenMediaClient(apiKey);
		MovieDetail m = c.getMovieByImdbId("tt2395427");
		Assertions.assertEquals("Avengers: Age of Ultron", m.getTitle());
	}
	
	@Test
	public void testNoSuchMovieLookup() {
		OpenMediaClient c = new OpenMediaClient(apiKey);
		MovieDetail m = c.getMovieByImdbId("t2327z");
		Assertions.assertEquals("False", m.getResponse());
	}
	
	@Test
	public void testSearchNoResults() {
		OpenMediaClient c = new OpenMediaClient(apiKey);
		MovieSearchResultList r = c.searchMoviesByTitle("djfklsdjflkdsjkldfjlkdsjfklsdj", 1);
		Assertions.assertEquals("False", r.getResponse());
	}
}
