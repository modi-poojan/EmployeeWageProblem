package com.employee;

public class Employee {

	public static void main(String[] args) {
		
		double attendance =Math.floor(Math.random()*2);
		int wages;
		
		if(attendance == 1) {
			wages=160;
			System.out.println("Employee is Present\n Total Wage = " + wages);
		}
		
		else {
			wages=0;
			System.out.println("Employee is absent\n Total Wage = " + wages);
		}

	}

}
