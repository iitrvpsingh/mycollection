package com.custom.collection.serviceImpl;

public class LinkedHashMapCustom<K, V> {
	private Entry<K, V>[] table; // Array of Entry.
	private int capacity = 4; // Initial capacity of HashMap
	private Entry<K, V> header; // head of the doubly linked list.
	private Entry<K, V> last; // last of the doubly linked list.

	public LinkedHashMapCustom() {
		table = new Entry[capacity];
	}

	public void put(K newKey, V data){
		 if(newKey==null) {
			 return;
		 }
	}
	
	static class Entry<K, V> {
		K key;
		V value;
		Entry<K, V> next;
		Entry<K, V> before, after;

		public Entry(K key, V value, Entry<K, V> next) {
			this.key = key;
			this.value = value;
			this.next = next;
		}
	}

}
