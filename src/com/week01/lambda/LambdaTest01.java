package com.week01.lambda;

public class LambdaTest01 {
	
	public static void main(String[] args) {
		
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Runnable#Anonymous Run!!");
			}
		};
		runnable.run();
		
		Runnable runnableLambda = () -> System.out.println("Runnable#Lambda");
		runnableLambda.run();
	}
	
}


// @FunctionInterface
// Lambda gramerini @FunctionInterface ler ile kullanabiliriz
// @FunctionInterface  ler 1 tane abstract metodu olan interfacedir.