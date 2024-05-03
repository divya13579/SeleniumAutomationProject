package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Divya Jyoti");
driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("divya123@gmail.com");
driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("Hyderabad");
driver.findElement(By.xpath("//textarea[@id='permanentAddress']")).sendKeys("Telangana");
	}

}
