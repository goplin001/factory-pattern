package com.gop.factory.impl;

import com.gop.factory.Factory;
import com.gop.service.impl.AmericanSalary;
import com.gop.service.impl.BaseSalary;

public class AmericanFactory extends Factory {

	@Override
	public BaseSalary creBaseSalary() {
		// TODO Auto-generated method stub
		return new AmericanSalary();
	}

}
