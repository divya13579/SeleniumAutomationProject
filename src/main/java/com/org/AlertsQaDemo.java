package com.org;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsQaDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://demoqa.com/alerts");
driver.manage().window().maximize();
Thread.sleep(2000);
driver.findElement(By.xpath("//button[@id='alertButton']")).click();
Alert jkl = driver.switchTo().alert();
jkl.accept();
driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
Thread.sleep(7000);
jkl.accept();
Thread.sleep(3000);
driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
jkl.dismiss();
driver.findElement(By.xpath("//button[@id='promtButton']")).click();
jkl.sendKeys("Divya");
jkl.accept();


	}

}
