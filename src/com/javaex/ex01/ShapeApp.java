package com.javaex.ex01;

public class ShapeApp {

	public static void main(String[] args) {

		Shape s = new Rectangle("빨강");
		Circle c1 = new Circle("녹색", 10);
		Rectangle r1 = new Rectangle("빨강", 4, 4);
		Shape sr1 = new Rectangle("빨강", 12, 10);

		// sr1을 그리는 메소드 호출
		sr1.draw();
		// sr1의 가로크기 출력
		System.out.println("sr1의 가로 크기는 " + ((Rectangle) sr1).getWidth() + " 입니다.");
	}
}
