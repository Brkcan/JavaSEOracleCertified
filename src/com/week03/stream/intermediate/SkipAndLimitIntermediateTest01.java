package com.week03.stream.intermediate;

import java.util.stream.Stream;

public class SkipAndLimitIntermediateTest01 {

	public static void main(String[] args) {
		Stream<Integer> s = Stream.iterate(1, n -> n + 1);
		s.skip(5).limit(4).forEach(System.out::println);
	}
}
