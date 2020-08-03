package com.week04;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectTest02 {

	public static void main(String[] args) {
		Map<String, Integer> nameLength = Stream.of("Arnold", "Alois", "Schwarzzenegger")
				.collect(Collectors.toMap(name -> name, name -> name.length()));
		nameLength.forEach((name,len) -> System.out.printf("%s - %d \n", name, len));
	}
}
