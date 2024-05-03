package com.ng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NumbersTest {
@Test
public void one()
{
	System.out.println("number one");
}
@AfterMethod
public void two() {
	System.out.println("number two");
}
@BeforeMethod
public void three()
{
	System.out.println("number three");
}
@AfterClass
public void four()
{
	System.out.println("number four");
}
@BeforeClass
public void five()
{
	System.out.println("number five");
}
@AfterTest
public void six()
{
	System.out.println("number six");
}
@BeforeTest
public void seven()
{
	System.out.println("number seven");
}
@AfterSuite
public void eight()
{
	System.out.println("number eight");
}
@BeforeSuite
public void nine()
{
	System.out.println("number nine");
}
}
