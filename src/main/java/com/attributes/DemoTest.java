package com.attributes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DemoTest {
	@Test(invocationCount=2)
public void demotest() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Register.html");
	driver.manage().window().maximize();
	Thread.sleep(6000);
	driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Divya");
	driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Jyoti");
	driver.findElement(By.xpath("//textarea[@rows='3']")).sendKeys("2-123 Gachibowli Ramnagarcolony Hyderabad");
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("divyajyoti818@gmail.com");
	driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9090603602");
	driver.findElement(By.xpath("//input[@value='FeMale']")).click();
	driver.findElement(By.xpath("//input[@value='Movies']")).click();
	WebElement skills = driver.findElement(By.xpath("//select[@id='Skills']"));
	Select s=new Select(skills);
	s.selectByVisibleText("Analytics");
	WebElement country = driver.findElement(By.xpath("//select[@id='countries']"));
	Select q=new Select(country);
	q.selectByVisibleText("Select Country");
	driver.findElement(By.xpath("//span[@role='combobox']")).click();
	driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("abcd@123");
	driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("abcd@123");
}
}
