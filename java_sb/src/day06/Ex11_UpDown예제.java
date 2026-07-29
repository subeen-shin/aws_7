package day06;

import java.util.Random;
import java.util.Scanner;

public class Ex11_UpDown예제 {

	public static void main(String[] args) {
		
		//임의의 숫자를 정함
		Random random = new Random();
		int min = 1, max = 100;
		int num = random.nextInt(min, max + 1); // 1~100사이의 랜덤 숫자를 만듦
		//System.out.println("테스트용 정답 : " + num);
		
		Scanner scan = new Scanner(System.in);
		//반복
		for( ; ;) {
			//숫자를 불러야 함 => 숫자를 입력
			System.out.println("입력 : ");
			int user = scan.nextInt();
			
			//입력한 숫자가 1보다 작거나 100보다 크면 판별을 하지 않도록 구현
		    if(user < 1 || user > 100) {
		    	System.out.println("숫자는 1~100사이의 수를 입력해야 합니다.");
		    	continue;
		    }
		         
		    
		      
			//up인지 down인지 정답인지 알려줌
			//
			if (num < user ) {
				System.out.println("down");
			}
			else if (num > user ) {
				System.out.println("up");
			}
			else { 
				System.out.println("정답");
				break;
			}
		}
		
	}

}
