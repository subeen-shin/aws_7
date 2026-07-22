package day03;

public class Ex12_반복문연습예제2 {

	public static void main(String[] args) {
		/*다음과 같이  출력되도록 코드를 작성하세요.
		 * 1
		 * 12
		 * 123
		 * 1234
		 * 12345
		 * 
		 * i=5 1부터 5까지 출력 후 엔터
		 * 반복횟수 : i는 1부터 5까지 1씩 증가
		 * 실행문 : 1부터 i까지 출력 후 엔터
		 * 		반복횟수 : j는 1부터 i까지 1싹 중가
		 * 		실행문 : j를 출력(print)*/
		/* a
		 * ab
		 * abc
		 * abcd
		 * ...
		 * abcdefg...xyg
		 * */
		for(int i = 'a' ; i <='z' ; i++  ) {
			for(int j = 'a'; j <= i; j++) {
				System.out.print((char)j);
			}
			//줄바꿈(엔터)
			System.out.println();
		}
		   //char 변수를 이용하여 자료형변환 X
	      for(char i = 'a'; i<='z'; i++) {
	         //1부터 i까지 출력
	         for(char j = 'a'; j <= i; j++) {
	            System.out.print(j);            
	         }
	         //엔터
	         System.out.println();
	      }
	}

}
