package com.week04.optional;

import java.util.Optional;

public class OptionalStreamTest03 {

	public static void main(String[] args) {
		
		Optional<String> opt1 = Optional.empty();
	    System.out.println(opt1.map(String::length).orElseThrow(RuntimeException::new));  
		
	}
}
