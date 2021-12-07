package com.employee;

import java.util.ArrayList;

public class CompanyEmpWage {

	ArrayList<Integer> dailywage = new ArrayList<Integer>();
	int totalWage;
	String company;

	public CompanyEmpWage(String company) {
		super();
		this.company = company;
		// this.totalWage = totalWage;
	}

	public ArrayList<Integer> getDailywage() {
		return dailywage;
	}

	public void setDailywage(ArrayList<Integer> dailywage) {
		this.dailywage = dailywage;
	}

	public CompanyEmpWage(int totalWage) {
		super();
		this.totalWage = totalWage;
	}

	public int getTotalWage() {
		return totalWage;
	}

	public void setTotalWage(int totalWage) {
		this.totalWage = totalWage;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "EmpWageBuilder [Company=" + company + "\tTotalWage=" + totalWage + "\t DailyWage " + dailywage +  "]";
	}

}
