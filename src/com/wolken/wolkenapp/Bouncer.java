package com.wolken.wolkenapp;

import com.wolken.wolkenapp.exceptions.PubException;

public class Bouncer {
	public void check(int age) throws PubException{
		if(age>21) {
			System.out.println("lets pawriiii");
		}
		else {
			throw new PubException();
		}
	}

}
