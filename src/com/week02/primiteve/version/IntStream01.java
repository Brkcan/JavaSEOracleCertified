package com.week02.primiteve.version;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class IntStream01 {

	public static void main(String[] args) {
		
		IntPredicate ip1 = (int i) -> i %2 == 0;
		IntStream.range(1, 10).filter(ip1).forEach(System.out::println);
		
		System.out.println("-----");
		IntStream.range(1, 10).filter(i -> (i % 2) == 0).forEach(System.out::println);
	}

}
