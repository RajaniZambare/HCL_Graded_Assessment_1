package com.greatLearning.assignment;

public class Main {
			
	
	public static void main(String[] args) {
		
				Details deptDetails = new Details();
				
				// create the object of AdminDepartment and use all the methods 
				AdminDepartment ad = new AdminDepartment();
				deptDetails.setDetails(ad);
				deptDetails.getDetails();
				System.out.println("--------------Admin Department Details Are Close---------------");
				System.out.println();
		
				
				// create the object of Hr Department and use all the methods 
				HrDepartment hd = new HrDepartment();
				deptDetails.setDetails(hd);
				deptDetails.getDetails();
				System.out.println("--------------Hr Department Details Are Close---------------");
				System.out.println();
				
				// create the object of TechDepartment and use all the methods 
				TechDepartment td = new TechDepartment();
				deptDetails.setDetails(td);
				deptDetails.getDetails();
				System.out.println("--------------Tech Department Details Are Close---------------");
				System.out.println();
	}

}
