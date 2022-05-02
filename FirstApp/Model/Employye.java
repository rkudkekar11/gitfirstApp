package com.bikkadit.FirstApp.Model;

public class Employye {
	
	private String name;
	private String Email;
	private String Cname;
	private double sal;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getCname() {
		return Cname;
	}
	public void setCname(String cname) {
		Cname = cname;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employye [name=" + name + ", Email=" + Email + ", Cname=" + Cname + ", sal=" + sal + "]";
	}
	public Employye(String name, String email, String cname, double sal) {
		super();
		this.name = name;
		Email = email;
		Cname = cname;
		this.sal = sal;
	}
	
	
	
	

}
