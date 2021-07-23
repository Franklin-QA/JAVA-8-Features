package com.test.java8_feature.lambda;

/*
 * Lambda is new feature that we got in va 1.8 to avoid boiler plate codes 
 * Applicable only with functional interface
 */

interface test {

	void method();
}

//previously i require a seperate class that need to implements the interface method to utilize this method in the code 
/*
 * public class Test1 implements test{
 * 
 * @Override public void method() { System.out.println(" method is executed"); }
 * 
 * }
 */

public class LambdaTest {

	// or we need to use inner clss while creating a object

	/*
	 * t = new test() {
	 * 
	 * @Override public void method() { System.out.println("Interface method"); } };
	 **/
	public static void main(String[] args) {
		test obj=() ->  System.out.println("lambda method is displayed");
		obj.method();
	}

}
