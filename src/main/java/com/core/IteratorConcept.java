package com.core;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> hd=new ArrayList<String>();
hd.add("cricket");
hd.add("football");
hd.add("volleyball");
hd.add("basketball");
hd.add("hockey");
hd.add("carroms");
hd.add("ludo");
hd.add("chess");
hd.add("CoD");
hd.add("kabaddi");
Iterator<String> he = hd.iterator();
while(he.hasNext())
{
	System.out.println(he.next());
}
	}

}
