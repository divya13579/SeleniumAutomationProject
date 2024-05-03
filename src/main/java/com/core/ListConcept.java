package com.core;

import java.util.ArrayList;
import java.util.Iterator;

public class ListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> al=new ArrayList<String>();
al.add("divya");
al.add("hari");
al.add("rishi");
al.add("myra");
al.add("deekshu");
System.out.println(al);
al.add("rama");
al.add("sita");
al.add("divya");
al.add("hari");
System.out.println(al);
System.out.println(al.get(8));
System.out.println(al.get(4));
System.out.println("to print all the values from list we use iterator");
Iterator<String> it = al.iterator();
while(it.hasNext())
{
	System.out.println(it.next());
}
	}

}
