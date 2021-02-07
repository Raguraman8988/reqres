package com.api.com.rest;

import java.util.ArrayList;
import java.util.List;

public class Sort {
	
	public static void sortTest() {
		List <Integer> list =  new ArrayList<Integer>();
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(0);
		list.add(1);
		list.add(2);
		
		List <Integer> list1 =  new ArrayList<Integer>();
		list1.add(0);
		list1.add(1);
		list1.add(2);
		list1.add(0);
		list1.add(1);
		list1.add(2);

		for(int i=0; i<=list.size();i++){
			for(int j=i-1; j<=list1.size();j++){
				if (list.get(i)<list1.get(j)) {
					list.add(i);
					
				}
			}
		}
	}

	public static void main(String[] args) {
		sortTest();
	}

}


