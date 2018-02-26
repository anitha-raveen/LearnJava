package com.learn.collections;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		List<Integer> intArrayList = new ArrayList<Integer>();
		for (int i=0;i<1000000;i++) {
			intArrayList.add(i);
		}
		//intLinkedList.forEach(System.out::println); 
		long startTime = new Date().getTime();
		intArrayList.remove(Integer.valueOf(45000)); 
		long endTime = System.currentTimeMillis();
		long secs = endTime-startTime;
		System.out.println("StartTime" +  startTime);
		System.out.println("EndTime" +  endTime);
		System.out.println("Time for removal" + secs);
		System.out.println("***** After removal");
		//intLinkedList.forEach(System.out::println); 
		System.out.println("*****Retrieving item");
		startTime =  System.currentTimeMillis();
		System.out.println(intArrayList.get(5601));
		endTime =  System.currentTimeMillis();
		secs = endTime-startTime;
		System.out.println("StartTime" +  startTime);
		System.out.println("EndTime" +  endTime);
		System.out.println("Time for retrieval" + secs);
		System.out.println(intArrayList.get(125));  

	}

}
