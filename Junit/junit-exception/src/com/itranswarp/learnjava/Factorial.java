package com.itranswarp.learnjava;

/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 * 
 * @modifier Lvista
 * 
 * @description
 * assertThrows()可用于测试异常抛出是否正确，比如下面当n>20时需要抛出异常
 * ArithmeticException，所以在test中测试传入21，看是否抛出该错误
 */
public class Factorial {

	public static long fact(long n) {
		if (n < 0) {
			throw new IllegalArgumentException();
		} else if (n > 20) {
			throw new ArithmeticException();
		}
		long r = 1;
		for (long i = 1; i <= n; i++) {
			r = r * i;
		}
		return r;
	}

}
