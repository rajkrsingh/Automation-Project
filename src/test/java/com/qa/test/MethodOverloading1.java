package com.qa.test;

class Adder
{
	static int add(int a, int b)
	{
		return a+b;
	}
	static double add(double a, double b)
	{
		return a+b;
	}
}
public class MethodOverloading1 {
	public static void main(String args[])
	{
		System.out.println(Adder.add(50,100));
		System.out.println(Adder.add(10.5,30.5));
	}

}
