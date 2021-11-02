package com.employee;

public class Employee {

	public static void main(String[] args) {
		
		double attendance =Math.floor(Math.random()*2);
		double partTime =Math.floor(Math.random()*2);
		int exp =0;
		int wages;
		
		if(attendance == 1) {
	   		
			if(partTime == 1) {
    	   		
    	   		exp=1;
    	   }
    	    else {
    	    
    	    	 exp=2;
    	    }
       }else {
    	     exp=0;
    	    }
     
       switch(exp) {
       
       		case 0:
       			wages=0 * 20 ;
       			System.out.println("Employee is absent \nwages = " + wages);
    
       		case 1:
       			wages=160 *20 ;
       			System.out.println("Employee is present & PartTime \nwages = " + wages);

       		case 2:
       			wages=160 * 20 ;
       			System.out.println("Employee is present & FullTime \nwages = " + wages);

       		} 
		}

}
