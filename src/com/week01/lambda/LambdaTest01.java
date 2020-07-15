package com.week01.lambda;

//@FunctionInterface
//Lambda gramerini @FunctionInterface ler ile kullanabiliriz
//@FunctionInterface  ler 1 tane abstract metodu olan interfacedir.
public class LambdaTest01 {
	
	public static void main(String[] args) {
		
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Runnable#Anonymous Run!!");
			}
		};
		runnable.run();
		
		// Başta yer alan parantez, ifade -> fonksiyonel interface deki metodun parametre listesi.
		Runnable runnableLambda = () -> System.out.println("Runnable#Lambda");
		runnableLambda.run();
		
		Runnable runnableLambda2 = () -> {
			System.out.println("Runnable#Lambda2 line1");
			System.out.println("Runnable#Lambda3 line2");
		}; 
		runnableLambda2.run();
	}
	
}
