package com.employee;

import java.util.Scanner;

public class Test{

	public static void main(String[] args){

	Employee obj = new Employee();
	Scanner input = new Scanner(System.in);

	System.out.print(" Please enter the max no of working days in a month: ");
	int no_of_days = input.nextInt();

	System.out.print(" Please enter the max no fo working hours in a month: ");
	int max_hrs_in_month = input.nextInt();

	System.out.print(" Please enter the wages per hour: ");
	int wages_per_hour = input.nextInt();

	obj.calculate( no_of_days, max_hrs_in_month, wages_per_hour);
}

}
