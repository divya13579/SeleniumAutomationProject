package com.core;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator ca=new Calculator();	
int hr = ca.sum();
System.out.println(hr);
int ed = ca.sub();
System.out.println(ed);
int fs = ca.mul();
System.out.println(fs);
int me = ca.div();
System.out.println(me);
	}
public int sum()
{
	int a=10;
	int b=5;
	int c=a+b;
return c;
}
public int sub()
{
	int d=12;
	int e=7;
	int f=d-e;
	return f;
}
public int mul()
{
	int j=3;
	int k=4;
	int l=j*k;
	return l;
}
public int div()
{
	int x=8;
	int y=4;
	int z=x/y;
	return z;
}
}
