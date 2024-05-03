package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeFrames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
driver.manage().window().maximize();
Thread.sleep(2000);
driver.switchTo().frame("frame2");
WebElement animal = driver.findElement(By.xpath("//select[@id='animals']"));
Select s=new Select(animal);
s.selectByValue("avatar");
driver.switchTo().defaultContent();
driver.switchTo().frame("frame1");
driver.findElement(By.xpath("//input[@type='text']")).sendKeys("FramesTopic");
driver.switchTo().defaultContent();
driver.switchTo().frame("frame1").switchTo().frame("frame3");
driver.findElement(By.xpath("//input[@id='a']")).click();
	}

}
