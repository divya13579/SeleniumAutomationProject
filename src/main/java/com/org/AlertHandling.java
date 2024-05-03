package com.org;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://demo.automationtesting.in/Alerts.html");
driver.manage().window().maximize();
driver.findElement(By.xpath("//button[text()[contains(.,'click the button to display an  alert box:')]]")).click();
Alert abc = driver.switchTo().alert();
abc.accept();
Thread.sleep(4000);
driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']")).click();
abc.dismiss();
driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']")).click();
abc.sendKeys("Divya");
abc.accept();
	}

}
