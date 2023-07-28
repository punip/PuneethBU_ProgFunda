package com.gradedproject.q1;

public class SuperDepartment {

	String departmentName;
	String getTodaysWork;
	String getWorkDeadline;
	
	public SuperDepartment(String departmentName, String getTodaysWork, String getWorkDeadline) {
		super();
		this.departmentName = departmentName;
		this.getTodaysWork = getTodaysWork;
		this.getWorkDeadline = getWorkDeadline;
	}
	
	public String departmentName() {
		return departmentName;
	}

	public String getTodaysWork() {
		return getTodaysWork;
	}

	public String getWorkDeadline() {
		return getWorkDeadline;
	}

	public String isTodayAHoliday() {
		return "Today is not a Holiday";
	}
	
}


