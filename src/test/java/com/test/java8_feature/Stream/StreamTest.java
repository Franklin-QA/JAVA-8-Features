package com.test.java8_feature.Stream;

import java.util.Arrays;
import java.util.List;

public class StreamTest {

	public static void main(String[] args) {
		List<Integer> listValues = Arrays.asList(1, 2, 3, 4, 5);
		listValues.stream().forEach(i -> System.out.println(i));
		System.out.println("Parallel Stream");
		listValues.parallelStream().forEach(System.out::println);
		System.out.println("Parallel Stream in order");
		listValues.parallelStream().forEachOrdered(System.out::println);
		System.out.println("print odd number");
		listValues.stream().filter(i->i%2==1).forEach(i->System.out.println(i));
		
	}
}
