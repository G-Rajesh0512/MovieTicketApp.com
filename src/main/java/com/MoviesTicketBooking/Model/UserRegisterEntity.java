package com.MoviesTicketBooking.Model;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserRegisterEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long userId;
	private String userName;
	private int userAge;
	private String userGender;
	private String userEmail;
	private String userMobileno;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private String userRegisterationdate;
	private String userIpaddress;
	public long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
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
	public UserRegisterEntity() {
		
	}
	public UserRegisterEntity(Long userId, String userName, int userAge, String userGender, String userEmail,
			String userMobileno, String userRegisterationdate, String userIpaddress) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userAge = userAge;
		this.userGender = userGender;
		this.userEmail = userEmail;
		this.userMobileno = userMobileno;
		this.userRegisterationdate = userRegisterationdate;
		this.userIpaddress = userIpaddress;
	}
	@Override
	public String toString() {
		return "UserRegisterEntity [userId=" + userId + ", userName=" + userName + ", userAge=" + userAge
				+ ", userGender=" + userGender + ", userEmail=" + userEmail + ", userMobileno=" + userMobileno
				+ ", userRegisterationdate=" + userRegisterationdate + ", userIpaddress=" + userIpaddress + "]";
	}
	public static Object builder() {
		return null;
	}
	
	

}


