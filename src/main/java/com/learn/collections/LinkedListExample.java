package com.learn.collections;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {

		List<Integer> intLinkedList = new LinkedList<Integer>();
		for (int i=0;i<1000000;i++) {
			intLinkedList.add(i);
		}
		//intLinkedList.forEach(System.out::println); 
		long startTime = new Date().getTime();
		intLinkedList.remove(Integer.valueOf(5000)); 
		long endTime = System.currentTimeMillis();
		long secs = endTime-startTime;
		System.out.println("StartTime" +  startTime);
		System.out.println("EndTime" +  endTime);
		System.out.println("Time for removal" + secs);
		System.out.println("***** After removal");
		//intLinkedList.forEach(System.out::println); 
		System.out.println("*****Retrieving item");
		startTime =  System.currentTimeMillis();
		System.out.println(intLinkedList.get(5001));
		endTime =  System.currentTimeMillis();
		secs = endTime-startTime;
		System.out.println("StartTime" +  startTime);
		System.out.println("EndTime" +  endTime);
		System.out.println("Time for retrieval" + secs);
		System.out.println(intLinkedList.get(125)); 

	}

}
