package com.week04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SortedTest01 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Burak", "Can", "Anna");
		List<String> filtered = new ArrayList<>();
		for (String name : list) {
			if(name.length() == 4) {
				filtered.add(name);
			}
		}
		Collections.sort(filtered);
		Iterator<String> iter = filtered.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		
		list.stream().filter(n -> n.length() == 5).sorted().limit(4).forEach(System.out::println);
	}
}
