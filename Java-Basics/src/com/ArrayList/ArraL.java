package com.ArrayList;
import java.util.*;
public class ArraL 
{
	public static void main(String args[])
	{
		ArrayList<Integer> temp = new ArrayList<Integer>();
		
		System.out.println("Size before adding  contents into the list" +temp );
		temp.add(86);//0
		temp.add(75);//1
		temp.add(68);//3
		temp.add(90);//4
		temp.add(2,87);//2
		temp.add(100);//5
		
		System.out.println("Size of the arraylis now " +temp.size());
		//for(Integer i : temp)
		//{
			System.out.println("Contents in the arry " + temp);
		//}
		
		temp.remove(3);
		temp.remove(4);
		
		System.out.println("Contents in the array list now " +temp);
		
	}
}
