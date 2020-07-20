package com.week02.predicate;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class PredicateTest01 {

	public static void main(String[] args) {
		Stream.of("Hello", "world", "sample", "data", "hi").filter(str -> str.toLowerCase().startsWith("h"))
		.forEach(System.out::println);
		
		// Diğer kullanım
		Stream.of("Hello", "world", "sample", "data", "hi").filter((String str) -> str.startsWith("h"));
		
		// Diğer kullanım
		Predicate<String> filterLetterH = str -> str.startsWith("h");
		Stream.of("Hello", "world", "sample", "data", "hi").filter(filterLetterH);
	}
}
