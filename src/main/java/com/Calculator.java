package com;

public class Calculator implements Calculations 
{

	@Override
	public long add(long a, long b) {
		
		return a+b;
	}

	@Override
	public long substract(long a, long b) {
		return a-b;
	}

	@Override
	public long mul(long a, long b) {
		return a*b;
	}

	@Override
	public long div(long a, long b) {
		return a/b;
	}
	
}
