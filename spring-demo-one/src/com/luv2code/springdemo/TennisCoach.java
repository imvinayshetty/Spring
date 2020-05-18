package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier ("randomFortuneService")
	private HappyFortuneService TheDailyFortune;

	public TennisCoach() {
		System.out.println(">> TennisCoach: inside default constructor");
	}
	
	@Override
	public String getDailyWorkout() {
		return "You are training for Tennis";
	}
	
	@Override
	public String getDailyFortune() {
		return TheDailyFortune.getFortune();
	}

}
