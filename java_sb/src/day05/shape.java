package day05;

//도형 클래스
public class shape {
	
	protected int left, top, right, bottom;
	
	public void draw() {
		System.out.println("도형입니다.");
	}
	
	//
	public shape(int left, int top, int right, int bottom) {
		this.left = left;
		this.top = top;
		this.right = right;
		this.bottom = bottom;
	}
	
	public shape() {
	}
}
