package com.javaex.practice;

public class Ex08 {
	
	public static void main (String[] args) {
		
/*		int x, y = 0; //x와 y를 모두 0으로 초기화
		char grade = "A"; //문자 A를 grade에 대입
		int salary = 2,000,000; //salary에 2,000,000 대입
		byte n = 1000; //n에 1000을 대입
*/		
		int x = 0;
		int y = 0; //원하는 값이 같더라도 여러 자료형을 한 번에 동시 선언하는 것은 불가능하다.
		char grade = 'A'; //char에는 작은 따옴표를 사용해야 한다. 
		int salary = 2000000; //정수형에 숫자 이외의 것을 넣으면 안 된다.
		int n = 1000; //byte가 감당할 수 있는 범위를 넘어섰다.
		
		
		System.out.println(x+y);
	}
	
}
