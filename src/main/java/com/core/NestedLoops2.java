package com.core;

public class NestedLoops2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=2;i++)             //i=2;2<=2
		{                                 //j=1;1>=1
			for(int j=3;j>=1;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
