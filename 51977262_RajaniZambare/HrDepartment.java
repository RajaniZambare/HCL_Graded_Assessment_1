package com.greatLearning.assignment;

public class HrDepartment extends SuperDepartment{

	//declare method departmentName of return type string
	public String deparmentName() {
		return " Hr Department ";
	}

	//declare method getTodaysWork of return type string
	public String getTodaysWork() {
		return " Fill todays worksheet and mark your attendance ";
	}

	//declare method doActivity of return type string
	public String doActivity(){
		return " Team Lunch ";
	}
	
	//declare method getWorkDeadline of return type string
	public String getWorkDeadline() {
		return " Complete by EOD ";
	}
}
