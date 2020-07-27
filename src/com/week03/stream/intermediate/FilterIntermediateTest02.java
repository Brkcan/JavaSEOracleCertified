package com.week03.stream.intermediate;

import java.util.stream.Stream;

public class FilterIntermediateTest02 {

	public static void main(String[] args) {
		
		Stream<String> s1 = Stream.of("ahmet", "Burak", "Can", "Murat");
		s1.filter(str -> str.startsWith("B")).forEach(System.out::println);
	}
}
