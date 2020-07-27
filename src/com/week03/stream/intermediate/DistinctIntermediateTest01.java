package com.week03.stream.intermediate;

import java.util.stream.Stream;

public class DistinctIntermediateTest01 {

	public static void main(String[] args) {
		Stream<String> s1 = Stream.of("e1","e2", "e1","e3", "e2", "e4");
		s1.distinct().forEach(System.out::println);
	}
}
