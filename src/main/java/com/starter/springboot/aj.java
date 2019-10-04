package com.starter.springboot;

import java.util.Random;

public class aj {
	public static void main(String[] args) {
		Random random=new Random();
		int OTP = 1000 + random.nextInt(9000);
		System.out.println(OTP);
	}

}
