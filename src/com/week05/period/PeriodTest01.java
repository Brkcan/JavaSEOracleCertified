package com.week05.period;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class PeriodTest01 {

	public static void main(String[] args) {
		LocalDate startDate = LocalDate.of(2000, Month.APRIL, 20);
		LocalDate endDate = LocalDate.now();
		
		Period period = Period.between(startDate, endDate);
		System.out.println(period);
	}
}
