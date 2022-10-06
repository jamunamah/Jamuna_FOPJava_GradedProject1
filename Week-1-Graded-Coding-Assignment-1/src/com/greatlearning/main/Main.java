package com.greatlearning.main;

import com.greatlearning.departments.admin.AdminDepartment;
import com.greatlearning.departments.hr.HrDepartment;
import com.greatlearning.departments.tech.TechDepartment;

public class Main {

	public static void main(String[] args) {

		// Driver Code

		HrDepartment hrDepartment = new HrDepartment();
		TechDepartment techDepartment = new TechDepartment();
		AdminDepartment adminDepartment = new AdminDepartment();

		// displaying functionalities of Admin Department
		System.out.println(getWelcomeString(adminDepartment.departmentName()));
		System.out.println(adminDepartment.getTodaysWork());
		System.out.println(adminDepartment.getWorkDeadline());

		// call method of superclass
		System.out.println(adminDepartment.isTodayAHoliday());
		System.out.println();

		// displaying functionalities of HR Department
		System.out.println(getWelcomeString(hrDepartment.departmentName()));
		System.out.println(hrDepartment.doActivity());
		System.out.println(hrDepartment.getTodaysWork());
		System.out.println(hrDepartment.getWorkDeadline());

		// call method of superclass
		System.out.println(hrDepartment.isTodayAHoliday());
		System.out.println();

		// displaying functionalities of Tech Department
		System.out.println(getWelcomeString(techDepartment.departmentName()));
		System.out.println(techDepartment.getTodaysWork());
		System.out.println(techDepartment.getWorkDeadline());
		System.out.println(techDepartment.getTechStackInformation());

		// call method of superclass
		System.out.println(techDepartment.isTodayAHoliday());

	}

	static String getWelcomeString(String departmentName) {
		return "Welcome to " + departmentName;
	}

}
