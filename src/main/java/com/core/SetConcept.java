package com.core;

import java.util.HashSet;
import java.util.Iterator;

public class SetConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<String> hs=new HashSet<String>();
hs.add("divya");
hs.add("hari");
hs.add("deekshu");
hs.add("rishi");
hs.add("myra");
System.out.println(hs);
hs.add("sneha");
hs.add("rekha");
hs.add("hari");
hs.add("divya");
System.out.println(hs);
Iterator<String> it = hs.iterator();
while(it.hasNext())
{
	System.out.println(it.next());
}
	}

}
