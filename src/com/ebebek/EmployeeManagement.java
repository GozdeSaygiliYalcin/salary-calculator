package com.ebebek;

public class EmployeeManagement {
		

	public static void main(String[] args) {
		
		Employee employee1 = new Employee("gozde yalcin", 1420, 45, 2021);
		employee1.printPayroll();
		Employee employee2 = new Employee("efdal yalcin", 9000, 65, 2021);
		employee2.printPayroll();
		Employee employee3 = new Employee("boncuk yalcin", 1000, 25, 2009);
		employee3.printPayroll();
		Employee employee4 = new Employee("sutlac yalcin", 5500, 35, 2005);
		employee4.printPayroll();
	}

}
