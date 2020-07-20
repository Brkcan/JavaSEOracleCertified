package com.week02.consumer;

import java.util.function.Consumer;

public class ConsumerTest01 {

	public static void main(String[] args) {
		
		Consumer<String> printUpperCase = str -> System.out.println(str.toUpperCase());
		printUpperCase.accept("Hello");
	}

}
