package com.elouej.tutorial;

import java.util.Scanner;

public class AppTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*		
		
		
		Given an array of integers, return indices of the two numbers such that they add up to a specific target.

				You may assume that each input would have exactly one solution, and you may not use the same element twice
				
				Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].


*/

		
		
		
		
		
		int[] nums = {2, 7, 11, 15};
		int target=26 ; 
		int [] list = new int[2]; 
		
		
		
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++)
			{
				if((nums[i]+nums[j])==target)
				{
				list[0]=i;
				list[1]=j;
				}
			}
		}
		
		
		
	
		System.out.println("[ "+list[0]+" , " +list[1]+" ]");
		
		
	}

}
