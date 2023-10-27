package com.mmkarami.spring;

public class HPPrinter<T> implements Printer<T> {

	@Override
	public void print(T t) {
		System.out.println(t.toString());
	}

}