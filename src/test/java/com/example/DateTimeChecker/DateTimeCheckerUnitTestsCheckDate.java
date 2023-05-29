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
		Integer month = 1;
	    Integer year = 2020;
	    int expectedDays = 31;
	    
	    int actualDays = masterController.checkDateInMonth(month, year);
	    
	    Assertions.assertEquals(expectedDays, actualDays);
	}
}
