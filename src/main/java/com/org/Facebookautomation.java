package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebookautomation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Divya Ch");
//driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("red@roses");
//driver.findElement(By.xpath("//button[@name='login']")).click();
driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
Thread.sleep(6000);
WebElement Day = driver.findElement(By.xpath("//select[@id='day']"));
Select s=new Select(Day);
s.selectByValue("1");
WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
Select t=new Select(month);
t.selectByVisibleText("Jan");
WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
Select u=new Select(year);
u.selectByValue("1991");



		
	}

}
