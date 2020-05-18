package com.luv2code.springdemo;

import java.util.Random;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		String fortune [] = {"You are going to be rich", "You are very wise today", "You will be happy"};
		Random generator = new Random();
		int randomIndex = generator.nextInt(fortune.length);
		return fortune[randomIndex];		
	}

}
