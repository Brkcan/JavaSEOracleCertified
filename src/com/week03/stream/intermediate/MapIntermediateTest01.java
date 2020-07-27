package com.week03.stream.intermediate;

import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class MapIntermediateTest01 {

	public static void main(String[] args) {
		Stream.of(1,2,3,4,5,6,7).map(i -> i * i).forEach(System.out::println);
		
		double sumValue = DoubleStream.of(1.0, 4, 9.0).map(Math::sqrt).peek(System.out::println).sum();
		System.out.println(sumValue);
	}
}
