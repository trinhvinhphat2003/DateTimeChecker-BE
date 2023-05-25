package com.example.DateTimeChecker.controller;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.DateTimeChecker.DTO.CheckingDTO;

@RestController
@RequestMapping("/api/")
public class MasterController {
	@PostMapping("get")
	public String handleCheking(@RequestBody CheckingDTO dto) {
		//check pattern
		if(!dto.getDay().matches("^[0-9]+$")) {
			return "day is not in correct formart";
		}
		if(!dto.getMonth().matches("^[0-9]+$")) {
			return "month is not in correct formart";
		}
		if(!dto.getYear().matches("^[0-9]+$")) {
			return "year is not in correct formart";
		}
		if(!(Integer.valueOf(dto.getDay()) >= 1 && Integer.valueOf(dto.getDay()) <= 31)) {
			return "day is not in range";
		}
		if(!(Integer.valueOf(dto.getMonth()) >= 1 && Integer.valueOf(dto.getMonth()) <= 12)) {
			return "month is not in range";
		}
		if(!(Integer.valueOf(dto.getYear()) >= 1000 && Integer.valueOf(dto.getYear()) <= 3000)) {
			return "year is not in range";
		}
		
		if(isCorrectDateTime(Integer.valueOf(dto.getDay()), Integer.valueOf(dto.getMonth()), Integer.valueOf(dto.getYear()))) 
			return dto.getDay() + "/" + dto.getMonth() + "/" + dto.getYear() + " is correct date time !";
		else
			return dto.getDay() + "/" + dto.getMonth() + "/" + dto.getYear() + " is not correct date time !";
			
		
	}
	

	private boolean isCorrectDateTime(Integer day, Integer month, Integer year) {
		ArrayList<Integer> monthHave30 = new ArrayList<>();
		monthHave30.add(4);
		monthHave30.add(6);
		monthHave30.add(9);
		monthHave30.add(11);
		if(monthHave30.contains(Integer.valueOf(month))) {
			if(day >30) return false;
		}
		if(month == 2) {
			if(!isLeapYear(year)) {
				if(day > 28)  return false;
			} else {
				if(day > 29)  return false;
			}
		}
		return true;
	}


	private boolean isLeapYear(Integer year) {
		if(year % 400 == 0) return true;
		else if(year % 100 == 0) return false;
		else if(year % 4 == 0) return true;
		return false;
	}
}