package com.example.DateTimeChecker;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class seleniumTest {
	public static void main(String[] args) {
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
	}
}
