package com.itranswarp.learnjava;

/**
 * for练习
 */
public class Main {

	public static void main(String[] args) {
		double pi = 1;
		for (double per = 1, i = 3; i < 100000; i += 2) {
			// TODO:
			per *= -1 * (i - 2) / i;
			pi += per;
		}
		System.out.println(pi * 4);
	}

}
