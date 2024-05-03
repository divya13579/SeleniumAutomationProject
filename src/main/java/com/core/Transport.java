package com.core;

public class Transport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Transport tr=new Transport();
		tr.vehicle(9);
		tr.vehicle(33, "bus");
		tr.vehicle();
		tr.tyre();
	}
public void vehicle()
{
	System.out.println("small vehicle");
}
public void vehicle(int persons)
{
 if(persons<=10 && persons>=2)
 {
	 System.out.println("Vehicle car is going to carry no. of persons "+persons);
 }
}

public void vehicle(int persons,String vehicletype)
{
 if(persons>=10 && persons<=50)
 {
	 System.out.println("Vehicle is going to carry no. of persons "+persons);
	 System.out.println("Vehicle type "+vehicletype);
 }
}
public void tyre()
{
	System.out.println("vehicle tyre is circle");
}
     }