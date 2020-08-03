package com.week04.optional;

import java.util.Optional;

public class OptionalStreamTest02 {

	public static void main(String[] args) {
		Optional<String> string = Optional.of("  abraca " +  " dabra  ");
		string.map(String::trim).ifPresent(System.out::println);
	}
}
 