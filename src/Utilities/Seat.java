package Utilities;

public class Seat {

	int seatNumber;
	int row;
	double price;
	SeatCategory seatcategory;
	
	public int getSeatNumber() {
		return seatNumber;
	}
	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public SeatCategory getSeatcategory() {
		return seatcategory;
	}
	public void setSeatcategory(SeatCategory seatcategory) {
		this.seatcategory = seatcategory;
	}
	
}
