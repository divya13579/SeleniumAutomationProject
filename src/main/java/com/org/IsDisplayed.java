package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		WebElement male = driver.findElement(By.xpath("(//input[@name='radiooptions'])[1]"));
		System.out.println("Before Click "+male.isSelected());
		System.out.println("Before Click "+male.isDisplayed());
		System.out.println("Before Click "+male.isEnabled());
		male.click();
		System.out.println("After Click "+male.isSelected());
		System.out.println("After Click "+male.isDisplayed());
		System.out.println("After Click "+male.isEnabled());
		

   }

}
