package com.core;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapConcept2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap mp=new HashMap();
mp.put("Divya", "Jyoti");
mp.put("19.09.1997", "DOB");
mp.put("flat", "102");
mp.put("plot", "253");
mp.put("sai anurag colony", "bachupally");
mp.put("hyderabad", "telangana");
mp.put("500049", "India");
Iterator it = mp.entrySet().iterator();
while(it.hasNext())
{
	Map.Entry obj=(Entry)it.next();
	System.out.println(obj.getKey()+"------->"+obj.getValue());
}
	}

}
