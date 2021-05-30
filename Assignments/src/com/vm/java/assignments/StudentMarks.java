package com.vm.java.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentMarks {
	static int highestMarks(ArrayList<Integer>arr) {
		 int max=Collections.max(arr);
		 return max;
	 }
	 static double averageMarks(ArrayList<Integer>arr) {
	 int sum=0;
	 for(Integer a:arr) {
		 sum+=a;
	 }
	 return (sum/arr.size());
	}
	 public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of students:");
		int num=sc.nextInt();
		ArrayList<Integer> arr=new ArrayList<Integer>();
		int marks;
		while(num>0) {
			arr.add(sc.nextInt());
			num--;
		}
		System.out.println("Highest Marks : "+highestMarks(arr));
		System.out.println("Average Marks : "+averageMarks(arr));
		System.out.println("Marks :");
		for(Integer a:arr) {
			System.out.println(a+" ");
		}
		System.out.println();
		System.out.println("3rd Student Marks :"+arr.get(2));
		Collections.sort(arr); 
		System.out.println(arr);
	}
}
