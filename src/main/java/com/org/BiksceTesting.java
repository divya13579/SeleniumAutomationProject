package com.org;

import org.openqa.selenium.chrome.ChromeDriver;

public class BiksceTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://biksce.com/pages/sign-in");
driver.manage().window().maximize();
	}

}
