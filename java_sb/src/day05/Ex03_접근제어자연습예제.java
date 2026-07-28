package day05;

public class Ex03_접근제어자연습예제 {

	public static void main(String[] args) {
		/* 보통 필드에는 private, 메서드는 public을 붙임
		 *   => private 변수에 접근하기 위한 setter와 getter를 생성
		 *
		 * 
		 * - setter
		 *  - 리턴 타입이 void
		 *  - 매개변수는 필드와 동일
		 * - getter
		 * 	- 리턴타입이 필드의 자료형
		 * 	- 매개변수는 없음
		 *  */
		Student std = new Student();
		//std.grade = 1;//private이어서 직접 접근 x
		//접근할 수 있는 setter를 사용
		std.setGrade(1);
		System.out.println(std.getGrade()+"학년");
	}

}

class Student{
	private int grade;
	private int classnNum;
	private int num;
	private String name;
	
	public void setGrade(int grade1) {
		grade = grade1;
	}
	public int getGrade() {
		return grade;
	}
	public int getClassnNum() {
		return classnNum;
	}
	public void setClassnNum(int classnNum) {
		this.classnNum = classnNum;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}