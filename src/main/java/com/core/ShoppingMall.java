package com.core;

public class ShoppingMall implements FoodItems,Clothing,Movies{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShoppingMall sm=new ShoppingMall();
	    sm.games();
		sm.inoxscreen3();
		sm.jeans();
		sm.mocktails();
		sm.puffs();
		sm.restaurant();
		sm.sizzlers();
		sm.shirts();
		sm.kurtis();
		sm.inoxscreen1();
	}
public void games()
{
	System.out.println("games for kids");
}
public void restaurant()
{
	System.out.println("Absolute Barbeque");
}
public void inoxscreen1() {
	// TODO Auto-generated method stub
	System.out.println("screen1");
}
public void inoxscreen2() {
	// TODO Auto-generated method stub
	System.out.println("screen2");
}
public void inoxscreen3() {
	// TODO Auto-generated method stub
	System.out.println("screen3");
}
public void shirts() {
	// TODO Auto-generated method stub
	System.out.println("shirts for men");
}
public void jeans() {
	// TODO Auto-generated method stub
	System.out.println("jeans for women");
}
public void kurtis() {
	// TODO Auto-generated method stub
	System.out.println("kurtis available");
}
public void puffs() {
	// TODO Auto-generated method stub
	System.out.println("veg puff");
}
public void sizzlers() {
	// TODO Auto-generated method stub
	System.out.println("sizzlers");
}
public void mocktails() {
	// TODO Auto-generated method stub
	System.out.println("Pina Colada");
}
}
