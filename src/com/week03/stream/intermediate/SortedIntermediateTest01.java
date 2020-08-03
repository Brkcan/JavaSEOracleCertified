package com.week03.stream.intermediate;

import java.util.stream.Stream;

public class SortedIntermediateTest01 {

	public static void main(String[] args) {
		Stream<String> stream = Stream.of("D", "b", "T", "A", "c", "Z");
		stream.sorted().forEach(System.out::print);
	}
}
