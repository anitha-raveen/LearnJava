package com.learn.java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StreamExample {

	public static void main(String[] args) {

		List<String> strArrayList = new ArrayList<String>();
		strArrayList.add("Apple");
		strArrayList.add("Orange");
		strArrayList.add("Banana");
		strArrayList.add("Grape");
		strArrayList.add("Strawberry");
		
		
		// Filters and prints one by one -  follows list order
		strArrayList.stream()
					.filter(str -> str.contains("a"))
					.forEach(System.out::println); 
		
		
		System.out.println("*************");
		
		strArrayList = new ArrayList<String>();
		strArrayList.add("Apple");
		strArrayList.add("Orange");
		strArrayList.add("Banana");
		strArrayList.add("Grape");
		strArrayList.add("Strawberry");
		
		// Filters and prints parallel - not in the order
		strArrayList.parallelStream()
		.filter(str -> str.contains("a"))
		.forEach(System.out::println); 
		
		System.out.println("*************");
		Map<Integer, String> hashmap = new HashMap<Integer, String>();
		hashmap.put(0, "Apple");
		hashmap.put(1, "Orange");
		hashmap.put(2, "Blueberry");
		hashmap.put(3, "Grape");
		hashmap.put(4, "Avocado");
		hashmap.put(5, "Banana");
		
		//stream on hashmap key set and filter based on key and for each on key to print the value 
		hashmap.keySet().stream().filter(k-> (Integer.valueOf(1).equals(k))).forEach(k->System.out.println(hashmap.get(k)));
		System.out.println("*************");
		//stream on hashmap values and filter based on key and for each on key to print the value without sorting
		hashmap.values().stream().filter(v-> v.contains("B")).forEach(System.out::println);
		System.out.println("*************");
		//stream on hashmap values and filter based on key and for each on key to print the value with sorting
		hashmap.values().stream().filter(v-> v.contains("B")).sorted().forEach(System.out::println);
	}

}
