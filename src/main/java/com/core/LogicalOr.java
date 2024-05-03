package com.core;

public class LogicalOr {

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
		System.out.println((a<d)||(c<f));//true||true
		System.out.println((e!=g)||(d<=h));//false||true
		System.out.println((e>f)||(g<f));//true||false
		System.out.println((i==h)||(f>=h));//false||false

	}

}
