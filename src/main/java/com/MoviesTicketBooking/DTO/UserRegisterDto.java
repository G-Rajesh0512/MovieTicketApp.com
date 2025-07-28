package com.MoviesTicketBooking.DTO;


import com.fasterxml.jackson.annotation.JsonFormat;

public class UserRegisterDto {
	private String userName;
	private int userAge;
	private String userGender;
	private String userEmail;
	private String userMobileno;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private String userRegisterationdate;
	private String userIpaddress;
	private String otp;
	public UserRegisterDto(String otp) {
		super();
		this.otp = otp;
	}
	public UserRegisterDto() {
		
	}
	public UserRegisterDto(String userName, int userAge, String userGender, String userEmail, String userMobileno,
			String userRegisterationdate, String userIpaddress,String otp) {
		super();
		this.userName = userName;
		this.userAge = userAge;
		this.userGender = userGender;
		this.userEmail = userEmail;
		this.userMobileno = userMobileno;
		this.userRegisterationdate = userRegisterationdate;
		this.userIpaddress = userIpaddress;
		this.otp = otp;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	public String getUserGender() {
		return userGender;
	}
	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserMobileno() {
		return userMobileno;
	}
	public void setUserMobileno(String userMobileno) {
		this.userMobileno = userMobileno;
	}
	public String getUserRegisterationdate() {
		return userRegisterationdate;
	}
	public void setUserRegisterationdate(String userRegisterationdate) {
		this.userRegisterationdate = userRegisterationdate;
	}
	public String getUserIpaddress() {
		return userIpaddress;
	}
	public void setUserIpaddress(String userIpaddress) {
		this.userIpaddress = userIpaddress;
	}

	public String getOtp() {
		return otp;
	}
	public void setOtp(String otp) {
		this.otp = otp;
	}
	
}

