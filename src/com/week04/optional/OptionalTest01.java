package com.week04.optional;

import java.util.Optional;

public class OptionalTest01 {

	public static void main(String[] args) {
		
		Optional<String> empty = Optional.empty();
		System.out.println(empty);
		
		Optional<String> notEmpty = Optional.of("data");
		System.out.println(notEmpty);
		
		Optional<String> nullStr = Optional.of(null);
		System.out.println(nullStr);
		
	}
}
