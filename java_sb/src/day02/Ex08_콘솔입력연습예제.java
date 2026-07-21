package day02;

import java.util.Scanner;

public class Ex08_콘솔입력연습예제 {

	public static void main(String[] args) {
		//다음과 같이 입력이 되도록 코드를 작성해서 입력 받으세요.
		/* 정수 연산자 정수 순으로 입력
		 * -Scanner 이용하여 1, +, 2를 입력받음
		 * 예시
		 * 정수를 입력하세요 : 1
		 * 연산자를 입력하세요 : +
		 * 정수를 입력하세요 : 2
		 * 결과 : 1 + 2 
		 * */
		//스캐너 만들기
		Scanner scan = new Scanner(System.in);
		
	      System.out.print("정수를 입력하세요 : ");
	      int num1 = scan.nextInt();
	      
	      //next() : 공백을 제거한 문자열로 단어를 입력받음
	      System.out.print("연산자를 입력하세요 : ");
	      String operator = scan.next();
	      
	      
	      System.out.print("정수를 입력하세요 : ");
	      int num2 = scan.nextInt();
	      
	      System.out.print("결과 : "  + num1 + operator + num2);
	      
	   
	      
	      
	}

}
