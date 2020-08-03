package com.week04.primitive;

import java.util.stream.DoubleStream;

public class DoubleStreamTest01 {

	public static void main(String[] args) {
		DoubleStream doubleStream = DoubleStream.of(2.3, 4, 5.6, 21);
		doubleStream.forEach(System.out::println);
		
		System.out.println("---------");
		DoubleStream doubleStream2 = DoubleStream.generate(Math::random);
		doubleStream2.limit(5).forEach(System.out::println);
	}
}
