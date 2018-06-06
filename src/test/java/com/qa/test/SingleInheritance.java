package com.qa.test;

class ParentClass
{
	public void parent()
	{
		 System.out.println("This is master class");
	}
}

class ChildClass extends ParentClass
{
	public void child()
	{
		System.out.println("This is child class");
	}
}

public class SingleInheritance {
	
	public static void main(String args[])
	{
		
		ChildClass ch=new ChildClass();
		ch.parent();
		ch.child();
	}

}
