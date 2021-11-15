package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("상품가격:");
		double price = sc.nextDouble();
		
		System.out.print("받은 돈:");
		double cash = sc.nextDouble();
		
		double tax = price/10;
		double balance = cash-price;
		
		System.out.println("===================");
		
		System.out.println("받은 돈:"+cash);
		System.out.println("상품가격:"+price);
		System.out.println("부가세:"+tax);
		System.out.println("잔액:"+balance);
		
		
		sc.close();
		
	}

}
