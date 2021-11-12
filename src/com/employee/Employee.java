package com.employee;

public class Employee {

	public void calculate( int no_of_days, int max_hrs_in_month, int wages_per_hr){

		int  is_part_time = 1;
		int  is_full_time = 2;
		int  part_time_hrs = 4;
		int full_time_hrs = 8;
		int wage = 0;
		int days = 0;
		int hours = 0;

		while(days < no_of_days && hours < max_hrs_in_month){

				int attendance = (int)Math.floor((Math.random)*10)%3);
				switch(attendance){

				case 0:
						break;

				case is_a_part_time:
											if(hours + part_time_hrs >100){
											break;
											}
											hours += part_time_hrs;
											days++;
											break;

				case is_a_full_time:
											if(hours + full_time_hrs >100){
											break;
											}
											hours += full_time_hrs;
											days++;
											break;

				}

		}
				wage = hours * wages_per_hr;
				System.out.println(" Total wages earned = " + wage);
				System.out.println(" Total working days = " + days);
				System.out.println(" Total working hours = " + hours);

	}

}
