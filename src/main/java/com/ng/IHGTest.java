package com.ng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IHGTest {
	@Test
public void ihg() {
	System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.ihg.com/rewardsclub/gb/en/enrollment/join");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Divya");
	driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Jyoti");
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("divyajyoti818@gmail.com");
	driver.findElement(By.xpath("//input[@id='confirmEmail']")).sendKeys("divyajyoti818@gmail.com");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("abcd@123");
	driver.findElement(By.xpath("//input[@id='confirmPassword']")).sendKeys("abcd@123");
	driver.findElement(By.xpath("//input[@formcontrolname='address1']")).sendKeys("2-123gachibowli");
	driver.findElement(By.xpath("//input[@formcontrolname='address2']")).sendKeys("Ramnagarcolony");
	driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Hyderabad");
	driver.findElement(By.xpath("//input[@id='state']")).sendKeys("Telangana");
	driver.findElement(By.xpath("//input[@id='zipCode']")).sendKeys("500049");
	driver.findElement(By.xpath("//label[@for='ageCertify']")).click();
	driver.findElement(By.xpath("//label[@for='termsAndConditions']")).click();
}
}
