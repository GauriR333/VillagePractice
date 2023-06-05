package com.power.villagePractice;

import java.util.Scanner;

public class TablePractice {
public static void main(String[] args) {
	int table[]=new int[10];
	System.out.println("Enter Number: ");
	Scanner sc1=new Scanner(System.in);
	int number=sc1.nextInt();
	for(int i=1;i<=10;i++) {
		int ans=number*i;
		System.out.println(ans);
	}
	
}
}
