package com.qa.test;

import org.testng.annotations.Test;

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
	@Test
	public void main()
	{
		
		ChildClass ch=new ChildClass();
		ch.parent();
		ch.child();
	}

}
