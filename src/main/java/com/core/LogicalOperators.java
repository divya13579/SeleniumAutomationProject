package com.core;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=3;
		int b=5;
		int c=7;
		int d=9;
		int e=15;
		int f=14;
		int g=15;
		int h=17;          
		int i=24;
System.out.println((a>b)&&(f>e));//false&&false
System.out.println((b<c)&&(e<h));//true&&true
System.out.println((a>f)&&(g<h));//false&&true
System.out.println((d<f)&&(e==h));//true&&false
System.out.println((a>=c)&&(d<=f));//false&&true
System.out.println((i!=e)&&(g==e));//true&&true
	}

}
