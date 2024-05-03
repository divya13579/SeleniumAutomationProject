package com.org;

import org.openqa.selenium.chrome.ChromeDriver;

public class Linkedin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.linkedin.com/signup");
driver.manage().window().maximize();
	}

}
