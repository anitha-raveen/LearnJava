package com.learn.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		List<Integer> intArrayList = new ArrayList<Integer>();
		intArrayList.add(4);
		intArrayList.add(5);
		intArrayList.add(6);
		intArrayList.forEach(System.out::println);
		intArrayList.remove(Integer.valueOf(5));  //shifts next integer to index 1 
		System.out.println("***** After removal");
		intArrayList.forEach(System.out::println); 
		System.out.println("*****Retrieving item");
		System.out.println(intArrayList.get(0));
		System.out.println(intArrayList.get(1)); 

	}

}
