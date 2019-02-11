package com.utd.sort.impl;

import com.utd.sort.Model.Node;
import com.utd.sort.util.ListUtil;

public class SelectionSortImpl {
	
	Node head = ListUtil.head ;
	
	public void selectionSort() {
		
		Node min = head;
		Node ptr = head;
		Node cur = head ;
		Node curPrev = null;
		Node minPrev = null;
		Node ptrPrev = null;
		while(cur.next != null) {
			minPrev = curPrev;
			min = cur;
			ptr = cur.next;
			ptrPrev = cur;
			while(ptr!=null) {
				if(ptr.val<min.val) {
					minPrev = ptrPrev;
					min = ptr;
				}
				ptrPrev = ptr;
				ptr = ptr.next;
			}
			if(cur != min) {
				nodeSwap(minPrev,curPrev);
				curPrev = min;
				cur = min.next;
			}else {
				curPrev = cur;
				cur = cur.next;
			}
		}
		
	}

	private void nodeSwap(Node minPrev, Node curPrev) {
		
		Node min,cur,tmp1,tmp2;
		
		if(curPrev == null) {
			cur = head;
			min = minPrev.next;
			tmp1 = min.next;
			ListUtil.head = minPrev.next;
			ListUtil.head.next = cur.next;
			minPrev.next = cur;
			cur.next = tmp1;
			
		}else {
			cur = curPrev.next;
			min = minPrev.next;
			tmp1 = cur.next;
			tmp2 = min.next;
			cur.next = min.next;
			curPrev.next = min;
			if(minPrev == cur) {
				min.next = cur;
			}else {
				minPrev.next = cur;
				min.next = tmp1;
			}
			cur.next = tmp2;
		}
		
	}
}
