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
		System.out.println("mul: " + simple_calc.mul(12, 6));
		System.out.println("div: " + simple_calc.div(12, 6));
		
		System.out.println();
		
		System.out.println("add: " + simple_calc.add(64, 6));
		System.out.println("sub: " + simple_calc.substract(74, 6));
		System.out.println("mul: " + simple_calc.mul(453, 6));
		System.out.println("div: " + simple_calc.div(233, 6));
	}

}
