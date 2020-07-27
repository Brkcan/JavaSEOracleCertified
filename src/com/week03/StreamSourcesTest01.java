package com.week03;

import java.util.stream.IntStream;

public class StreamSourcesTest01 {

	public static void main(String[] args) {
		
		 IntStream.range(1, 10).forEach(System.out::println);
		
		 IntStream.iterate(1, i -> i+1).limit(5).forEach(System.out::println);
		
		 
//		int array[] = {1,2,3,4,5,6};
//		for (int i : array) {
//			System.out.println(i);
//		}
	}
}
