package com.week02.function;

import java.util.Arrays;
import java.util.function.Function;

public class FunctionUse {

	public static void main(String[] args) {
		Arrays.stream("4, 7, -18".split(", "))
		.map(Integer::parseInt)
		.map(i -> (i<0) ? -i : i)
		.forEach(System.out::println);
		
		System.out.println("----");
		
		  Function<String, Integer> lengthf1 = str -> str.length();
		  Integer l1 = lengthf1.apply("Java#");
		  System.out.println(l1);
	}

}
