package com.MoviesTicketBooking.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MoviesTicketBooking.Model.UserRegisterEntity;



public interface UserRegisterRepository extends JpaRepository <UserRegisterEntity,Long> {
	

}

