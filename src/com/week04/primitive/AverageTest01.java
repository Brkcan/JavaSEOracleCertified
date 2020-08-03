package com.week04.primitive;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class AverageTest01 {

	public static void main(String[] args) {
		IntStream stream = IntStream.rangeClosed(1, 10);
		OptionalDouble optional = stream.average();
		System.out.println(optional);
	}
}
