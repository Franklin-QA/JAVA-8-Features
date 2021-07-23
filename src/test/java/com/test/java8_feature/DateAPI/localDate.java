package com.test.java8_feature.DateAPI;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;

public class localDate {

	public static void main(String[] args) {
		
		LocalDate d = LocalDate.now();
		System.out.println(d);
		
		LocalDate s = LocalDate.of(1200, Month.JULY, 12);
		System.out.println(s);
		
		LocalDate now = LocalDate.now(ZoneId.of("GMT"));
		System.out.println(now);
		
		Instant now2 = Instant.now();
		System.out.println(now2);
	}

}
