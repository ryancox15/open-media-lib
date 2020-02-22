package edu.neumont.csc150.openmedia;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a rating from a movie rating service.
 * @author rcox
 */
public class MovieRating {

	/**
	 * The source of the rating (i.e. rottern tomatoes, metacritic, etc.
	 */
	@JsonProperty("Source")
	private String source;
	
	/**
	 * The actual rated value with scale (i.e. 75/100, 73%, etc)
	 */
	@JsonProperty("Value")
	private String value;

	public String getSource() {
		return source;
	}

	public String getValue() {
		return value;
	}
}
