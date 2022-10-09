package com.itranswarp.learnjava;

import java.util.Scanner;

/**
 * switch实现石头/剪子/布并判断胜负
 */
public class Finger_guessing_game {

	public static void main(String[] args) {
		System.out.println("please choice:");
		System.out.println(" 1: Rock");
		System.out.println(" 2: Scissors");
		System.out.println(" 3: Paper");
		// 用户输入:
		Scanner scanner= new Scanner(System.in);
		int choice = scanner.nextInt();
		// 计算机随机数 1, 2, 3:
		int random = 1 + (int) (Math.random() * 3);
		System.out.println(random);
		//Math.random返回一个[0,1)的double数
		/*我想到一个循环算法，但想不到如何实现：
		 * 				Rock
		 *				 1	 
		 * 				/  A
		 * 			   V	\
		 * 	Scissors  2  -> 3 Paper
		 * 
		 */
		switch (choice-random) {
		// TODO:
		case 1 ->System.out.println("You lose");
		case -1 ->System.out.println("You win");
		//1和3如何处理还没想出来
		case 2 ->System.out.println("You win");
		case -2 ->System.out.println("You lose");
		case 0 ->System.out.println("Deuce");
		default ->System.out.println("Error");
		}
	}

}
