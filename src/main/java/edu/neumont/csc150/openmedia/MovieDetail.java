package edu.neumont.csc150.openmedia;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The move detail as found in the open media database
 * @author rcox
 */
public class MovieDetail {

	@JsonProperty("Title")
	private String title;
	
	@JsonProperty("Year")
	private String year;
	
	@JsonProperty("Rated")
	private String rated;
	
	@JsonProperty("Released")
	private String released;
	
	@JsonProperty("Runtime")
	private String runtime;
	
	@JsonProperty("Genre")
	private String genre;
	
	@JsonProperty("Director")
	private String director;
	
	@JsonProperty("Writer")
	private String writer;
	
	@JsonProperty("Actors")
	private String actors;
	
	@JsonProperty("Plot")
	private String plot;
	
	@JsonProperty("Language")
	private String language;
	
	@JsonProperty("country")
	private String Country;
	
	@JsonProperty("Awards")
	private String awards;
	
	@JsonProperty("Poster")
	private String poster;
	
	@JsonProperty("Ratings")
	private List<MovieRating> ratings = new ArrayList<>();
	
	@JsonProperty("Metascore")
	private String metascore;
	
	private String imdbRating;
	
	private String imdbVotes;
	
	/**
	 * The IMDB unique identifier for the movie
	 */
	private String imdbID;
	
	@JsonProperty("Type")
	private String type;
	
	@JsonProperty("DVD")
	private String dvdReleaseDate;
	
	@JsonProperty("BoxOffice")
	private String boxOffice;
	
	@JsonProperty("Production")
	private String production;
	
	@JsonProperty("Website")
	private String website;
	
	@JsonProperty("Response")
	private String response;

	public String getTitle() {
		return title;
	}

	public String getYear() {
		return year;
	}

	public String getRated() {
		return rated;
	}

	public String getReleased() {
		return released;
	}

	public String getRuntime() {
		return runtime;
	}

	public String getGenre() {
		return genre;
	}

	public String getDirector() {
		return director;
	}

	public String getWriter() {
		return writer;
	}

	public String getActors() {
		return actors;
	}

	public String getPlot() {
		return plot;
	}

	public String getLanguage() {
		return language;
	}

	public String getCountry() {
		return Country;
	}

	public String getAwards() {
		return awards;
	}

	public String getPoster() {
		return poster;
	}

	public List<MovieRating> getRatings() {
		return ratings;
	}

	public String getMetascore() {
		return metascore;
	}

	public String getImdbRating() {
		return imdbRating;
	}

	public String getImdbVotes() {
		return imdbVotes;
	}

	public String getImdbID() {
		return imdbID;
	}

	public String getType() {
		return type;
	}

	public String getDvdReleaseDate() {
		return dvdReleaseDate;
	}

	public String getBoxOffice() {
		return boxOffice;
	}

	public String getProduction() {
		return production;
	}

	public String getWebsite() {
		return website;
	}

	public String getResponse() {
		return response;
	}

	@Override
	public boolean equals(Object obj) {
		MovieDetail other = (MovieDetail)obj;
		return this.getImdbID().equals(other.getImdbID());
	}
	
	@Override
	public int hashCode() {
		return this.getImdbID().hashCode();
	}
}
