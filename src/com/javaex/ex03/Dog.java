package com.javaex.ex03;

public class Dog implements Soundable {

	public String sound() {
		return "멍멍";
	}
	
	public void print() {
		System.out.println("2번 강아지 울음!");
	}
}
