package Utilities;

import java.util.HashMap;
import java.util.List;

public class MovieController {

	HashMap<String,List<Movie>> cityMovieMap;
	List<Movie> movies;
	public HashMap<String, List<Movie>> getCityMovieMap() {
		return cityMovieMap;
	}
	public void setCityMovieMap(HashMap<String, List<Movie>> cityMovieMap) {
		this.cityMovieMap = cityMovieMap;
	}
	public List<Movie> getMovies() {
		return movies;
	}
	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}
}
