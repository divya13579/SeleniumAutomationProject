package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://demoqa.com/checkbox");
driver.manage().window().maximize();
driver.findElement(By.xpath("//span[@class='rct-checkbox']")).click();
	}

}
