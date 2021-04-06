package com.wolken.wolkenapp.exceptions;

public class PubException extends Exception{
	@Override 
	public String getMessage() {
		return"Get message  Due to age not allowed";
	}
	
	@Override
	public String toString() {
		return "toString method entered";
		
	}

}
