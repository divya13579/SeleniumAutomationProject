package com.org;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class BiksceImages {
public static ChromeDriver driver;
public static int i=0;

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		driver=new ChromeDriver();
		BiksceImages bki=new BiksceImages();
		driver.get("https://biksce.com/pages/sign-in");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("dandh");
		Thread.sleep(3000);
		bki.snap();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Krishna@14");
		bki.snap();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		bki.snap();
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
