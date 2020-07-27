package com.week03;

import java.util.regex.Pattern;
import java.util.stream.Stream;

public class StreamSourcesTest05 {

	public static void main(String[] args) {
		
		Stream<String> stream = Pattern.compile(" ").splitAsStream("java stream test");
		stream.forEach(System.out::println);
	}
}
