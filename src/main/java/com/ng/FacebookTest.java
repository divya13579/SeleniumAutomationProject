package com.ng;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FacebookTest {
@Test
	public void fb()
{
	System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
}
}
