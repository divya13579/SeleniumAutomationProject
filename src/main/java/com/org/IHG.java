package com.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IHG {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.ihg.com/rewardsclub/gb/en/enrollment/join");
driver.manage().window().maximize();
//driver.findElement(By.id("firstName")).sendKeys("Divya");
//driver.findElement(By.id("lastName")).sendKeys("Jyoti");
//driver.findElement(By.id("email")).sendKeys("divyajyoti818@gmail.com");
//driver.findElement(By.id("confirmEmail")).sendKeys("divyajyoti818@gmail.com");
//driver.findElement(By.id("password")).sendKeys("abcd@123");
//driver.findElement(By.id("confirmPassword")).sendKeys("abcd@123");
//driver.findElement(By.id("address1")).sendKeys("2-123gachibowli");
//driver.findElement(By.id("address2")).sendKeys("Ramnagarcolony");
//driver.findElement(By.id("city")).sendKeys("Hyderabad");
//driver.findElement(By.id("zipCode")).sendKeys("500049");
Thread.sleep(6000);
WebElement country = driver.findElement(By.xpath("//select[@id='country']"));
Select s=new Select(country);
s.selectByVisibleText("Antarctica");
List<WebElement> all = s.getOptions();
for(WebElement each:all)
{
    System.out.println(each.getText());
   }
	}
}
