package com.org;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmWindowsHandling {
public static Iterator<String> it;
public static Set<String> all;	
public static String parent,facebook,linkedin;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		driver.findElement(By.xpath("(//a[@target='_blank'])[2]")).click();
		Thread.sleep(5000);
		Set<String> all = driver.getWindowHandles();
		Iterator<String> it = all.iterator();
		while(it.hasNext())
		{
			String facebook = it.next();
			if(!parent.equals(facebook))
				{
				driver.switchTo().window(facebook);
				}
			}
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("facebook email");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("password");
		driver.switchTo().window(parent);
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("(//a[@target='_blank'])[1]")).click();
		all = driver.getWindowHandles();
		it = all.iterator();
		while(it.hasNext())
		{
			linkedin = it.next();
			if(!parent.equals(linkedin))
			{
				driver.switchTo().window(linkedin);
			}
		}
		Thread.sleep(4000);
		System.out.println(driver.getTitle());
		driver.switchTo().window(parent);
		System.out.println(driver.getTitle());
		
	}

}
