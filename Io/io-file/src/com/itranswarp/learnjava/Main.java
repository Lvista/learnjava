package com.itranswarp.learnjava;

import java.io.File;
import java.io.IOException;
import java.util.Deque;
import java.util.LinkedList;

/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 * 
 * @modifier Lvista
 * 
 * @description
 */
public class Main {

	public static void main(String[] args) throws IOException {
		File currentDir = new File(".");
		listDir(currentDir.getCanonicalFile());
	}

	static void listDir(File dir) {
		// TODO: 递归打印所有文件和子文件夹的内容
		if (dir.isDirectory()) {
			System.out.println(dir.getName() + "\\");
			formatContral(1);
		}
		File[] fs = dir.listFiles();
		if (fs != null) {
			for (File f : fs) {
				formatContral(0);
				if (f.isDirectory()) {
					listDir(f);
					formatContral(-1);
				} else {
					System.out.println(f.getName());
				}
			}
		}
	}

	static Deque<String> form = new LinkedList<>();
	static void formatContral(int i) {
		switch (i) {
		case 0 -> {
			for (String d : form) {
				System.out.print(d);
			}
		}
		case -1 -> form.pop();
		case 1 -> form.push(" ");
		}
	}

}
