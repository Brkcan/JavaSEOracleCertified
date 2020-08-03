package com.week04;

import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class ReduceTest01 {

	public static void main(String[] args) {
		String[] array = new String[] {"w", "o", "l", "f"};
		
		
		Stream<String> s1 =  Stream.of("w", "o", "l", "f");
		BinaryOperator<String> nu = (String s, String s2) -> s + s2;
		Optional<String> op = s1.reduce(nu);
		System.out.println(op.get());
	}
}
