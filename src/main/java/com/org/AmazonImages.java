package com.org;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonImages {
public static ChromeDriver driver;
public static int i=0;

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		 driver=new ChromeDriver();
		 AmazonImages ai=new AmazonImages();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Account & Lists']")).click();
		Thread.sleep(2000);
		ai.snap();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("9090603602");
		ai.snap();
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("haridiv@13579");
		ai.snap();
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		Thread.sleep(3000);
		ai.snap();
	}
public void snap() throws IOException
{
	Random r=new Random();
	if(r.nextInt()!=0)
	{
	i=i+1;
	File src = driver.getScreenshotAs(OutputType.FILE);
	File dest=new File(".//images//pic"+i+".png");
    FileUtils.copyFile(src, dest);
	}
}
}
