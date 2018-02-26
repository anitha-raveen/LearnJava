package com.learn.collections;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class ArrayListCMEExample {

	public static void main(String[] args) {
		List<String> myList = new ArrayList<String>();
		
		myList.add("1");
		myList.add("2");
		myList.add("3");
		myList.add("4");
		myList.add("5");
		myList.forEach(System.out::println);
		Iterator<String> it = myList.iterator();
		while(it.hasNext()){
			String value = it.next();
			System.out.println("List Value:"+value);
			System.out.println("Item @ index 3 " + myList.get(3));
			if(value.equals("3")){
				myList.remove("4");
				//myList.forEach(System.out::println);
				myList.add("6");
				myList.add("7");
				//myList.forEach(System.out::println);
				System.out.println("Item @ index 3 " + myList.get(3));
				
			}
		}
		System.out.println("List Size:"+myList.size());
		
		myList.stream().forEach(System.out::println);
	}

}
