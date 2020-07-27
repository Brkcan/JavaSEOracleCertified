package com.week03.stream.intermediate;

import java.util.stream.IntStream;

public class FilterIntermediateTest03 {

	public static void main(String[] args) {
		IntStream.rangeClosed(0, 10).filter(i -> (i % 2) == 0).forEach(System.out::println);
		
		int i = 0;
		while(i <= 10) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		}
		
		IntStream.rangeClosed(0, 10).filter(FilterIntermediateTest03::isEven).forEach(System.out::print);
	}
	public static boolean isEven(int i) {
		return ( i % 2 ) == 0;
	}
}
