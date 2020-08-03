package com.week04.optional;

import java.util.Optional;

public class OptionalChainingTest04 {

	public static void main(String[] args) {
		Optional<Integer> opt = Optional.of(123);
		threeDigit(opt);
		threedigitFonksiyonal(opt);
	}
	
	public static void threeDigit(Optional<Integer> optional) {
		if(optional.isPresent()) {
			Integer num = optional.get();
			String string = num.toString();
			if(string.length() == 3) {
				System.out.println(string);
			}
		}
	}
	public static void threedigitFonksiyonal(Optional<Integer> optional) {
		optional.map(n -> n.toString()).filter(s -> s.length() == 3).ifPresent(System.out::println);
	}
}
