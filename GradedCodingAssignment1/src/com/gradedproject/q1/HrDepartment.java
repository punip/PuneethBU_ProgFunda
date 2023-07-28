package com.gradedproject.q1;
public class HrDepartment extends SuperDepartment{

	public HrDepartment(String departmentName, String getTodaysWork, String getWorkDeadline) {
		super(departmentName, getTodaysWork, getWorkDeadline);
		// TODO Auto-generated constructor stub
	}

	public String doActivity() {
		return "Team Lunch";
	}
}
