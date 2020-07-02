package com.visionit.calc;

public class CalcApp {
	
	static int num1;
	static int num2;
	static int result;
	
	public static void add() {
		result = num1 + num2;
	}
	
	public static void sub() {
		result = num1 - num2;
	}
	
	public static void main(String[] args) {
		num1=5;
		num2=10;
		add();
		System.out.println("Addition : " + result);
		sub(); 
		System.out.println("Sub : " + result);
		
	}

}
