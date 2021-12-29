package com.xworkz.wrapper;

import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.SortedSet;

public class Xworkz {
	public static void main(String[] args) {
		
		Set<Integer> hashSet = new HashSet<Integer>();
		
		hashSet.add(100);
		hashSet.add(790);
		hashSet.add(567);
		
		System.out.println(hashSet);
		
		String abc="wednesday";
		
		
		
		SortedSet<Integer> treeSet=new TreeSet<Integer>(hashSet);
		System.out.println(treeSet);
		
		SortedSet<Character> tree=new TreeSet<Character>();
		for(int i=0;i<abc.length(); i++) {
			tree.add(abc.charAt(i));
		}
		System.out.println(tree);
		Set<String> hashSet1 = new HashSet<String>();
		hashSet1.add("java");
		hashSet1.add("sql");
		hashSet1.add("html");
		
		System.out.println(hashSet1);
		
		TreeSet<String> treeSet2=new TreeSet<String>(hashSet1);
		System.out.println(treeSet2);
		
	}
	

}
