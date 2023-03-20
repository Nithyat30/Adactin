package com.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Nithya\\Eclipse workspace\\TestSele\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();

		// to get particular data from table
		// List<WebElement> ref1 =
		// driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[4]/td[2]"));
		// for(WebElement data: ref1) {
		// System.out.println(data.getText());
		// }

		// to get all data from table
		List<WebElement> ref2 = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
		for (WebElement data1 : ref2) {
			System.out.println(data1.getText());
		}
	}

}
