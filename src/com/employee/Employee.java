package com.employee;

public class Employee {

	public static void main(String[] args) {
		
		double attendance =Math.floor(Math.random()*2);
		
		if(attendance == 1) {
			System.out.println("Employee is Present");
		}
		
		else {
			System.out.println("Employee is absent");
		}

	}

}
