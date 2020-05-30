package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component("thatSillycoach")
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		
		return "Practice my backhand";
	}

}
