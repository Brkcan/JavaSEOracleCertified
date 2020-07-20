package com.week02.supplier;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierTest02 {

	public static void main(String[] args) {
		Supplier<String> s1 =  () -> "Test";
		System.out.println(s1.get());
		
		Supplier<Integer> s2 = () -> 100;
		Stream.generate(s2)
		.limit(3)
		.forEach(System.out::println);
//		System.out.println(s2.get());
	}
}
