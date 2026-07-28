package day05;

public class Rect extends shape {

	public Rect(int left, int top, int right, int bottom) {
		super(left, top, right, bottom);
	}
	
	@Override
	public void draw() {
		System.out.println("사각형입니다.");
		System.out.println("가로 : " + (right - left));
		System.out.println("세로 : " + (bottom - top));
	}
	public void resize(int width, int height) {
		right = left + width;
		bottom = top + height;
	}
}
