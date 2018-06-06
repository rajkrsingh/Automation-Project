package com.qa.test;

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
public class MultiLevel_Inheritance {
	
	public static void main(String args[])
	{
		Child ch=new Child();
		ch.child();
		ch.parent();
		ch.grandParent();
	}
	

}
