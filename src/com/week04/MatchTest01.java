package com.week04;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class MatchTest01 {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("1", "monkey", "2", "horse");
		
		Predicate<String> pred = x -> Character.isLetter(x.charAt(0));
		
		System.out.println(list.stream().anyMatch(pred));
		
		System.out.println(list.stream().allMatch(pred));
	}
}
