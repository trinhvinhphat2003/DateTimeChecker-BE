package com.example.DateTimeChecker;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.example.DateTimeChecker.controller.MasterController;

@SpringJUnitConfig
@SpringBootTest
public class DateTimeCheckerUnitTestsCheckDateInMonth {
	@InjectMocks
	private MasterController masterController;

	@Test
	@DisplayName("UTCID01")
	void UTCID01() {
		Integer month = 2;
	    Integer year = 2020;
	    int expectedDays = 29;
	    
	    int actualDays = masterController.checkDateInMonth(month, year);
	    System.out.println("actual output of UTCID01: " + actualDays);
	    
	    Assertions.assertEquals(expectedDays, actualDays);
	}

	@Test
	@DisplayName("UTCID02")
	void UTCID02() {
		Integer month = 2;
	    Integer year = 2021;
	    int expectedDays = 28;
	    
	    int actualDays = masterController.checkDateInMonth(month, year);
	    System.out.println("actual output of UTCID02: " + actualDays);
	    
	    Assertions.assertEquals(expectedDays, actualDays);
	}

	@Test
	@DisplayName("UTCID03")
	void UTCID03() {
		Integer month = 2;
	    Integer year = 1000;
	    int expectedDays = 28;
	    
	    int actualDays = masterController.checkDateInMonth(month, year);
	    System.out.println("actual output of UTCID03: " + actualDays);
	    
	    Assertions.assertEquals(expectedDays, actualDays);
	}
	
	@Test
	@DisplayName("UTCID04")
	void UTCID04() {
		Integer month = 2;
	    Integer year = -100;
	    int expectedDays = 0;
	    
	    int actualDays = masterController.checkDateInMonth(month, year);
	    System.out.println("actual output of UTCID04: " + actualDays);
	    
	    Assertions.assertEquals(expectedDays, actualDays);
	}
	
	@Test
	@DisplayName("UTCID05")
	void UTCID05() {
		Integer month = 1;
	    Integer year = 2021;
	    int expectedDays = 31;
	    int actualDays = masterController.checkDateInMonth(month, year);
	    System.out.println("actual output of UTCID05: " + actualDays);
	    Assertions.assertEquals(expectedDays, actualDays);
	}
	
	@Test
	@DisplayName("UTCID06")
	void UTCID06() {
		Integer month = 1;
	    Integer year = 9001;
	    int expectedDays = 0;
	    
	    int actualDays = masterController.checkDateInMonth(month, year);
	    System.out.println("actual output of UTCID06: " + actualDays);
	    
	    Assertions.assertEquals(expectedDays, actualDays);
	}
	
	@Test
	@DisplayName("UTCID07")
	void UTCID07() {
		Integer month = 1;
	    Integer year = 1000;
	    int expectedDays = 31;
	    
	    int actualDays = masterController.checkDateInMonth(month, year);
	    System.out.println("actual output of UTCID07: " + actualDays);
	    
	    Assertions.assertEquals(expectedDays, actualDays);
	}
	
	@Test
	@DisplayName("UTCID08")
	void UTCID08() {
		Integer month = 2;
	    Integer year = 9001;
	    int expectedDays = 0;
	    
	    int actualDays = masterController.checkDateInMonth(month, year);
	    System.out.println("actual output of UTCID08: " + actualDays);
	    
	    Assertions.assertEquals(expectedDays, actualDays);
	}
	
	@Test
	@DisplayName("UTCID09")
	void UTCID09() {
		Integer month = null;
	    Integer year = 2020;
	    int expectedDays = -1;
	    
	    int actualDays = masterController.checkDateInMonth(month, year);
	    System.out.println("actual output of UTCID09: " + actualDays);
	    
	    Assertions.assertEquals(expectedDays, actualDays);
	}
	
	@Test
	@DisplayName("UTCID010")
	void UTCID010() {
		Integer month = null;
	    Integer year = 2021;
	    int expectedDays = -1;
	    
	    int actualDays = masterController.checkDateInMonth(month, year);
	    System.out.println("actual output of UTCID010: " + actualDays);
	    
	    Assertions.assertEquals(expectedDays, actualDays);
	}
	
	@Test
	@DisplayName("UTCID011")
	void UTCID011() {
		Integer month = null;
	    Integer year = 1000;
	    int expectedDays = -1;
	    
	    int actualDays = masterController.checkDateInMonth(month, year);
	    System.out.println("actual output of UTCID011: " + actualDays);
	    
	    Assertions.assertEquals(expectedDays, actualDays);
	}
	
	@Test
	@DisplayName("UTCID012")
	void UTCID012() {
		Integer month = null;
	    Integer year = -100;
	    int expectedDays = -1;
	    
	    int actualDays = masterController.checkDateInMonth(month, year);
	    System.out.println("actual output of UTCID012: " + actualDays);
	    
	    Assertions.assertEquals(expectedDays, actualDays);
	}
	
	@Test
	@DisplayName("UTCID013")
	void UTCID013() {
		Integer month = 14;
	    Integer year = 2021;
	    int expectedDays = 0;
	    
	    int actualDays = masterController.checkDateInMonth(month, year);
	    System.out.println("actual output of UTCID013: " + actualDays);
	    
	    Assertions.assertEquals(expectedDays, actualDays);
	}
	
	@Test
	@DisplayName("UTCID014")
	void UTCID014() {
		Integer month = -5;
	    Integer year = 2021;
	    int expectedDays = 0;
	    
	    int actualDays = masterController.checkDateInMonth(month, year);
	    System.out.println("actual output of UTCID014: " + actualDays);
	    
	    Assertions.assertEquals(expectedDays, actualDays);
	}
	
	@Test
	@DisplayName("UTCID015")
	void UTCID015() {
		Integer month = 1;
	    Integer year = -100;
	    int expectedDays = 0;
	    
	    int actualDays = masterController.checkDateInMonth(month, year);
	    System.out.println("actual output of UTCID015: " + actualDays);
	    
	    Assertions.assertEquals(expectedDays, actualDays);
	}
}
