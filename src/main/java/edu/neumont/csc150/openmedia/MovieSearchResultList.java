package edu.neumont.csc150.openmedia;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class MovieSearchResultList {

    @JsonProperty(value="Search")
    private List<MovieSearchResult> movies;

    @JsonProperty(value="totalResults")
    private String totalResults;

    @JsonProperty(value="Response")
    private String response;

    public MovieSearchResultList() {}

	public MovieSearchResultList(List<MovieSearchResult> movies, String totalResults, String response) {
		this.setMovies(movies);
		this.setTotalResults(totalResults);
		this.setResponse(response);
	}

	public List<MovieSearchResult> getMovies() {
        return movies;
    }

    private void setMovies(List<MovieSearchResult> movies) {
        this.movies = movies;
    }

    public String getTotalResults() {
        return totalResults;
    }

    private void setTotalResults(String totalResults) {
        this.totalResults = totalResults;
    }

    public String getResponse() {
        return response;
    }

    private void setResponse(String response) {
        this.response = response;
    }
    
    @Override
    public String toString() {
    	return String.valueOf(this.getMovies());
    }
    
    @Override
    public boolean equals(Object obj) {
    	MovieSearchResultList other = (MovieSearchResultList)obj;
    	return this.getMovies().equals(other.getMovies());
    }
    
    @Override
    public int hashCode() {
    	return this.getMovies().hashCode();
    }
}
