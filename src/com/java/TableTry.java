package com.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableTry {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Nithya\\Eclipse workspace\\TestSele\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/table");
		driver.manage().window().maximize();
		
		List<WebElement> findElements = driver.findElements(By.xpath("//table[@name='table']"));
		for(WebElement toprint:findElements) {
			System.out.println(toprint.getText());
		}
		
	}

}
