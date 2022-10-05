package com.greatlearning.fop.codingassignment1;

public class Main {

	public static void main(String[] args) {

		// Driver Code

		HrDepartment h = new HrDepartment();
		TechDepartment t = new TechDepartment();
		AdminDepartment a = new AdminDepartment();

		// displaying functionalities of Admin Department
		System.out.println(getWelcomeString(a.departmentName()));
		System.out.println(a.getTodaysWork());
		System.out.println(a.getWorkDeadline());

		// call method of superclass
		System.out.println(a.isTodayAHoliday());
		System.out.println();

		// displaying functionalities of HR Department
		System.out.println(getWelcomeString(h.departmentName()));
		System.out.println(h.doActivity());
		System.out.println(h.getTodaysWork());
		System.out.println(h.getWorkDeadline());

		// call method of superclass
		System.out.println(h.isTodayAHoliday());
		System.out.println();

		// displaying functionalities of Tech Department
		System.out.println(getWelcomeString(t.departmentName()));
		System.out.println(t.getTodaysWork());
		System.out.println(t.getWorkDeadline());
		System.out.println(t.getTechStackInformation());

		// call method of superclass
		System.out.println(t.isTodayAHoliday());

	}

	static String getWelcomeString(String departmentName) {
		return "Welcome to " + departmentName;
	}

}
