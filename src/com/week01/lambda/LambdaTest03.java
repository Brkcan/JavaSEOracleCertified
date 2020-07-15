package com.week01.lambda;

public class LambdaTest03 {

	public static void main(String[] args) {
		Message message = (String str) -> {
			System.out.println("Message " + str);
		};
		message.printMessage("hoşgeldiniz...");
	}

}

@FunctionalInterface
interface Message {
	
	public abstract void printMessage(String msg);
}
