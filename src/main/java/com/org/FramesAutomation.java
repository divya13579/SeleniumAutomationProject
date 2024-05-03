package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesAutomation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//driver.switchTo().frame("singleframe");
		WebElement border = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
		driver.switchTo().frame(border);
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Divya");
	}

}
