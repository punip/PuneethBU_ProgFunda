package com.gradedproject.q1;

public class TechDepartment extends SuperDepartment {
	
	public TechDepartment(String departmentName, String getTodaysWork, String getWorkDeadline) {
		super(departmentName, getTodaysWork, getWorkDeadline);
		// TODO Auto-generated constructor stub
	}

	public String getTechStackInformation () {
		return "Core Java";
	}

}
