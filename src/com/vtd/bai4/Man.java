package com.vtd.bai4;

public class Man extends People implements Husband, Staff, Friend {

	private String name = "Thanh nien nghiem tuc";

	 public void getMarried() {
	        System.out.println(name + " got married.");
	    }

	    @Override
	    public void takeWifeOut() {
	        System.out.println(name + " is taking his wife to go swimming.");
	    }

	    @Override
	    public void goDrinkingBeer() {
	        System.out.println(name + " is going drinking with friends.");
	    }

	    @Override
	    public void dedicationForCompany() {
	        System.out.println(name + " is dedicating himself to the company.");
	    }
}
