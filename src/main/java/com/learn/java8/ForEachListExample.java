package com.learn.java8;
import java.util.ArrayList;
import java.util.List;

public class ForEachListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intArrayList = new ArrayList<Integer>();
		intArrayList.add(0);
		intArrayList.add(1);
		intArrayList.add(2);
		
		//Traditional for loop
		for(int i=0; i<intArrayList.size(); i++) {
			System.out.println(i);
		}
		System.out.println("*************");
		// Enhanced For loop
		for(int i : intArrayList){
			System.out.println(i);
		}
		System.out.println("*************");
		//forEach + Lambda
		intArrayList.forEach(i -> System.out.println("Array List elements " + i));
		System.out.println("*************");
		//forEach + method reference
		intArrayList.forEach(System.out::println);
	
	}
}
