package com.attributes;

import org.testng.annotations.Test;

public class FruitsTest {
@Test(priority=3)
public void mango()
{
	System.out.println("mango fruit");
}
@Test(priority=5)
public void grapes()
{
	System.out.println("grapes fruit");
}
@Test(priority=1)
public void orange()
{
	System.out.println("orange fruit");
}
@Test(priority=2)
public void banana()
{
	System.out.println("banana fruit");
}
@Test(priority=4)
public void pineapple()
{
	System.out.println("pineapple fruit");
}
}
