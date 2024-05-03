package com.attributes;

import org.testng.annotations.Test;

public class SuperMarketFruits {
	@Test(dependsOnMethods= {"banana"})
	public void mango()
	{
		System.out.println("mango fruit");
	}
	@Test(dependsOnMethods= {"pineapple"})
	public void grapes()
	{
		System.out.println("grapes fruit");
	}
	@Test
	public void orange()
	{
		System.out.println("orange fruit");
	}
	@Test(dependsOnMethods= {"orange"})
	public void banana()
	{
		System.out.println("banana fruit");
	}
	@Test(dependsOnMethods= {"mango"})
	public void pineapple()
	{
		System.out.println("pineapple fruit");
	}
}
