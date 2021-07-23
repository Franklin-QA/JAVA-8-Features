package com.test.java8_feature.DateAPI;

import java.time.Instant;
import java.time.LocalTime;
import java.time.ZoneId;

public class localTime {

	public static void main(String[] args) {
		LocalTime t = LocalTime.now();
		System.out.println(t);
		
		LocalTime time = LocalTime.of(12, 12, 12, 2000);
		System.out.println(time);
		
		LocalTime now = LocalTime.now(ZoneId.of("GMT"));
		System.out.println(now);
		
		Instant now2 = Instant.now();
		System.out.println(now2);
	
	}
}
