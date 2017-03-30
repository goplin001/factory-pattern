package com.gop.test;

import com.gop.factory.Factory;
import com.gop.factory.impl.AmericanFactory;
import com.gop.service.impl.BaseSalary;

public class FactoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factory factory = Factory.getInstance(AmericanFactory.class);
		BaseSalary salary = factory.createSalary();
		System.out.println("bonus=" + salary.calBonus() + "\ttax=" + salary.calTax());

	}

}
