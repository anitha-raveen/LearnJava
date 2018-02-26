package com.learn.java8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ForEachMapExample {

	public static void main(String[] args) {
		Map<Integer, String> hashmap = new HashMap<Integer, String>();
		hashmap.put(0, "Apple");
		hashmap.put(1, "Orange");
		hashmap.put(2, "Banana");

		// getting hash map Keys
		System.out.println(hashmap.keySet());
		System.out.println("*************");
		// getting hash map Values
		System.out.println(hashmap.values());
		System.out.println("*************");
		//entry set iterator on hash map to get key & value 
		Set<Entry<Integer, String>> mapEntrySet = hashmap.entrySet();
		Iterator<Entry<Integer, String>> mapEntrySetIterator = mapEntrySet.iterator();
		while(mapEntrySetIterator.hasNext()) {
			Entry<Integer, String> mapEntry = mapEntrySetIterator.next();
			System.out.println("Key :" + mapEntry.getKey() + " , Value : " + mapEntry.getValue());
		}
		System.out.println("*************");
		//prints the key using for each on key set 
		Set<Integer> keySet = hashmap.keySet();
		keySet.forEach(System.out::println);
		System.out.println("*************");
		//Enhanced for loop on key set to get the hash map value
		for (int key : keySet) {
			System.out.println("Value for Key " + key + " : " + hashmap.get(key));
		}
		System.out.println("*************");
		// forEach on key set to get the hash map value
		keySet.forEach(key ->System.out.println("Value for Key " + key + " : " +hashmap.get(key)));
		System.out.println("*************");
		//prints the values looping for hash map size
		for(int i=0; i< hashmap.size(); i++) {
			System.out.println(hashmap.get(i));
		}
		System.out.println("*************");
		// forEach on hash map to get key and value
		hashmap.forEach((k,v)->System.out.println("Value for Key " + k + " : " + v));
		System.out.println("*************");
		//forEach on hashmap and filter based on key
		hashmap.forEach((k,v) ->{
			if(Integer.valueOf(1).equals(k)) {
				System.out.println("Value for Key " + k + " : " + v);
			}
		});
		System.out.println("*************");
		//forEach on hashmap and filter based on key
		hashmap.keySet().stream().filter(k-> (Integer.valueOf(1).equals(k))).forEach(k->System.out.println(hashmap.get(k)));
	}
}
