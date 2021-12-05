package com.employee;

public class Employee {

	public void calculate(String company, int no_of_days, int max_hrs_in_month, int wages_per_hr) {

		final int PARTTIME = 1;
		final int FULLTIME = 2;
		int partTimeHrs = 4;
		int fullTimeHrs = 8;
		int wage = 0;
		int days = 0;
		int hours = 0;

		while (days < no_of_days && hours < max_hrs_in_month) {

			int attendance = (int) Math.floor((Math.random()) * 10) % 3;
			switch (attendance) {

			case PARTTIME:
				if (hours + partTimeHrs > max_hrs_in_month) {
					break;
				}
				hours += partTimeHrs;
				
				break;

			case FULLTIME:
				if (hours + fullTimeHrs > max_hrs_in_month) {
					break;
				}
				hours += fullTimeHrs;
				
				break;
				
			case 0:
				break;

			}
			days++;
			
			
		}
		wage = hours * wages_per_hr;
		System.out.println(" Company = "+company);
		System.out.println(" Total wages earned = " + wage);
		System.out.println(" Total working days = " + days);
		System.out.println(" Total working hours = " + hours);

	}

}
