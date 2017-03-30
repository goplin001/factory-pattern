package com.gop.factory;

import com.gop.service.impl.BaseSalary;

public abstract class Factory {

	public static Factory getInstance(Class<?> clazz) {
		Factory factory = null;
		try {
			factory = (Factory) Class.forName(clazz.getName()).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return factory;
	}

	public abstract BaseSalary creBaseSalary();

}
