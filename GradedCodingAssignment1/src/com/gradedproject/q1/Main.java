package com.gradedproject.q1;

public class Main {

	public static void main(String[] args) {
		new SuperDepartment("Super Department", "No Work as of now", "Nil");
		HrDepartment HrDept = new HrDepartment("Welcome to HR Department", "Fill today’s timesheet and mark your attendance", "Complete by EOD");
		AdminDepartment AdminDept = new AdminDepartment("Welcome to Admin Department", "Complete your documents Submission", "Complete by EOD");
		TechDepartment TechDept = new TechDepartment("Welcome to Tech Department", "Complete coding of Module 1", "Complete by EOD");
		
		System.out.println(AdminDept.departmentName());
		System.out.println(AdminDept.getTodaysWork());
		System.out.println(AdminDept.getWorkDeadline());
		System.out.println(AdminDept.isTodayAHoliday());
		System.out.println();
			
		System.out.println(HrDept.departmentName());
		System.out.println(HrDept.doActivity());
		System.out.println(HrDept.getTodaysWork());
		System.out.println(HrDept.getWorkDeadline());
		System.out.println(HrDept.isTodayAHoliday());
		System.out.println();
		
		System.out.println(TechDept.departmentName());
		System.out.println(TechDept.getTodaysWork());
		System.out.println(TechDept.getWorkDeadline());
		System.out.println(TechDept.getTechStackInformation());
		System.out.println(TechDept.isTodayAHoliday());
	}

}
