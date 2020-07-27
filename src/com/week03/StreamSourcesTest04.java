package com.week03;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamSourcesTest04 {

	public static void main(String[] args) {
		IntStream intSt = Arrays.stream(new int[] {1,2,3,4,5,6});
		
		Stream<Integer> stream = Arrays.stream(new Integer[] {1,2,34,5,6});
	
		new Random().ints().limit(5).forEach(System.out::println);
		
	}
}
