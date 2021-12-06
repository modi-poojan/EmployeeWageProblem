package com.employee;

import java.util.ArrayList;

public interface EmpWageInterface {
	
	public void calculate(CompanyEmpWage call, String company, int no_of_days, int max_hrs_in_month, int wages_per_hr);
	
	public ArrayList<CompanyEmpWage> getEmpCollection();
	
	public void setEmpCollection( ArrayList<CompanyEmpWage> empCollection);
}
