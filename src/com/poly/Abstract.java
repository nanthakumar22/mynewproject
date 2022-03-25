package com.poly;

public   class Abstract extends EmpDetails {

	@Override
	public void furniture() {
System.out.println("44");
		
	}

	@Override
	public void empCount() {
	System.out.println("77");
		
	}
public static void main(String[] args) {
	Abstract a = new Abstract();
	a.empCount();
	a.furniture();
	a.recipe();
}
}
