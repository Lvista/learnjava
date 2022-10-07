package com.itranswarp.learnjava;

import java.util.Scanner;

/**
 * 输入上次考试成绩（int）和本次考试成绩（int），然后输出成绩提高的百分比，保留两位小数位（例如，21.75%）
 */
public class XiaomingPerfor {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("小明上次成绩：");
		int prev = scanner.nextInt();
		System.out.print("小明本次次成绩：");
		int score = scanner.nextInt();
//		注意(double)的位置：
		double percent = (double) (score - prev) / prev * 100;
		/*
		 * (double)强制类型转换属于()优先级，运算逻辑是： 运算(double)右边最近的表达式块结果，上面的表达式运算顺序是：
		 * 1、首先运算(double)也就是将右方表达式(score - prev)结果转换为double 
		 * 2、然后之后运算自动将prev和100转换为double
		 * 试比较以下表达式结果： 
		 * double percent = (double) ((score - prev) / prev * 100); 
		 * double percent = (double) 100 * (score - prev) / prev;
		 */
		System.out.printf("成绩提高了%.2f%%", percent);
	}

}
