package com.week04;

import java.util.stream.Stream;

public class CountTest01 {

	public static void main(String[] args) {
		Stream<String> s1 = Stream.of("Element1", "Element2", "Element3");
		long size = s1.count();
		System.out.println(size);
	}
}
