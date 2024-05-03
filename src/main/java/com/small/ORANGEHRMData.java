package com.small;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ORANGEHRMData {
@Test(dataProvider="Authentication")
	public  void hrm(String data1, String data2)
			throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
driver.manage().window().maximize();
Thread.sleep(5000);
driver.findElement(By.xpath("//input[@name='username']")).sendKeys(data1);
driver.findElement(By.xpath("//input[@type='password']")).sendKeys(data2);
driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

@DataProvider(name="Authentication")
public Object[][] credentials()
{
	return new Object[][] {{"Admin","admin123"},{"Ravi","Abcd123"}};
}
}
