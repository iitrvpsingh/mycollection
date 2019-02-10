package com.custom.collection.serviceImpl;

import java.util.LinkedList;
import java.util.Queue;

public class BlockingQueue<T> {
	private Queue<T> queue;
	private static int size;

	public BlockingQueue(int size) {
		queue = new LinkedList<>();
		this.size = size;
	}

	public synchronized void set(T value) throws InterruptedException {
		if (queue.size() == size) {
			wait();
		}
		queue.add(value);
	}

	public T get() throws InterruptedException {
		while (queue.isEmpty()) {
			this.wait();
		}
		return queue.poll();
	}

	public static void main(String[] args) {

	}
}
