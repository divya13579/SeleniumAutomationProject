package com.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
driver.manage().window().maximize();
driver.findElement(By.xpath("//button[@id='menu1']")).click();
Thread.sleep(5000);
List<WebElement> all = driver.findElementsByXPath("//a[@role='menuitem']");
for(WebElement each:all) {
	if(each.getText().equals("JavaScript"))
	{
		each.click();
	}
}
	
	
	}

}
