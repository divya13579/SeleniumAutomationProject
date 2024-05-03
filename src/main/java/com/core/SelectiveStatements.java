package com.core;

public class SelectiveStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10;
int b=6;
if(b>a)
{
	System.out.println("B is big");
}
int c=15;
int d=8;
if(c>d)
{
	System.out.println("C is big");
}
int p=200;
int q=1000;
if(p>q)
{
	System.out.println("P is big");
}
else
{
	System.out.println("Q is big");
}
int e=100;
int f=500;
int g=2000;
if((e>f)&&(e>g))
{
	System.out.println("E is big");
}
else if((f>e)&&(f>g))
{
	System.out.println("F is big");
}
else
{
	System.out.println("G is big");
}
	
	}

}
