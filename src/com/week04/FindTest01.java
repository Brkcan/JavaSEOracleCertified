package com.week04;

import java.util.Optional;
import java.util.stream.Stream;

public class FindTest01 {

	public static void main(String[] args) {
		
		Stream<String> s1 = Stream.of("key1", "key2", "key3");
		
		Optional op = s1.findFirst();
		System.out.println(op.get());
	}
}
