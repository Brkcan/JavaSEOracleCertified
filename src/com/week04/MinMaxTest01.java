package com.week04;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class MinMaxTest01 {

	public static void main(String[] args) {
		Stream<String> animalStream = Stream.of("dog" , "monkey", "horse");
		
		Comparator<String> comporator = (String s1, String s2) -> s1.length() - s2.length();
		Optional<String> minLengthElement = animalStream.min(comporator);
		System.out.println(minLengthElement);
		
		Stream<String> animalStreamMax = Stream.of("dog" , "monkey", "horse");

		Optional<String> maxLengthElement = animalStreamMax.max(comporator);
		System.out.println(maxLengthElement);
	}
}
