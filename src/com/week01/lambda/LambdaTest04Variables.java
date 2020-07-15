package com.week01.lambda;

public class LambdaTest04Variables {

	int number;
	
	public static void main(String[] args) {
		
		String localVariables = "Burak";
		//localVariables = "Test";
		// Local degişlene 2 kere assigment yaptık bu durumda effectively final özelliğini kaybeder.
		// Bu durumda lambda ifadesinde local değişkeni kullanamayız
		// local değişken ya final olacak ya da effectively final olacak
		
		
		// Instance değişkenlerde istenilen kadar assignment yapılabilir 
		LambdaTest04Variables lambdaTest04Variables = new LambdaTest04Variables();
		lambdaTest04Variables.number = 10;
		lambdaTest04Variables.number = 20; 
		
		LambdaMessage lambdaMessage = (String str) -> {
			System.out.println(localVariables + str + lambdaTest04Variables.number);
		};
		lambdaMessage.printMessage("Can");
	}

}

@FunctionalInterface
interface LambdaMessage {
	public abstract void printMessage(String message);
}