package com.luv2code.springdemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomFortuneService implements HappyFortuneService {
	
	private Random myRandom;
	
	@Override
	public String getFortune() {
		
		BufferedReader in;
		String[] stringArray = null;
		try {
			in = new BufferedReader(new FileReader("D:\\Users\\vinayshe\\Desktop\\Fortune.txt"));
			String str;
			List<String> list = new ArrayList<String>();
			while((str = in.readLine()) != null){
			    list.add(str);
			}
			stringArray = list.toArray(new String[0]);
			int index = myRandom.nextInt(stringArray.length);
			String myFortune = stringArray[index];
			in.close();
			return myFortune;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	return "File is empty";
	}

}
