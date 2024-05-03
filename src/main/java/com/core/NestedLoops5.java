package com.core;

public class NestedLoops5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=1;i<=4;i++)                   //i=4;4<=4
{
for(int j=1;j<=5-i;j++)                 //j=1;1<=1
{
System.out.print(j+" ");                //1 2 3 4 
}                                       //1 2 3
System.out.println();                   //1 2
}                                       //1
	}

}
