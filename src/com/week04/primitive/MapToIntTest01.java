package com.week04.primitive;

import java.util.function.ToIntFunction;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MapToIntTest01 {

	public static void main(String[] args) {
		Stream<Integer> s1 = Stream.of(1, 2, 3, 4, 5);
		
		ToIntFunction<Integer> toInt = (Integer t)  -> t;
		s1.mapToInt(toInt).forEach(System.out::println);
		
//		System.out.println(is.);
	}
}
