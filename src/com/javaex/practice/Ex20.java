package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("500원 개수: ");
		int M500 = sc.nextInt();
		int t500 = M500*500;
		
		System.out.print("100원 개수: ");
		int M100 = sc.nextInt();
		int t100 = M100*100;
		
		System.out.print("50원 개수: ");
		int M50 = sc.nextInt();
		int t50 = M50*50;
		
		System.out.print("10원 개수: ");
		int M10 = sc.nextInt();
		int t10 = M10*10;
		
		int total = t500+t100+t50+t10;
		
		System.out.println("동전의 총합은 "+total+" 원 입니다.");
		
		sc.close();
		
	}

}
