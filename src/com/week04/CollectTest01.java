package com.week04;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectTest01 {

	public static void main(String[] args) {
		Stream<String> s1 = Stream.of("horse", "dog", "cat", "bird", "Monkey");
		
		List<String> list = s1.filter(animal -> animal.length() > 3).collect(Collectors.toList());
		System.out.println(list);
	}
}
