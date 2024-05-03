package com.core;

public class RunTimeException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
int a[] = {10,20,30,40,50,60,70,80,90};
for(int i=0;i<a.length;i++)
{
	System.out.println(a[i]);
}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
