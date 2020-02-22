package edu.neumont.csc150.openmedia;

import org.springframework.web.client.RestTemplate;

/**
 * This is a simple library class that can be used by Computer Science
 * students at very early skill levels to experience the excitement
 * of building an app that accesses data via a remote api.
 * 
 * Client will need an OMDB api key which can be obtained here:
 * http://www.omdbapi.com/apikey.aspx
 */
public class OpenMediaClient {

    private static final String OMDB_API_BASE_URL = "http://www.omdbapi.com";

    /**
     * The client's api key for omdb api.
     */
    private String apiKey;
    
    private RestTemplate restTemplate = new RestTemplate();


    /**
     * Create a new api client
     * @param myApiKey the client's api key obtained from http://www.omdbapi.com/apikey.aspx
     */
    public OpenMediaClient(String myApiKey) {
        this.setApiKey(myApiKey);
    }

    /**
     * retrieve the current api key value used to authenticate to the OMDB online api
     * @return he current api key value
     */
    public String getApiKey() {
        return apiKey;
    }

    /**
     * change the api key used by this object to contact the OMDB online api
     * @param apiKey the new key value
     */
    public void setApiKey(String apiKey) {
        if(apiKey == null || apiKey.isEmpty()) {
            throw new IllegalArgumentException("apiKey cannot be null or empty");
        }
        this.apiKey = apiKey;
    }

    /**
     * Query the OMDB online api for movies with titles that are similar to the
     * searchTitle parameter value
     * @param searchTitle the movie title for which to search the OMDB api
     * @param page the page number of search results pages to retrieve (1-based)
     * @return a search result list containing matches; a MovieSearchResultList with its "response" property set to false
     */
    public MovieSearchResultList searchMoviesByTitle(String searchTitle, int page) {
    	String url = String.format("%s/?apikey=%s&s=%s&page=%d", OMDB_API_BASE_URL, this.getApiKey(), searchTitle, page);
        return restTemplate.getForEntity(url, MovieSearchResultList.class).getBody();
    }
    
    /**
     * Retrieve movie details from the OMDB online api
     * @param imdbId the unique IMDB id of the movie
     * @return details about the movie; if no match then a MovieDetails object with its "response" property set to false
     */
    public MovieDetail getMovieByImdbId(String imdbId) {
    	String url = String.format("%s/?apikey=%s&i=%s", OMDB_API_BASE_URL, this.getApiKey(), imdbId);
    	return restTemplate.getForEntity(url, MovieDetail.class).getBody();
    }
}
