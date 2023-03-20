package com.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.seleniumhq.jetty9.io.ssl.SslClientConnectionFactory;

public class Dropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Nithya\\Eclipse workspace\\TestSele\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();

		WebElement findElement = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select s = new Select(findElement);
		Thread.sleep(2000);

		s.selectByVisibleText("Beauty");
		Thread.sleep(2000);
		s.selectByIndex(2);
		Thread.sleep(2000);
		s.selectByValue("search-alias=baby");
		Thread.sleep(2000);

		WebElement findElement3 = driver
				.findElement(By.xpath("//span[@class='icp-nav-flag icp-nav-flag-in icp-nav-flag-lop']"));
		findElement3.click();
		Thread.sleep(2000);

		driver.close();

		System.setProperty("webdriver.chrome.driver",
				"D:\\Nithya\\Eclipse workspace\\TestSele\\Driver\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://demoqa.com/select-menu");
		driver1.manage().window().maximize();

		WebElement findElement2 = driver1.findElement(By.xpath("//select[@id='cars']"));
		Select s1 = new Select(findElement2);
		s1.selectByIndex(2);
		s1.selectByVisibleText("Volvo");
		s1.selectByValue("audi");
		Thread.sleep(3000);

		s1.deselectAll();

	}

}
