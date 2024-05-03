package com.core;

public class NestedLoops6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=1;i<=5;i++)               //i=5;5<=5
{
for(int j=5;j>=i;j--)              //j=5;5>=5
{
 System.out.print(j+" ");          //5 4 3 2 1
}                                  //5 4 3 2
 System.out.println();             //5 4 3
}                                  //5 4
                                   //5 
	}

}
