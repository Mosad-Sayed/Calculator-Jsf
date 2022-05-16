package com.mosad;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "calculator")
@SessionScoped
public class Calculator {
	private int number1;
	private int number2;
	private int result;

	public String add() {
		result = number1 + number2;
		System.out.println(result);
		return "index.xhtml";
	}

	public String subtract() {
		result = number1 - number2;
		System.out.println(result);
		return "index.xhtml";
	}

	public String multiply() {
		result = number1 * number2;
		System.out.println(result);
		return "index.xhtml";
	}

	public String divide() {
		result = number1 / number2;
		System.out.println(result);
		return "index.xhtml";
	}

	
	public int getNumber1() {
		return number1;
	}

	public void setNumber1(int number1) {
		this.number1 = number1;
	}

	public int getNumber2() {
		return number2;
	}

	public void setNumber2(int number2) {
		this.number2 = number2;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}
}
