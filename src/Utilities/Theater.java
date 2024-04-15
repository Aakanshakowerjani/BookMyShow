package Utilities;

import java.util.List;

public class Theater {
	
	String theaterId;
	List<Screen> screens;
	List<Show> shows;
	
	public String getTheaterId() {
		return theaterId;
	}
	public void setTheaterId(String theaterId) {
		this.theaterId = theaterId;
	}
	public List<Screen> getScreens() {
		return screens;
	}
	public void setScreens(List<Screen> screens) {
		this.screens = screens;
	}
	public List<Show> getShows() {
		return shows;
	}
	public void setShows(List<Show> shows) {
		this.shows = shows;
	}
}
