package com.qa.test;

import org.testng.annotations.Test;

class GrandFather
{
	public void grandParent()
	{
		System.out.println("This is Grand Parent Class");
	}
}

class Father extends GrandFather
{
	public void parent()
	{
		System.out.println("This is Parent Class");
	}
}

class Child extends Father
{
	public void child()
	{
		System.out.println("This is Child Class");
	}
}

public class MultiLevel_Inheritance 
{
	@Test
	public void testInhertance()
	{
		Child ch=new Child();
		ch.child();
		ch.parent();
		ch.grandParent();
		System.out.println("Test");
	}
}
