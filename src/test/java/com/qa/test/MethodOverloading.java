package com.qa.test;

class Addition
{
	int sum;
	void summ(int a, int b)
	{
		sum=a+b;
		System.out.println("Sum of 2 numbers:"+sum);
	}
	
	void summ(int a,int b, int c)
	{
		sum=a+b+c;
		System.out.println("Sum of 3 numbers:"+sum);
	}
}
public class MethodOverloading {

	 public static void main(String args[])
	 {
		 Addition add=new Addition();
		 add.summ(10, 20);
		 add.summ(10, 20, 30);
	 }
}
