package com.org;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmWindows2 {
	public static Set<String> all;
	public static Iterator<String> it;
	public static String parent,facebook,linkedIn;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
					ChromeDriver driver=new ChromeDriver();
					driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
					driver.manage().window().maximize();
					System.out.println(driver.getTitle());
					System.out.println(driver.getCurrentUrl());
					Thread.sleep(5000);
					WebElement user = driver.findElement(By.xpath("//input[@name='username']"));
					user.sendKeys("Admin");
					WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
					password.sendKeys("admin123");
					parent = driver.getWindowHandle();
					System.out.println(parent);
					WebElement fbIcon = driver.findElement(By.xpath("(//a[@target='_blank'])[2]"));
					fbIcon.click();
					 all = driver.getWindowHandles();
					 it = all.iterator();
					while(it.hasNext())
					{
						facebook = it.next();
						if(!parent.equals(facebook))
						{
							driver.switchTo().window(facebook);
						}
					}
					System.out.println(driver.getTitle());
					Thread.sleep(5000);
					WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
					email.sendKeys("FacebookEmail");
					WebElement fbpass = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
					fbpass.sendKeys("Testing");
					driver.switchTo().window(parent);
					System.out.println(driver.getTitle());
					WebElement linkIcon = driver.findElement(By.xpath("(//a[@target='_blank'])[1]"));
					linkIcon.click();
					 all = driver.getWindowHandles();
					 it = all.iterator();
					while(it.hasNext())
					{
						linkedIn = it.next();
						if(!parent.equals(linkedIn))
						{
							driver.switchTo().window(linkedIn);
						}
					}
					System.out.println(driver.getTitle());
					driver.switchTo().window(facebook);
					System.out.println(driver.getTitle());
				}

			
	}

