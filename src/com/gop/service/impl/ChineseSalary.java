package com.gop.service.impl;

import com.gop.constant.Constant;

public class ChineseSalary extends BaseSalary {

	@Override
	public Double calTax() {
		// TODO Auto-generated method stub
		return Constant.SALARY * 0.5;
	}

	@Override
	public Double calBonus() {
		// TODO Auto-generated method stub
		return Constant.SALARY * 0.1;
	}

}
