package com.gl.driver;

import com.gl.model.AdminDepartment;
import com.gl.model.HrDepartment;
import com.gl.model.SuperDepartment;
import com.gl.model.TechDepartment;

public class DriverClass {

	public static void main(String[] args) {
		//Creating object of Admin Department
		SuperDepartment superDepartment = new SuperDepartment();
		AdminDepartment adminDepartment = new AdminDepartment();
		HrDepartment hrDepartment = new HrDepartment();
		TechDepartment techDepatment = new TechDepartment();
		
		System.out.println("Welcome to "+ adminDepartment.departmentName());
		System.out.println(adminDepartment.getTodaysWork());
	    System.out.println(adminDepartment.getWorkDeadline());
	    System.out.println(adminDepartment.isTOdayHoliday());
	    System.out.println("");
	    System.out.println("---------------------------------------");
	    System.out.println("");
	    
		//Creating object of HR Department
		System.out.println("Welcome to "+ hrDepartment.departmentName());
		System.out.println(hrDepartment.doActivity());
		System.out.println(hrDepartment.getTodaysWork());
		System.out.println(hrDepartment.getWorkDeadline());
		System.out.println(hrDepartment.isTOdayHoliday());
		System.out.println("");
	    System.out.println("---------------------------------------");
	    System.out.println("");
	    
		//Creating object of Tech Department
	    System.out.println("Welcome to "+ techDepatment.departmentName());
	    System.out.println(techDepatment.getTodaysWork());
	    System.out.println(techDepatment.getWorkDeadline());
	    System.out.println(techDepatment.getTechStackInformation());
	    System.out.println(techDepatment.isTOdayHoliday());

	}

}
