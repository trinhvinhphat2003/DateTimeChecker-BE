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
public class DateTimeCheckerUnitTestsCheckDate {
	@InjectMocks
	private MasterController masterController;

	@Test
	@DisplayName("UTCID01")
	void UTCID01() {
		Integer day = 29;
		Integer month = 2;
	    Integer year = 2000;
	    boolean expectedChecking = true;
	    
	    boolean actualChecking = masterController.isCorrectDateTime(day, month, year);
	    System.out.println("actual output of UTCID01: " + actualChecking);
	    
	    Assertions.assertEquals(expectedChecking, actualChecking);
	}
	
	@Test
	@DisplayName("UTCID02")
	void UTCID02() {
		Integer day = 29;
		Integer month = 2;
	    Integer year = 2009;
	    boolean expectedChecking = false;
	    
	    boolean actualChecking = masterController.isCorrectDateTime(day, month, year);
	    System.out.println("actual output of UTCID02: " + actualChecking);
	    
	    Assertions.assertEquals(expectedChecking, actualChecking);
	}
	
	@Test
	@DisplayName("UTCID03")
	void UTCID03() {
		Integer day = 31;
		Integer month = 2;
	    Integer year = 2020;
	    boolean expectedChecking = false;
	    
	    boolean actualChecking = masterController.isCorrectDateTime(day, month, year);
	    System.out.println("actual output of UTCID03: " + actualChecking);
	    
	    Assertions.assertEquals(expectedChecking, actualChecking);
	}
	
	@Test
	@DisplayName("UTCID04")
	void UTCID04() {
		Integer day = 29;
		Integer month = 3;
	    Integer year = 2000;
	    boolean expectedChecking = true;
	    
	    boolean actualChecking = masterController.isCorrectDateTime(day, month, year);
	    System.out.println("actual output of UTCID04: " + actualChecking);
	    
	    Assertions.assertEquals(expectedChecking, actualChecking);
	}
	
	@Test
	@DisplayName("UTCID05")
	void UTCID05() {
		Integer day = 29;
		Integer month = 3;
	    Integer year = 2009;
	    boolean expectedChecking = true;
	    
	    boolean actualChecking = masterController.isCorrectDateTime(day, month, year);
	    System.out.println("actual output of UTCID05: " + actualChecking);
	    
	    Assertions.assertEquals(expectedChecking, actualChecking);
	}
	
	@Test
	@DisplayName("UTCID06")
	void UTCID06() {
		Integer day = 29;
		Integer month = 3;
	    Integer year = 2020;
	    boolean expectedChecking = true;
	    
	    boolean actualChecking = masterController.isCorrectDateTime(day, month, year);
	    System.out.println("actual output of UTCID06: " + actualChecking);
	    
	    Assertions.assertEquals(expectedChecking, actualChecking);
	}
	
	@Test
	@DisplayName("UTCID07")
	void UTCID07() {
		Integer day = 30;
		Integer month = 2;
	    Integer year = 2000;
	    boolean expectedChecking = false;
	    
	    boolean actualChecking = masterController.isCorrectDateTime(day, month, year);
	    System.out.println("actual output of UTCID07: " + actualChecking);
	    
	    Assertions.assertEquals(expectedChecking, actualChecking);
	}
	
	@Test
	@DisplayName("UTCID08")
	void UTCID08() {
		Integer day = 30;
		Integer month = 2;
	    Integer year = 2009;
	    boolean expectedChecking = false;
	    
	    boolean actualChecking = masterController.isCorrectDateTime(day, month, year);
	    System.out.println("actual output of UTCID08: " + actualChecking);
	    
	    Assertions.assertEquals(expectedChecking, actualChecking);
	}
	
	@Test
	@DisplayName("UTCID09")
	void UTCID09() {
		Integer day = 30;
		Integer month = 2;
	    Integer year = 2020;
	    boolean expectedChecking = false;
	    
	    boolean actualChecking = masterController.isCorrectDateTime(day, month, year);
	    System.out.println("actual output of UTCID09: " + actualChecking);
	    
	    Assertions.assertEquals(expectedChecking, actualChecking);
	}
	
	@Test
	@DisplayName("UTCID010")
	void UTCID010() {
		Integer day = 31;
		Integer month = 4;
	    Integer year = 2000;
	    boolean expectedChecking = false;
	    
	    boolean actualChecking = masterController.isCorrectDateTime(day, month, year);
	    System.out.println("actual output of UTCID010: " + actualChecking);
	    
	    Assertions.assertEquals(expectedChecking, actualChecking);
	}
	
	@Test
	@DisplayName("UTCID011")
	void UTCID011() {
		Integer day = 31;
		Integer month = 4;
	    Integer year = 2009;
	    boolean expectedChecking = false;
	    
	    boolean actualChecking = masterController.isCorrectDateTime(day, month, year);
	    System.out.println("actual output of UTCID011: " + actualChecking);
	    
	    Assertions.assertEquals(expectedChecking, actualChecking);
	}
	
	@Test
	@DisplayName("UTCID012")
	void UTCID012() {
		Integer day = 31;
		Integer month = 4;
	    Integer year = 2020;
	    boolean expectedChecking = false;
	    
	    boolean actualChecking = masterController.isCorrectDateTime(day, month, year);
	    System.out.println("actual output of UTCID012: " + actualChecking);
	    
	    Assertions.assertEquals(expectedChecking, actualChecking);
	}
	
	@Test
	@DisplayName("UTCID013")
	void UTCID013() {
		Integer day = 29;
		Integer month = 2;
	    Integer year = 2020;
	    boolean expectedChecking = true;
	    
	    boolean actualChecking = masterController.isCorrectDateTime(day, month, year);
	    System.out.println("actual output of UTCID013: " + actualChecking);
	    
	    Assertions.assertEquals(expectedChecking, actualChecking);
	}
	
	@Test
	@DisplayName("UTCID014")
	void UTCID014() {
		Integer day = 29;
		Integer month = 2;
	    Integer year = 1000;
	    boolean expectedChecking = false;
	    
	    boolean actualChecking = masterController.isCorrectDateTime(day, month, year);
	    System.out.println("actual output of UTCID014: " + actualChecking);
	    
	    Assertions.assertEquals(expectedChecking, actualChecking);
	}
	
	@Test
	@DisplayName("UTCID015")
	void UTCID015() {
		Integer day = 29;
		Integer month = 2;
	    Integer year = 3000;
	    boolean expectedChecking = false;
	    
	    boolean actualChecking = masterController.isCorrectDateTime(day, month, year);
	    System.out.println("actual output of UTCID015: " + actualChecking);
	    
	    Assertions.assertEquals(expectedChecking, actualChecking);
	}
}
