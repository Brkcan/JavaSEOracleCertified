package com.week05.duration;

import java.time.Duration;
import java.time.LocalTime;

public class DurationTest01 {

	public static void main(String[] args) {
		
		LocalTime localTime = LocalTime.of(10, 30);
		LocalTime now = LocalTime.now();
		
		Duration d1 = Duration.between(localTime, now);
		System.out.println(d1);
	}
}
