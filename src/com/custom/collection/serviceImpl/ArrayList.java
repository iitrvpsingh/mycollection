package com.custom.collection.serviceImpl;

import java.util.Arrays;

import com.custom.collection.service.List;

public class ArrayList<E> implements List<E> {

	private static final int INITIAL_CAPACITY = 10;

	private int size = 0;

	private Object elementData[] = {};

	public ArrayList() {
		elementData = new Object[INITIAL_CAPACITY];
	}

	@Override
	public void add(E e) {
		if (size == elementData.length) {
			ensureCapacity();
		}
		elementData[size++] = e;
	}

	@SuppressWarnings("unchecked")
	@Override
	public E get(int index) {
		if (index < 0 || index >= size) {
			throw new ArrayIndexOutOfBoundsException("Index: " + index + ", Size " + index);
		}
		return (E) elementData[index]; // return value on index.
	}

	@Override
	public Object remove(int index) {
		if (index < 0 || index >= size) {
			throw new ArrayIndexOutOfBoundsException("Index: " + index + ", Size " + index);
		}

		Object removedElement = elementData[index];
		for (int i = index; i < size - 1; i++) {
			elementData[i] = elementData[i + 1];
		}
		size--;

		return removedElement;
	}

	private void ensureCapacity() {
		int newIncreasedCapacity = elementData.length * 2;
		elementData = Arrays.copyOf(elementData, newIncreasedCapacity);
	}

	@Override
	public void display() {
		System.out.print("Displaying list : ");
		for (int i = 0; i < size; i++) {
			System.out.print(elementData[i] + " ");
		}
	}
}
