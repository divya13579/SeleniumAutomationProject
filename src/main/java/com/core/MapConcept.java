package com.core;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap mp=new HashMap();
mp.put("1", "divya");
mp.put("2", "hari");
mp.put("3", "sita");
mp.put("4", "krishna");
mp.put("5", "rishi");
Iterator it = mp.entrySet().iterator();
while(it.hasNext())
{
	Map.Entry obj =(Entry)it.next();
	System.out.println(obj.getKey()+"---"+obj.getValue());
}
	}

}
