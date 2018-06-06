package com.qa.test;

class A
{
	int x=10;
}

public class InheritanceTest extends A {
	int y=5;
	public static void main(String args[])
	{
		InheritanceTest b1=new InheritanceTest();
		System.out.println("Parent class:"+b1.x);
		System.out.println("Child class:"+b1.y);
	}


}


