package com.itranswarp.learnjava;

/**
 * 遍历数组
 */
public class Main {
	public static void main(String[] args) {
		int[] ns = { 1, 4, 9, 16, 25 };
		// 倒序打印数组元素:
		for (int n = ns.length - 1; n >= 0; n--) {
			System.out.println(ns[n]);
		}
	}
}
