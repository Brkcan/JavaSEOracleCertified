package com.week02.binary.versions;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

public class BiPredicateTest01 {

	public static void main(String[] args) {
		
		BiPredicate<List<Integer>, Integer> listContains = List::contains;
		List alist = Arrays.asList(10,20,30);
		System.out.println(listContains.test(alist, 10));

		BiPredicate<String, String> b1 = String::startsWith;
		BiPredicate<String, String> b2 = (String x, String y) -> x.startsWith(y);
		System.out.println(b1.test("Hello", "H"));
	}
}
