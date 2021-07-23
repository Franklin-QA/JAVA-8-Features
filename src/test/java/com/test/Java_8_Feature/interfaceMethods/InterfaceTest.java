package com.test.Java_8_Feature.interfaceMethods;

public class InterfaceTest implements DefineDefaultMethod,DefineStaticMethod{
 
	@Override
	public void defaultMethod() {
		DefineDefaultMethod.super.defaultMethod();
	}
	
	public static void main(String[] args) {
		DefineStaticMethod.staticMethod();
		InterfaceTest t = new InterfaceTest();
		t.defaultMethod();
	}
	
}
