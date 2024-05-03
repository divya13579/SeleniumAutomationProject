package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsProgram5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Actions a=new Actions(driver);
		WebElement account = driver.findElement(By.xpath("//span[text()='Hello, sign in']"));
		WebElement wishlist = driver.findElement(By.xpath("//span[text()='Your Wish List']"));
		a.moveToElement(account).moveToElement(wishlist).click().build().perform();
		
	}

}
