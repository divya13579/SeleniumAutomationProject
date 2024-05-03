package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
//driver.findElement(By.id("email")).sendKeys("Divya Ch");
//driver.findElement(By.name("pass")).sendKeys("red@roses");
//driver.findElement(By.tagName("button")).click();
//driver.findElement(By.linkText("Forgotten account?")).click();
//driver.findElement(By.partialLinkText("Forgotten")).click();
//driver.findElement(By.xpath("//*[@name='email']")).sendKeys("Divya Ch");
//driver.findElement(By.xpath("//a[text()='Forgotten account?']")).click();
//driver.findElement(By.xpath("//input[@name='email' and @id='email']")).sendKeys("Divya Ch");
//driver.findElement(By.xpath("//a[text()[contains(.,'Forgotten account?')]]")).click();
driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
Thread.sleep(6000);
WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
Select s=new Select(day);
s.selectByValue("5");
WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
Select p=new Select(month);
p.selectByValue("9");
WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
Select q=new Select(year);
q.selectByValue("2000");

	}
}
