package com.itranswarp.learnjava;

/**
 * 二维数组
 */
public class ArrayAver {
	public static void main(String[] args) {
		// 用二维数组表示的学生成绩:
		int[][] scores = { //
				{ 82, 90, 91 }, //
				{ 68, 72, 64 }, //
				{ 95, 91, 89 }, //
				{ 67, 52, 60 }, //
				{ 79, 81, 85 }, //
		};
		int temp = 0;
		int num = 0;
		for (int[] i : scores) {
			for (int j : i) {
				temp += j;
				num++;
			}
		}
		// TODO:
		double average = (double)temp/num;
		System.out.println(average);
		if (Math.abs(average - 77.733333) < 0.000001) {
			System.out.println("测试成功");
		} else {
			System.out.println("测试失败");
		}
	}
}
