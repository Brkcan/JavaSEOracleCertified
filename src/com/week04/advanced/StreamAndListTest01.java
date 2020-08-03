package com.week04.advanced;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamAndListTest01 {

	public static void main(String[] args) {
		
		List<String> cats = new ArrayList<String>();
		cats.add("Pakize");
		cats.add("Bambu");
		
		Stream<String> stream = cats.stream();
		
		cats.add("Yummy");
		
		stream.forEach(System.out::println);
		
	}
}
