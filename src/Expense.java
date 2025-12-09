package com.expensetracker;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;



//Represents a single expense entry with date, amount and category.


public class Expense{
	//Fields
	private LocalDate date;
	private double amount;
	private String category;
	private String description;

	//Date formatting constant
	private static final DateTimeFormatter DATE_FORMATTER=DateTimeFormatter.ofPattern("yyyy-M-dd");

	//2. Contructor
	public Expense(LocalDate date,double amount,String category,String description){
		this.date=date;
		this.amount=amount;
		this.category=category;
		this.description=description;
	}

	// Getters
	public LocalDate getDate(){
	return date;
	}

	public double getAmount(){
	return amount;
	}

	public String getCategory(){
	return category;
	}

	
	//Utility method for Display
	@Override
	public String toString(){
	return String.format("| %s | %-10.2f | %-15s | %s",
			date.format(DATE_FORMATTER),
			amount,
			category,
			description);
	}


	//Utility method for File I/O - CSV format
	public String toCSV(){
	return String.format(
			"%s,%.2f,%s,%s",
			date.format(DATE_FORMATTER),
			amount,
			category,
			description.replaceAll(",",";"));
	}
	

}
