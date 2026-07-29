package day06;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ex13_리스트랜덤예제 {

	public static void main(String[] args) {
		/* 1~9사이의 랜덤한 수 3개를 생성하여 ArrayList에 저장하고 콘솔에 출력
		 * 
		 * */
		
		
		Random random = new Random();
		int min = 1, max = 9;
	
		
		ArrayList<Integer>list = new ArrayList<Integer>();
		
		//반복문 3번
		while(list.size() < 3) {
			//랜덤한 수를 생성
			int num = random.nextInt(min, max + 1);//1~9사이의 랜덤한 수 생성
			//리스트에 추가
			list.add(num);
		}
		
		//콘솔에 리스트를 출력
		System.out.println(list);
		

	}

}
