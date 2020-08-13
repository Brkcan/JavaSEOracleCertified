package com.week05.format;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class FormatTest01 {

	public static void main(String[] args) {
		
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd MMM yyyy");
		System.out.println(dateTimeFormatter.format(LocalDate.of(2020, Month.APRIL, 01)));
	}
}
