package com.poly;

public class India implements VeicalDetails {
public void weliding () {
	System.out.println("work");
}
	@Override
	public void bike() {
System.out.println("cbz");
		
	}

	@Override
	public void car() {
	System.out.println("adi");
	}
	public static void main(String[] args) {
		India i =new India();
		i.bike();
		i.car();
		i.weliding();
		VeicalDetails o =new India();
		o.bike(); 
	}
	
	

}
