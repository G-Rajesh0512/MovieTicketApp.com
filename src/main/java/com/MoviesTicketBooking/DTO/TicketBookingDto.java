package com.MoviesTicketBooking.DTO;

import java.time.LocalDate;
import java.time.LocalTime;

public class TicketBookingDto {
	private Long userId;
    private String userEmail;
    private String movieName;
    private String theatreName;
    private int seatNo;
    private LocalTime showTime;
    private LocalDate bookingDate;
    private double price;
    private String userIpAddress;
    
    public TicketBookingDto() {
    	
    }
	public TicketBookingDto(Long userId, String userEmail, String movieName, String theatreName, int seatNo,
			LocalTime showTime, LocalDate bookingDate, double price, String userIpAddress) {
		super();
		this.userId = userId;
		this.userEmail = userEmail;
		this.movieName = movieName;
		this.theatreName = theatreName;
		this.seatNo = seatNo;
		this.showTime = showTime;
		this.bookingDate = bookingDate;
		this.price = price;
		this.userIpAddress = userIpAddress;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getTheatreName() {
		return theatreName;
	}
	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}
	public int getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}
	public LocalTime getShowTime() {
		return showTime;
	}
	public void setShowTime(LocalTime showTime) {
		this.showTime = showTime;
	}
	public LocalDate getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getUserIpAddress() {
		return userIpAddress;
	}
	public void setUserIpAddress(String userIpAddress) {
		this.userIpAddress = userIpAddress;
	}
	@Override
	public String toString() {
		return "TicketBookingDto [userId=" + userId + ", userEmail=" + userEmail + ", movieName=" + movieName
				+ ", theatreid=" + theatreName + ", seatNo=" + seatNo + ", showTime=" + showTime + ", bookingDate="
				+ bookingDate + ", price=" + price + ", userIpAddress=" + userIpAddress + "]";
	}
    
    

}

