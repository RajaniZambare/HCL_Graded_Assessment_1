package com.greatLearning.assignment;

public class Details {
		
		String deptName;
		String hdName = " Hr Department ";
		String tdName = " Tech Department ";
		String work;
		String deadline;
		String holiday;
		String doActivity;
		String getTechStackInformation;

void setDetails(AdminDepartment ad) {

	if(ad instanceof AdminDepartment) {
	
		AdminDepartment adept = new AdminDepartment();
		deptName = adept.deparmentName();
		work = adept.getTodaysWork();
		deadline = adept.getWorkDeadline();
		holiday = adept.isTodayAHoliday();
	}
}

void setDetails(HrDepartment hd) {

	if(hd instanceof HrDepartment) {
		
		HrDepartment hdept = new HrDepartment();
		deptName = hdept.deparmentName();
		work = hdept.getTodaysWork();
		doActivity = hdept.doActivity();
		deadline = hdept.getWorkDeadline();
		holiday = hdept.isTodayAHoliday();
	}
}	
	
void setDetails(TechDepartment td) {
	
	if(td instanceof TechDepartment) {
	
		TechDepartment tdept = new TechDepartment();
		deptName = tdept.deparmentName();
		work = tdept.getTodaysWork();
		getTechStackInformation = tdept.getTechStackInformation();
		deadline = tdept.getWorkDeadline();
		holiday = tdept.isTodayAHoliday();
	}
}


void getDetails() {
	
	//void getDetails()
	System.out.println(deptName);
	System.out.println(work);
	System.out.println(deadline);
	
	if(hdName.equals(deptName))
		System.out.println(doActivity);
	
	if(tdName.equals(deptName))
		System.out.println(getTechStackInformation);
	
	System.out.println(holiday);
	System.out.println();
	
	}
}

