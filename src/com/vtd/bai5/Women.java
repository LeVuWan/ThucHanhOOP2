package com.vtd.bai5;

public class Women extends Angel implements Holy, Impatient, Sinister {
	private String name = "Thị Nở";

	public void hurtOthers() {
		System.out.println(name + " is hurting others...");
	}

	@Override
	public void killAnts() {
		System.out.println(name + " killed ants.");
	}

	@Override
	public void smileAtStrangers() {
		System.out.println(name + " smiled at strangers.");
	}

	@Override
	public void kickThePotOfTea() {
		System.out.println(name + " kicked the pot of tea.");
	}

	@Override
	public void dance() {
		System.out.println("Dancing...");
	}

	@Override
	public void sing() {
		System.out.println("Singing...");
	}
}
