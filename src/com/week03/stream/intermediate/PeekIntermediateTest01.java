package com.week03.stream.intermediate;

import java.util.stream.Stream;

public class PeekIntermediateTest01 {

	public static void main(String[] args) {
		
	long st = Stream.of(1,2,3,4,5).map(i -> i * i).peek(i -> System.out.printf("%d ", i)).count();
	System.out.println(st);
	}
}
