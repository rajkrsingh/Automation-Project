package com.qa.test;

class Animal
{
	 void sound()
	{
		System.out.println("Diffrent type of Sounds");
	}
}

class Cat extends Animal
{
	 void meoo()
	{
		System.out.println("Cat sounds like meoooo");
	}
}

class Dog extends Animal
{
	void bark()
	{
		System.out.println("Dog sounds like bark");
	}
}
public class HierarchicalInheritance {
	
	public static void main(String args[])
	{
		Dog d=new Dog();
		Cat c=new Cat();
		d.bark();
		d.sound();
		c.meoo();
		c.sound();
		
	}
	

}
