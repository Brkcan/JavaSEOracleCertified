package com.week02.binary.versions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerTest01 {

	public static void main(String[] args) {
		
		BiConsumer<List<Integer>, Integer> listAddElement = List::add;
		List alist = new ArrayList();
		listAddElement.accept(alist, 10);
		System.out.println(alist);
	}
}
