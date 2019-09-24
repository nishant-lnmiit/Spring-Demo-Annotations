package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	private String[] data = {"Hello", "Yellow", "Fellow"};
	
	private Random random = new Random();

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		
		int index = random.nextInt(data.length);
		String theFortune = data[index];
		
		return theFortune;
	}

}
