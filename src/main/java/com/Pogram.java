package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Pogram {

	@Autowired
	public void start() 
	{
		
		Calculator simple_calc = new Calculator();
		
		System.out.println("add: " + simple_calc.add(12, 6));
		System.out.println("sub: " + simple_calc.substract(12, 6));
		System.out.println("add: " + simple_calc.mul(12, 6));
		System.out.println("add: " + simple_calc.div(12, 6));
	}

}