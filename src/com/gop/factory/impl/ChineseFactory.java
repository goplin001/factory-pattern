package com.gop.factory.impl;

import com.gop.factory.Factory;
import com.gop.service.impl.BaseSalary;
import com.gop.service.impl.ChineseSalary;

public class ChineseFactory extends Factory {

	@Override
	public BaseSalary creBaseSalary() {
		// TODO Auto-generated method stub
		return new ChineseSalary();
	}

}
