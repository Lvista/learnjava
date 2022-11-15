package com.itranswarp.learnjava;

import java.util.*;

/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 * 
 * @modifier Lvista
 * 
 * @description
 * 采用剔除法经过一次遍历就可以找出缺少的元素
 */
public class Main {
	public static void main(String[] args) {
		// 构造从start到end的序列：
		final int start = 20;
		final int end = 50;
		List<Integer> list = new ArrayList<>();
		for (int i = start; i <= end; i++) {
			list.add(i);
		}
		// 洗牌算法suffle可以随机交换List中的元素位置:
		Collections.shuffle(list);
		// 随机删除List中的一个元素:
		int removed = list.remove((int) (Math.random() * list.size()));
		int found = findMissingNumber(start, end, list);
		System.out.println(list.toString());
		System.out.println("missing number: " + found);
		System.out.println(removed == found ? "测试成功" : "测试失败");
	}

	/**
	 * TODO: 找出从start到end的缺失的数字并返回
	 */
	static int findMissingNumber(int start, int end, List<Integer> list) {
		Integer[] lis = new Integer[end - start + 1];
		for (int i = start; i <= end; i++) {
			lis[i - start] = i;
		}
		for (Integer one : list) {
			lis[one - start] = null;
		}
		int i = -1;
		for (Integer k : lis) {
			if (k != null)
				i = (int) k;
		}
		return i;
	}
}
