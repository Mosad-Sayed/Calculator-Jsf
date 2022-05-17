package com.mosad;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name = "calculator")
@SessionScoped
public class Calculator {
	private int number1;
	private int number2;
	private int result;

	List list = new ArrayList();

	public String add() {
		try {
			result = number1 + number2;
			list.add(number1 + " + " + number2 + " = " + result);
			System.out.println(result);
		} catch (Exception ex) {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Wrong Value", "Wrong Value"));
		}
		return "index.xhtml";
	}

	public String subtract() {
		try {
			result = number1 - number2;
			list.add(number1 + " - " + number2 + " = " + result);
			System.out.println(result);
		} catch (Exception ex) {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Wrong Value", "Wrong Value"));
		}
		return "index.xhtml";
	}

	public String multiply() {
		try {
			result = number1 * number2;
			list.add(number1 + " * " + number2 + " = " + result);
			System.out.println(result);
		} catch (Exception ex) {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Wrong Value", "Wrong Value"));
		}
		return "index.xhtml";
	}

	public String divide() {
		try {
			result = number1 / number2;
			list.add(number1 + " / " + number2 + " = " + result);
			System.out.println(result);
		} catch (Exception ex) {
			System.err.println("Error value " + ex);
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("wrong value", "wrong value"));

		}
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

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}
}
