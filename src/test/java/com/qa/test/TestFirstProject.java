package com.qa.test;

import org.testng.annotations.Test;

public class TestFirstProject {

@Test
public void sum()
{
  int a=10;
  int b=20;
  int summ;
  summ=a+b;
  
  System.out.println("Addition result:"+summ);
}

@Test
public void sub()
{
  int a=10;
  int b=20;
  int subb;
  subb=b-a;
  
  System.out.println("Substraction result:" +subb);
}
@Test
public void mul()
{
  int a=10;
  int b=20;
  int mull;
  mull=a*b;
  
  System.out.println("Multipication result:" +mull);
}
@Test
public void div()
{
  int a=10;
  int b=20;
  int divv;
  divv=b/a;
  
  System.out.println("Division Result:" +divv);
}


}

