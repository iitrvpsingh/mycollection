package com.custom.collection.service;

public interface List <E> {
	
	public void add(E e);
	
	public E get(int index);
	
	public Object remove(int index);
	
	public void display();

}
