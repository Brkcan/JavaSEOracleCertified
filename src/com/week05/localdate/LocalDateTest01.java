package com.week05.localdate;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

public class LocalDateTest01 {

	public static void main(String[] args) {
		
		Date date = new Date();
		
		LocalDate localDate = LocalDate.now();
		
		System.out.println(date);
		System.out.println(localDate);
		
		LocalDate localDate2 = LocalDate.of(2020, 3, 1);
		LocalDate localDate3 = LocalDate.of(2019, Month.APRIL, 15);
		
		System.out.println(localDate2);
		System.out.println(localDate3);
	}
}
