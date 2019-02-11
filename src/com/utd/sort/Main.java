package com.utd.sort;

import java.util.Properties;

import com.utd.sort.impl.SelectionSortImpl;
import com.utd.sort.util.ListUtil;
import com.utd.sort.util.ReadPropertyFile;


public class Main {
	
	
	public static void main(String[] args) {

		Properties prop = ReadPropertyFile.readProperties("config.properties");
		ListUtil.buildList(prop.getProperty("List"));
		System.out.println("Initial List :");
		ListUtil.traverse();
		SelectionSortImpl sort = new SelectionSortImpl();
		sort.selectionSort();
		System.out.println("Nodes after sorting :");
		ListUtil.traverse();
	}

}
