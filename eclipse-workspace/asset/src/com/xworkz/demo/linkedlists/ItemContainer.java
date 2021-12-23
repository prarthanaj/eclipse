package com.xworkz.demo.linkedlists;

import java.util.Collection;
import java.util.LinkedList;

public class ItemContainer implements Item {
	
	Collection linklist = new LinkedList();

	@Override
	public void addItem(Object obj) {

		System.out.println("Invoked add item");
		linklist.add(obj);
	}

	@Override
	public void addFirstItem(Object obj) {
		System.out.println("Invoked addFirstItem");
		LinkedList list = (LinkedList)linklist;
		list.addFirst(obj);

	}

	@Override
	public void addLastItem(Object obj) {
		System.out.println("Invoked addLastItem");
		LinkedList list = (LinkedList)linklist;
		list.addLast(obj);
	}

	@Override
	public void deleteFirstItem() {
		System.out.println("Invoked deleteFirstItem");
		LinkedList list = (LinkedList)linklist;
		list.removeFirst();
	}

	@Override
	public void deleteLastItem() {
		System.out.println("Invoked deleteLastItem");
		LinkedList list = (LinkedList)linklist;
		list.removeLast();
	}

	@Override
	public void getFirstItem() {
		System.out.println("Invoked getFirstItem");
		LinkedList list = (LinkedList)linklist;
		System.out.println(list.getFirst());
	}

	@Override
	public void getLastItem() {
		System.out.println("Invoked getLastItem");
		LinkedList list = (LinkedList)linklist;
		System.out.println(list.getLast());

	}

	@Override
	public void displayItem() {
		System.out.println("Invoked displayItem");
		System.out.println(linklist);

	}




}
	


