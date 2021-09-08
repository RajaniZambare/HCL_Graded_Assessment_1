package com.greatLearning.assignment;

public class AdminDepartment extends SuperDepartment{

	//declare method departmentName of return type string
	public String deparmentName() {
		return " Admin Department  ";
	}

	//declare method getTodaysWork of return type string
	public String getTodaysWork() {
		return " Complete your documents Submission ";
	}

	//declare method getWorkDeadline of return type string
	public String getWorkDeadline() {
		return " Complete by EOD ";
	}
}
