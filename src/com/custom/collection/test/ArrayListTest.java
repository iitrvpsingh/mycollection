package com.custom.collection.test;

import com.custom.collection.service.List;
import com.custom.collection.serviceImpl.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("AAA");
		list.add("bbb");
		
		list.display();
	}
}
