package com.week02.supplier;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierTest03 {

	public static void main(String[] args) {
		Supplier<String> s1 = () -> new String("test");
		
				Stream.generate(s1)
				.limit(4)
				.forEach(System.out::println);
		
		Supplier<String> s2 = String::new;
		
	}
	
}
