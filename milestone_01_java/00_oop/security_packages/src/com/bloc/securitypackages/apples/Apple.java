package com.bloc.securitypackages.apples; 

import com.bloc.securitypackages.Color;
import com.bloc.securitypackages.Fruit;

abstract class Apple extends Fruit {
	
	public Apple(String name, int calories, Color color, double weight) { //same as fruit pass params to..
		super(name, calories, color, weight); //fruit 
	}  

	abstract void bite();

}
