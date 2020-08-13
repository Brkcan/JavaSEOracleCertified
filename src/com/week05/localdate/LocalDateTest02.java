package com.week05.localdate;

import java.time.LocalDate;

public class LocalDateTest02 {

	public static void main(String[] args) {
		
		LocalDate localDate = LocalDate.ofYearDay(2000, 40);
		System.out.println(localDate);
		
		LocalDate epoch = LocalDate.ofEpochDay(10000);
		System.out.println(epoch);
		
		LocalDate parsed = LocalDate.parse("2020-03-03");
		System.out.println(parsed);
	}
}
