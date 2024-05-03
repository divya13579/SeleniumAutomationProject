package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mybenchlist {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://mybenchlist.com/");
		driver.manage().window().maximize();
		Thread.sleep(6000);
driver.findElement(By.xpath("//a[text()='CLICK HERE']")).click();
Thread.sleep(6000);
WebElement accounts = driver.findElement(By.xpath("//select[@name='industry_ID']"));
Select s=new Select(accounts);
s.selectByVisibleText("Banking");
	}

}
