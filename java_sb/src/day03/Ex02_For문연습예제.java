package day03;

import java.util.Scanner;

public class Ex02_For문연습예제 {

	public static void main(String[] args) {
		/*1에서 5까지 출력되도록 코드를 작성하세요*/
		
		for(int i = 1 ; i <= 5 ; i++ ) {

		      System.out.println(i);
		}
		/*구구단 2단을 출력하는 코드를 작성하세요
		 * */
		
	
		for(int i = 1 ; i <=9 ; i ++) {
			System.out.println("2 x" + i + " = " + 2*i);
		}
		
		int dan = 3;
		for(int i = 1 ; i <=9 ; i ++) {
			System.out.println(dan + " x " + i + " = " + dan*i);
		}
		
		System.out.println("------------");
		
		/*97에서 122까지 출력되도록 작성하세요.
		 * => 문자 a의 유니코드 값이 97, b는 98이다.
		 * 	 이 특징을 이용해서 a부터 z까지 출력하는 코드를 작성.
		 *  	=> 자료형 변환
		 * */
		
		for(int i = 97 ; i <= 122 ; i++ ) {
			System.out.print((char)i);
		}
		System.out.println("\n------------");
		for(char i = 'a' ; i <= 'z' ; i++ ) {
			System.out.print(i);
		}
		System.out.println("\n------------");
		/* 1부터 10까지의 합을 구하는 코드를 작성하세요
		 * */
		
		int sum = 0 ;
		
		for(int i = 1 ; i <=10 ; i++) {
			sum += i;
		
			System.out.println("1부터 10까지의 합 : " + sum);
			
		}
	}

}
