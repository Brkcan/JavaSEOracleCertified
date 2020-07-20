package com.week01.lambda;

class BaseClass {
	public void foo() {
		System.out.println("BaseClass Foo...");
	}
}

interface BaseInterface {
	public default void foo () {
		System.out.println("BaseInterface Foo ...");
	}
}


// Concert sınıf ve interface olması durumunda Diamond Problem olmaz 
// Bu durumda Concert sınıf her daim kazanır.
public class DiamondProblem extends BaseClass implements BaseInterface{

	public static void main(String[] args) {
		DiamondProblem diamondProblem = new DiamondProblem();
		diamondProblem.foo();
	}

}
