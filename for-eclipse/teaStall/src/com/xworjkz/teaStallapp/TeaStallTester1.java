package com.xworjkz.teaStallapp;

package java.
public class TeaStallTester1 {
	public String name;
	public int id;
	public TeaStallTester1(int id, String name) {
		System.out.println("TeaStallTester object is created");
		this.id = id;
		this.name = name;
		
	}
	static {
		System.out.println("static blocks are executed");
		
	}
	
	{
		System.out.println("init blocks are executed");
	}

	public static void method() {
		System.out.println("method of tester class");
	}
	public static void main (String[]args) {
		System.out.println("main method is executed");
		TeaStallTester1 test = new TeaStallTester1(1,"someone");
		System.out.println(test.id +" "+ test.name);
		System.out.println("main method ended");
		
	}
	
	
}

