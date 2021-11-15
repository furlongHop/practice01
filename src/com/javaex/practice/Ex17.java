package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반지름: ");
		double r = sc.nextDouble();
		double pie = 3.14;
		double V = 4.0/3.0*pie*(r*r*r);
		
		System.out.println("구의 부피는:"+V+" 입니다.");
		
		//자료형이 double일 경우 실수로 표기해야 더 정확한 값을 얻을 수 있다.
		//우선순위를 정확하게 지정해둘수록 정확한 값이 도출된다.
		
		sc.close();
		
	}

}
