package com.week04.optional;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingByTest01 {

	public static void main(String[] args) {
		Stream<String> s1 = Stream.of("lions", "tigers", "bears", "bird", "horse", "turtle", "cat", "cat", "cat");
		Map<Integer, List<String>> opt =  s1.collect(Collectors.groupingBy(String::length));
		System.out.println(opt);
	}
}
