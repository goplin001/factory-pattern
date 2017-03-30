package com.gop.service.impl;

import com.gop.constant.Constant;

public class AmericanSalary extends BaseSalary {

	@Override
	public Double calTax() {
		// TODO Auto-generated method stub
		return Constant.SALARY * 0.4;
	}

	@Override
	public Double calBonus() {
		// TODO Auto-generated method stub
		return Constant.SALARY * 0.2;
	}

}
