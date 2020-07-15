package com.week01.lambda;

public class LambdaTest02 {

	public static void main(String[] args) {
		
		Calculater calculater = (int x, int y) -> {
			System.out.println(x+y);
			return x+y;
		};
		calculater.operation(5, 6);
		
		// 2. kullanım şekli 
		Calculater calculater2 = (m, n) -> m - n;
		System.out.println(calculater2.operation(10, 4));
		
		// 2. kullanımda return keyword kelimesi kullanılma durumunda süslü parantez zorunlu 
		// Lambdasız kullanım
		Calculater calculater3 = new Calculater() {
			
			@Override
			public int operation(int number, int number2) {
				if(number == 10 ) {
					System.out.println("Olmadı");
					
				}
				return number * number2;
			}
		};
		System.out.println(calculater3.operation(10, 9));
	}

}
// 1 tane olmak zorunda, kendisi yada super interface
// Birden fazla abstract metodu olamaz, eger @FunctionInterface ise
// Static yada default method olabilir
@FunctionalInterface
interface Calculater {
	
	public abstract int operation(int number, int number2);
}
