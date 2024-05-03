package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsProgram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement userName = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement password = driver.findElement(By.xpath("//input[@name='pass']"));
		Actions a=new Actions(driver);
		//a.moveToElement(userName).sendKeys("Divya").build().perform();
		//a.moveToElement(password).sendKeys("divya123").build().perform();
		a.sendKeys(userName, "Divya").build().perform();
		a.sendKeys(password, "divya123").build().perform();
	}

}
