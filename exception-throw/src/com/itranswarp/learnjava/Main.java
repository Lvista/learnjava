package com.itranswarp.learnjava;

/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 * 
 * @modify Lvista
 * 
 * @description
 * 在对应语句添加条件语句，使用throw抛出bug
 * e.g. 
 * var e = new IllegalArgumentException();
 * throw e;
 * 或者简化：
 * throw new IllegalArgumentException();
 * 
 * java标准库定义bug类型如下：
Exception
│
├─ RuntimeException
│  │
│  ├─ NullPointerException
│  │
│  ├─ IndexOutOfBoundsException
│  │
│  ├─ SecurityException
│  │
│  └─ IllegalArgumentException
│     │
│     └─ NumberFormatException
│
├─ IOException
│  │
│  ├─ UnsupportedCharsetException
│  │
│  ├─ FileNotFoundException
│  │
│  └─ SocketException
│
├─ ParseException
│
├─ GeneralSecurityException
│
├─ SQLException
│
└─ TimeoutException
 */
public class Main {

	public static void main(String[] args) {
		System.out.println(tax(2000, 0.1));
		System.out.println(tax(-200, 0.1));
		System.out.println(tax(2000, -0.1));
	}

	static double tax(int salary, double rate) {
		// TODO: 如果传入的参数为负，则抛出IllegalArgumentException
		if (salary < 0 | rate < 0) {
			throw new IllegalArgumentException();
		} else
			return salary * rate;
	}
}
