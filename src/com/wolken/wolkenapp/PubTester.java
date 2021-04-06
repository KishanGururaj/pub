package com.wolken.wolkenapp;

import com.wolken.wolkenapp.exceptions.PubException;

public class PubTester {
	public static void main(String[] args) {
		System.out.println("main method entered");
		Bouncer bouncer=new Bouncer();
		try {
			bouncer.check(22);
		} catch (PubException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			
		}
	
		Bouncer bouncer1=new Bouncer();
		try {
			bouncer1.check(12);
		} catch (PubException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.toString());
		}
		System.out.println("main ended");
		
	}

}
