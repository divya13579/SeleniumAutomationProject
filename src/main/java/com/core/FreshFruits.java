package com.core;

public class FreshFruits extends Vegetables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FreshFruits fs=new FreshFruits();
		fs.apple();
		fs.cabbage();
		fs.carrot();
		fs.pomogranate();
		fs.tomato();
		fs.potato();
	}
public void orange()
{
	System.out.println("orange is sweet");
}
public void apple()
{
	System.out.println("apple is red");
}
public void pomogranate()
{
	System.out.println("pomogranate is tasty");
}
@Override
public void tomato() {
	// TODO Auto-generated method stub
	System.out.println("tomato");
}
@Override
public void potato() {
	// TODO Auto-generated method stub
	System.out.println("potato");
}
}
