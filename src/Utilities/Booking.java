package Utilities;

import java.util.List;

public class Booking {

	List<Seat> selectedSeats;
	Payment payment;
	Show show;
	
	public List<Seat> getSelectedSeats() {
		return selectedSeats;
	}
	public void setSelectedSeats(List<Seat> selectedSeats) {
		this.selectedSeats = selectedSeats;
	}
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	public Show getShow() {
		return show;
	}
	public void setShow(Show show) {
		this.show = show;
	}
	
}
