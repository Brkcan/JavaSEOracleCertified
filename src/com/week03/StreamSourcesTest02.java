package com.week03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamSourcesTest02 {

	public static void main(String[] args) {
		Stream<String> empty = Stream.empty();
		Stream.of("Data1", "Data2", "Data3").forEach(System.out::println);
		 
		List<String> list = Arrays.asList("a", "b", "c");
	    list.stream().forEach(System.out::println);
		 
	}
}
