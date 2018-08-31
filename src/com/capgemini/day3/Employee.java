package com.capgemini.day3;

public class Employee {
	private long empid;
	private String empname;
	private double basicSalary;
	private double medical;
	private  double pf;
	private  double hra;
	private double grossSalary;
	private double netSalary;
	 
	public static final double pt = 200;
	 public Employee() {
	 }
	 
	public  Employee(int empid,String empname,double basicsalary,double medical) {
		this.empid = empid;
		this.empname = empname;
		this.basicSalary = basicsalary;
		this.medical = medical;
		
	}
	public double calculateNetSalary() {

		 hra = basicSalary*0.5;
		 pf=basicSalary*0.12;
		grossSalary= hra + basicSalary + medical;
		netSalary=grossSalary-(pf+pt);
			return netSalary;
	}
}
