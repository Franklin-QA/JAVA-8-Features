package com.test.java8_feature.lambda;

import java.util.Arrays;
import java.util.List;

public class ForEachMethod {

	/*
	 * Till java 1.7 we were using some external loops in terms of collection
	 */

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

		/*
		 * earlier we use normal for or enchance for loop - external loops to print the - will take some time to print 
		 * values but after 1.8 we have got internal loop called forEach comming from
		 * lambda in collections - fatser than external loops
		 */
		list.forEach(i -> System.out.println(i)); // -> - Lambda Expression ()
	}
}
