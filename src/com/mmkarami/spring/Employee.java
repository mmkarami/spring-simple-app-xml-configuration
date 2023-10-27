package com.mmkarami.spring;

public class Employee implements Person {

	Printer<Bill> printer;
	
	public Employee(Printer<Bill> printer) {
		this.printer = printer;
	}

	@Override
	public void printBill(Bill bill) {
		printer.print(bill);
	}

}