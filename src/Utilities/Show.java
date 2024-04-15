package Utilities;

import java.sql.Timestamp;
import java.util.List;

public class Show {

	String showId;
	Movie movie;
	List<Seat> bookedSeats;
	Timestamp startTime;
	Screen screen;
	
	public String getShowId() {
		return showId;
	}
	public void setShowId(String showId) {
		this.showId = showId;
	}
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	public List<Seat> getBookedSeats() {
		return bookedSeats;
	}
	public void setBookedSeats(List<Seat> bookedSeats) {
		this.bookedSeats = bookedSeats;
	}
	public Timestamp getStartTime() {
		return startTime;
	}
	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}
	public Screen getScreen() {
		return screen;
	}
	public void setScreen(Screen screen) {
		this.screen = screen;
	}
}
