package com.itranswarp.learnjava;

/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 * 
 * @modify Lvista
 * 
 * @description
 * 用try ... catch捕获异常并处理在实际应用中可让代码更为健康
 */
public class Main {

	public static void main(String[] args) {
		String a = "12";
		String b = "x9";
		// TODO: 捕获异常并处理
		try {
			int c = stringToInt(a);
			int d = stringToInt(b);
			System.out.println(c * d);
		} catch (NumberFormatException e) {
			System.out.println("Bad input");
		} catch (Exception e) {
			System.out.println("Unknown error");
		}
	}

	static int stringToInt(String s) {
		return Integer.parseInt(s);
	}
}
