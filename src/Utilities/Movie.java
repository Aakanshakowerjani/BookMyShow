package Utilities;

import java.util.List;

public class Movie {

	String movieId;
	String movieName;
	int duration;
	int rating;
	List<String> availableLanguage;
	
	Movie(String id,String movieName,int duration){
		this.movieId=id;
		this.movieName=movieName;
		this.duration=duration;
	}
	
	public String getId() {
		return movieId;
	}
	public void setId(String id) {
		this.movieId = id;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public List<String> getAvailableLanguage() {
		return availableLanguage;
	}
	public void setAvailableLanguage(List<String> availableLanguage) {
		this.availableLanguage = availableLanguage;
	}
}
