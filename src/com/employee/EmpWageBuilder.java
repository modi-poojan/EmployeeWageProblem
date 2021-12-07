package com.employee;

import java.util.ArrayList;

public class EmpWageBuilder implements EmpWageInterface  {

	
	public ArrayList<CompanyEmpWage> EmpCollection = new ArrayList<>();

	@Override
	public ArrayList<CompanyEmpWage> getEmpCollection() {
		return EmpCollection;
	}

	@Override
	public void setEmpCollection(ArrayList<CompanyEmpWage> empCollection) {
		EmpCollection = empCollection;
	}

	@Override
	public void calculate(CompanyEmpWage call, String company, int no_of_days, int max_hrs_in_month, int wages_per_hr) {

		final int PARTTIME = 1;
		final int FULLTIME = 2;
		int partTimeHrs = 4;
		int fullTimeHrs = 8;
		int totalwage = 0;
		int days = 0;
		int hours = 0;
		ArrayList<Integer> temp = call.getDailywage();

		while (days < no_of_days && hours < max_hrs_in_month) {

			int attendance = (int) Math.floor((Math.random()) * 10) % 3;
			switch (attendance) {

			case PARTTIME:
				if (hours + partTimeHrs > max_hrs_in_month) {

					break;
				}
				hours += partTimeHrs;
				temp.add(partTimeHrs * wages_per_hr);
				break;

			case FULLTIME:
				if (hours + fullTimeHrs > max_hrs_in_month) {
					break;
				}
				hours += fullTimeHrs;
				temp.add(fullTimeHrs * wages_per_hr);
				break;

			case 0:
				break;

			}
			days++;

		}
		call.setDailywage(temp);
		totalwage = hours * wages_per_hr;
		System.out.println(" \nCompany = " + company);
		System.out.println(" \nTotal wages earned = " + totalwage);
		System.out.println(" \nTotal working days = " + days);
		System.out.println(" \nTotal working hours = " + hours);

		call.setTotalWage(totalwage);
	}
	
	public void companyTotalWage( String company) {
		
		for (int i = 0; i< EmpCollection.size(); i++) {
			String name = EmpCollection.get(i).getCompany();
			if(name.equals(company)) {
				int totalWage = EmpCollection.get(i).getTotalWage();
				System.out.println("Total Wage for Company "+company+" is "+totalWage);
			}
		}
			
	}
}
