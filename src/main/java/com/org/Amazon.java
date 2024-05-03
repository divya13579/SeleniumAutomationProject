package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
WebDriverWait wait=new WebDriverWait(driver,30);
//driver.get("https://www.amazon.in/");
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
WebElement password = driver.findElement(By.xpath("//button[@name='login']/following::a"));
String value = password.getText();
System.out.println(value);
	}

}
