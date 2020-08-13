package com.week06.trywithresource;

public class TryWithResourcesTest02 {

	public static void main(String[] args) {
		
		try (Computer computer = new Computer()){
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
	}
}

class Computer implements AutoCloseable{

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	
}