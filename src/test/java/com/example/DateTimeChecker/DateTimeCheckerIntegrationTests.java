package com.example.DateTimeChecker;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.event.annotation.AfterTestMethod;
import org.springframework.test.context.event.annotation.BeforeTestMethod;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

@SpringJUnitConfig
@SpringBootTest
class DateTimeCheckerIntegrationTests {
	
	@Test
	@DisplayName("incorrect date time")
	void testInCorrect() throws InterruptedException {
		WebDriver webDriver = WebDriverManager.chromedriver()
				.capabilities (new ChromeOptions().addArguments("--remote-allow-origins=*"))
				.create();
		
		webDriver.get("http://localhost:3000/");
		
		webDriver.findElement(By.id("inputDay")).sendKeys("30");
		webDriver.findElement(By.id("inputMonth")).sendKeys("2");
		webDriver.findElement(By.id("inputYear")).sendKeys("2016");
		
		webDriver.findElement(By.id("checkBtn")).click();
		Thread.sleep(1000);
		
		Alert alert = webDriver.switchTo().alert();
		
		String result = alert.getText();
		alert.accept();
		
		webDriver.switchTo().defaultContent();
		String day = webDriver.findElement(By.id("inputDay")).getAttribute("value");
		String month = webDriver.findElement(By.id("inputMonth")).getAttribute("value");
		String year = webDriver.findElement(By.id("inputYear")).getAttribute("value");
		assertEquals(day + "/" + month + "/" + year + " is not correct date time !", result);
	}
	
	@Test
	@DisplayName("correct date time")
	void testCorrect() throws InterruptedException {
		WebDriver webDriver = WebDriverManager.chromedriver()
				.capabilities (new ChromeOptions().addArguments("--remote-allow-origins=*"))
				.create();
		
		
		webDriver.get("http://localhost:3000/");
		
		webDriver.findElement(By.id("inputDay")).sendKeys("29");
		webDriver.findElement(By.id("inputMonth")).sendKeys("2");
		webDriver.findElement(By.id("inputYear")).sendKeys("2016");
		
		webDriver.findElement(By.id("checkBtn")).click();
		Thread.sleep(1000);
		
		Alert alert = webDriver.switchTo().alert();
		
		String result = alert.getText();
		alert.accept();
		
		webDriver.switchTo().defaultContent();
		String day = webDriver.findElement(By.id("inputDay")).getAttribute("value");
		String month = webDriver.findElement(By.id("inputMonth")).getAttribute("value");
		String year = webDriver.findElement(By.id("inputYear")).getAttribute("value");
		assertEquals(day + "/" + month + "/" + year + " is correct date time !", result);
	}
	
	@Test
	@DisplayName("test day not in range")
	void testDayNotInRange() throws InterruptedException {
		WebDriver webDriver = WebDriverManager.chromedriver()
				.capabilities (new ChromeOptions().addArguments("--remote-allow-origins=*"))
				.create();
		
		
		webDriver.get("http://localhost:3000/");
		
		webDriver.findElement(By.id("inputDay")).sendKeys("40");
		webDriver.findElement(By.id("inputMonth")).sendKeys("2");
		webDriver.findElement(By.id("inputYear")).sendKeys("2016");
		
		webDriver.findElement(By.id("checkBtn")).click();
		Thread.sleep(1000);
		
		Alert alert = webDriver.switchTo().alert();
		
		String result = alert.getText();
		alert.accept();
		
		webDriver.switchTo().defaultContent();
		String day = webDriver.findElement(By.id("inputDay")).getAttribute("value");
		String month = webDriver.findElement(By.id("inputMonth")).getAttribute("value");
		String year = webDriver.findElement(By.id("inputYear")).getAttribute("value");
		assertEquals("day is not in range", result);
	}
	
	@Test
	@DisplayName("test day not in correct format")
	void testDayNotInCorrectFormat() throws InterruptedException {
		WebDriver webDriver = WebDriverManager.chromedriver()
				.capabilities (new ChromeOptions().addArguments("--remote-allow-origins=*"))
				.create();
		
		
		webDriver.get("http://localhost:3000/");
		
		webDriver.findElement(By.id("inputDay")).sendKeys("4e");
		webDriver.findElement(By.id("inputMonth")).sendKeys("2");
		webDriver.findElement(By.id("inputYear")).sendKeys("2016");
		
		webDriver.findElement(By.id("checkBtn")).click();
		Thread.sleep(1000);
		
		Alert alert = webDriver.switchTo().alert();
		
		String result = alert.getText();
		alert.accept();
		
		webDriver.switchTo().defaultContent();
		String day = webDriver.findElement(By.id("inputDay")).getAttribute("value");
		String month = webDriver.findElement(By.id("inputMonth")).getAttribute("value");
		String year = webDriver.findElement(By.id("inputYear")).getAttribute("value");
		assertEquals("day is not in correct formart", result);
	}
	//lab 2 test check date in month
	

}
