package com.week06.suppressed.exception;

public class SuppressedExceptionTest01 {

	public static void main(String[] args) {
		
		try (Computer computer = new Computer()){
			System.out.println("try block!!!");
			throw new RuntimeException("Run Time Exception"); 
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

class Computer implements AutoCloseable{

	@Override
	public void close() throws Exception {
		System.out.println("Close");
		throw new IllegalArgumentException("IlllegalARgumentException"); // SuppressesException 
	}
	
}