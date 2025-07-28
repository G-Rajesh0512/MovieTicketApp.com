package com.MoviesTicketBooking.DTO;


public class TheatreDto {
	private Long theatreid;
	private String theatreName;
	private String theatrelocation;
	private int theatreseatCount;
	private int theatreseatNumber;
	
	public TheatreDto() {
		
	}
	public TheatreDto(Long theatreid, String theatreName, String theatrelocation, int theatreseatCount,
			int theatreseatNumber) {
		super();
		this.theatreid = theatreid;
		this.theatreName = theatreName;
		this.theatrelocation = theatrelocation;
		this.theatreseatCount = theatreseatCount;
		this.theatreseatNumber = theatreseatNumber;
	}
	public Long getTheatreid() {
		return theatreid;
	}
	public void setTheatreid(Long theatreid) {
		this.theatreid = theatreid;
	}
	public String getTheatreName() {
		return theatreName;
	}
	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}
	public String getTheatrelocation() {
		return theatrelocation;
	}
	public void setTheatrelocation(String theatrelocation) {
		this.theatrelocation = theatrelocation;
	}
	public int getTheatreseatCount() {
		return theatreseatCount;
	}
	public void setTheatreseatCount(int theatreseatCount) {
		this.theatreseatCount = theatreseatCount;
	}
	public int getTheatreseatNumber() {
		return theatreseatNumber;
	}
	public void setTheatreseatNumber(int theatreseatNumber) {
		this.theatreseatNumber = theatreseatNumber;
	}
}
