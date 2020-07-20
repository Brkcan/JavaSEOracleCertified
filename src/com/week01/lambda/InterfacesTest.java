package com.week01.lambda;

interface Fly {
	public abstract int getWingSpan();
	
	public static final int MAX_SPEED = 100;
	
	public default void land() {
		System.out.println("Animal is landing ... ");
	}
	
	public static double calculateSpeed(float distance, double time) {
		return distance / time; 
	}
}
class Eagle implements Fly {

	@Override
	public int getWingSpan() {
		return 15;
	}	
	@Override
	public void land() {
		System.out.println("Eagle is landing ... ");
	}

}

public class InterfacesTest {
	public static void main(String[] args) {
		Fly fly = new Eagle();
		System.out.println(fly.getWingSpan());
		fly.land();
		
		
		
	}

}
