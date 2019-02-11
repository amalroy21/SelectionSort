package com.utd.sort.util;

import com.utd.sort.Model.Node;

public class ListUtil {
	
	public static Node head;

	public static void buildList(String list) {
		
		String[] strList = list.split(",");
		
		int val = Integer.parseInt(strList[0]);
		int i = 1;
		head = new Node (val);
		
		while(i<strList.length) {
			val = Integer.parseInt(strList[i++]);
			insert(val);
		}
	}
	
	static void insert(int val) {
		
		Node temp = head;
		
		if(temp == null) {
			head = new Node (val);
		}
		else {
			while(true) {
				if(temp.next == null) {
					Node nd = new Node(val);
					temp.next = nd;
					break;
				}else {
					temp = temp.next;
				}
			}
		}
	}
	
	public static void traverse () {
		
		Node tmp = head;
		while(tmp.next!=null) {
			System.out.print(tmp.val+"->");
			tmp = tmp.next;
		}
		System.out.println(tmp.val);
	}
}
