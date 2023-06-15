package com.example.DateTimeChecker;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DateTimeCheckerGridTest {
	@Test
	public void test1() {
		try {
			DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
			desiredCapabilities.setBrowserName("chrome");
			desiredCapabilities.setPlatform(Platform.WIN10);
			
			WebDriver webDriver = new RemoteWebDriver(new URL("http://10.86.5.255:4444/wd/hub"), desiredCapabilities);
			webDriver.manage().window().maximize();
			webDriver.get("http://localhost:3000/");
			webDriver.findElement(By.id("inputDay")).sendKeys("30");
			webDriver.findElement(By.id("inputMonth")).sendKeys("2");
			webDriver.findElement(By.id("inputYear")).sendKeys("2016");
			
			webDriver.findElement(By.id("checkBtn")).click();
			Thread.sleep(1000);
			
//			Alert alert = webDriver.switchTo().alert();
//			
//			String result = alert.getText();
//			alert.accept();
//			
//			webDriver.switchTo().defaultContent();
			
			String day = webDriver.findElement(By.id("inputDay")).getAttribute("value");
			String month = webDriver.findElement(By.id("inputMonth")).getAttribute("value");
			String year = webDriver.findElement(By.id("inputYear")).getAttribute("value");
			String result = webDriver.findElement(By.id("result")).getText();
			
			assertEquals(day + "/" + month + "/" + year + " is not correct date time !", result);
			webDriver.quit();
		} catch (MalformedURLException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void test2() {
		try {
			DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
			desiredCapabilities.setBrowserName("chrome");
			desiredCapabilities.setPlatform(Platform.WIN10);
			
			WebDriver webDriver = new RemoteWebDriver(new URL("http://10.86.5.255:4444/wd/hub"), desiredCapabilities);
			webDriver.manage().window().maximize();
			webDriver.get("http://localhost:3000/");
			webDriver.findElement(By.id("inputDay")).sendKeys("30");
			webDriver.findElement(By.id("inputMonth")).sendKeys("2");
			webDriver.findElement(By.id("inputYear")).sendKeys("2016");
			
			webDriver.findElement(By.id("checkBtn")).click();
			Thread.sleep(1000);
//			
//			Alert alert = webDriver.switchTo().alert();
//			
//			String result = alert.getText();
//			alert.accept();
//			
//			webDriver.switchTo().defaultContent();
			String day = webDriver.findElement(By.id("inputDay")).getAttribute("value");
			String month = webDriver.findElement(By.id("inputMonth")).getAttribute("value");
			String year = webDriver.findElement(By.id("inputYear")).getAttribute("value");
			String result = webDriver.findElement(By.id("result")).getText();
			
			assertEquals(day + "/" + month + "/" + year + " is correct date time !", result);
			webDriver.quit();
		} catch (MalformedURLException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
