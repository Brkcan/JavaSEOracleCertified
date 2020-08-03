package com.week04;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class MinMaxPrimitiveTest01 {

	public static void main(String[] args) {
		
		IntStream is = IntStream.of(2 ,4 ,-4, 67, -23, 40);
		OptionalInt opt = is.min();
		System.out.println(opt);
		
		IntStream is2 = IntStream.of(2 ,4 ,-4, 67, -23, 40);
		OptionalInt opt2 = is2.max();
		System.out.println(opt2);
	}
}
