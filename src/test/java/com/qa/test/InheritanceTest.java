package com.qa.test;

import org.testng.annotations.Test;


class A
{
	int x=10;
}

public class InheritanceTest extends A {
	int y=5;
	
	public void main()
	{
		InheritanceTest b1=new InheritanceTest();
		System.out.println("Parent class:"+b1.x);
		System.out.println("Child class:"+b1.y);
		System.out.println("testttt");
	}


}


