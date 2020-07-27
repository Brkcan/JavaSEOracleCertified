package com.week03;

import java.util.stream.IntStream;

public class StreamSourcesTest03 {

	public static void main(String[] args) {
		IntStream.range(1, 5).forEach(System.out::print);
		
		System.out.println();
		
		IntStream.rangeClosed(1, 5).forEach(System.out::print);
	}
}
