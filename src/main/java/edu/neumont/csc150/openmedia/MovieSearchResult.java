package edu.neumont.csc150.openmedia;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A single search result in a list of search results.  Contains some basic information
 * about the movie such as title, year, and IMDB id.
 * 
 * @author rcox
 */
public class MovieSearchResult {

    @JsonProperty(value="Title")
    private String title;

    @JsonProperty(value="Year")
    private String year;

    @JsonProperty(value="imdbID")
    private String imdbId;

    @JsonProperty(value="Type")
    private String type;

    @JsonProperty(value="Poster")
    private String poster;

    public MovieSearchResult() {}
    
    public MovieSearchResult(String title, String year, String imdbId, String type, String poster) {
		this.setTitle(title);
		this.setYear(year);
		this.setImdbId(imdbId);
		this.setType(type);
		this.setPoster(poster);
	}

	public String getTitle() {
        return title;
    }

	private void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    private void setYear(String year) {
        this.year = year;
    }

    public String getImdbId() {
        return imdbId;
    }

    private void setImdbId(String imdbId) {
        this.imdbId = imdbId;
    }

    public String getType() {
        return type;
    }

    private void setType(String type) {
        this.type = type;
    }

    public String getPoster() {
        return poster;
    }

    private void setPoster(String poster) {
        this.poster = poster;
    }
    
    @Override
    public String toString() {
    	return String.format("%s (%s) id=%s", this.getTitle(), this.getYear(), this.getImdbId());
    }
    
    @Override 
    public boolean equals(Object obj) {
    	MovieSearchResult other = (MovieSearchResult)obj;
    	return this.getImdbId().equals(other.getImdbId());
    }
    
    @Override
    public int hashCode() {
    	return this.getImdbId().hashCode();
    }
}
