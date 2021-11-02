package com.employee;

public class Employee {

	public static void main(String[] args) {
		
		double attendance =Math.floor(Math.random()*2);
		double partTime =Math.floor(Math.random()*2);
		int wages;
		
		if(attendance == 1) {
	   		
			if(partTime == 1) {
				
				wages=160;
				System.out.println("Employee is present & PartTime \nwages = " + wages);
			}
			else {
				
				wages=160;
				System.out.println("Employee is present & FullTime \nwages = " + wages);
			}
		}else {
	         	wages=0;
	         	System.out.println("Employee is absent \nwages = " + wages);
		}
	}

}
