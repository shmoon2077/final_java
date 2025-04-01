package com.company.ioctest;

public class MyArea {
	private String name;
	private Calc calc;
	
	public String mycalc (int d1, int d2) {
		return name + ">" + calc.exec(d1,d2);
	}
	
	public MyArea() { super();  }
	public MyArea(String name, Calc calc) {
		super();
		this.name = name;
		this.calc = calc;
	}
	
	@Override
	public String toString() {
		return "MyArea [name=" + name + ", calc=" + calc + "]";
	}
	
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public Calc getCalc() { return calc; }
	public void setCalc(Calc calc) { this.calc = calc; }
	
	

}
