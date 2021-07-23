package com.test.Java_8_Feature.interfaceMethods;

public interface DefineDefaultMethod {
	/*
	 * We can define methods inside interface using default keyword after 1.7
	 */
	
	default void defaultMethod() {
		System.out.println("defined interface using Default keyword");
	}
	
}
