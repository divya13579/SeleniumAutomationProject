package com.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomationDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://demo.automationtesting.in/Register.html");
driver.manage().window().maximize();
Thread.sleep(6000);
driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Divya");
driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Jyoti");
driver.findElement(By.xpath("//textarea[@rows='3']")).sendKeys("2-123 Gachibowli Ramnagarcolony Hyderabad");
driver.findElement(By.xpath("//input[@type='email']")).sendKeys("divyajyoti818@gmail.com");
driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9090603602");
driver.findElement(By.xpath("//input[@value='FeMale']")).click();
driver.findElement(By.xpath("//input[@value='Movies']")).click();
WebElement skills = driver.findElement(By.xpath("//select[@id='Skills']"));
Select s=new Select(skills);
s.selectByVisibleText("Analytics");
WebElement country = driver.findElement(By.xpath("//select[@id='countries']"));
Select q=new Select(country);
q.selectByVisibleText("Select Country");
driver.findElement(By.xpath("//span[@role='combobox']")).click();
List<WebElement> all = driver.findElements(By.xpath("//li[@role='treeitem']"));  
for(WebElement each:all)
{
	if(each.getText().equals("Bangladesh"))
	{ 
		each.click();
		break;
	}
}
WebElement year = driver.findElement(By.xpath("//select[@placeholder='Year']"));
Select u=new Select(year);
u.selectByValue("2000");
WebElement month = driver.findElement(By.xpath("//select[@placeholder='Month']"));
Select v=new Select(month);
v.selectByVisibleText("February");
WebElement day = driver.findElement(By.xpath("//select[@placeholder='Day']"));
Select w=new Select(day);
w.selectByValue("3");
driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("abcd@123");
driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("abcd@123");
driver.findElement(By.xpath("//button[@name='signup']")).click();

	}

}
