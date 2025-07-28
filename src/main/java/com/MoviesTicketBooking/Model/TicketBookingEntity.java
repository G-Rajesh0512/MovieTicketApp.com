package com.MoviesTicketBooking.Model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "ticket_booking_entity")
public class TicketBookingEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ticketId;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "userId")
    private UserRegisterEntity user;

    private String userEmail;
    private String movieName;

    private String theatreName;
    private int seatNo;
    private LocalTime showTime;
    @Column
    private LocalDate bookingDate;
    private double price;
    private String userIpAddress;

    public TicketBookingEntity() {}
    public TicketBookingEntity(Long ticketId, UserRegisterEntity user, String userEmail, String movieName,
                               String theatreName, int seatNo, LocalTime showTime, LocalDate bookingDate,
                               double price, String userIpAddress) {
        this.ticketId = ticketId;
        this.user = user;
        this.userEmail = userEmail;
        this.movieName = movieName;
        this.theatreName = theatreName;
        this.seatNo = seatNo;
        this.showTime = showTime;
        this.bookingDate = bookingDate;
        this.price = price;
        this.userIpAddress = userIpAddress;
    }
    public Long getTicketId() {
        return ticketId;
    }

    public void setTicketId(Long ticketId) {
        this.ticketId = ticketId;
    }

    public UserRegisterEntity getUser() {
        return user;
    }

    public void setUser(UserRegisterEntity user) {
        this.user = user;
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
        return "TicketBookingEntity{" +
                "ticketId=" + ticketId +
                ", user=" + user +
                ", userEmail='" + userEmail + '\'' +
                ", movieName='" + movieName + '\'' +
                ", theatreName='" + theatreName + '\'' +
                ", seatNo=" + seatNo +
                ", showTime=" + showTime +
                ", bookingDate=" + bookingDate +
                ", price=" + price +
                ", userIpAddress='" + userIpAddress + '\'' +
                '}';
    }
}
