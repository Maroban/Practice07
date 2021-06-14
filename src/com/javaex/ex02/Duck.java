package com.javaex.ex02;

public class Duck extends Bird {

	private String sing;
	private String fly;
	private String showName;

	public Duck() {
	}

	public Duck(String name, String sing, String fly, String showName) {
		super(name);
		this.sing = sing;
		this.fly = fly;
		this.showName = showName;
	}

	public String getSing() {
		return sing;
	}

	public void setSing(String sing) {
		this.sing = sing;
	}

	public String getFly() {
		return fly;
	}

	public void setFly(String fly) {
		this.fly = fly;
	}

	public String getShowName() {
		return showName;
	}

	public void setShowName(String showName) {
		this.showName = showName;
	}

	public void sing() {
		System.out.println("오리(" + getName() + ")가 소리내어 웁니다.");
	}

	public void fly() {
		System.out.println("오리(" + getName() + ")가 날지 않습니다.");
	}

	public void showName() {
		System.out.println("오리의 이름은 " + getName() + " 입니다. ");
	}

}
