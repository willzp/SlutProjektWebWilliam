package com.example.demo;

public class plusCalculation {

	public String Plus(String nr1, String nr2) {

		int num1 = Integer.parseInt(nr1);
		int num2 = Integer.parseInt(nr2);
		int summan = num1 + num2;

		return " {\"nummer1\":" + "\"" + num1 + "\"," + "\"nummmer2\":" + "\"" + num2 + "\"," + "\"resultat\":" + "\"" + String.valueOf(summan) + "\"} ";
		

	}

}
