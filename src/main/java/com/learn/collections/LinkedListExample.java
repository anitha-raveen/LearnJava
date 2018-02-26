package com.learn.collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {

		List<Integer> intLinkedList = new LinkedList<Integer>();
		intLinkedList.add(4);
		intLinkedList.add(5);
		intLinkedList.add(6);
		intLinkedList.forEach(System.out::println); 
		intLinkedList.remove(Integer.valueOf(5));  //shifts next integer to index 1 
		System.out.println("***** After removal");
		intLinkedList.forEach(System.out::println); 
		System.out.println("*****Retrieving item");
		System.out.println(intLinkedList.get(0));
		System.out.println(intLinkedList.get(1)); 

	}

}
