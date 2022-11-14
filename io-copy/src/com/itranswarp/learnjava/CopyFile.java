package com.itranswarp.learnjava;

import java.io.*;

/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 * 
 * @modifier Lvista
 * 
 * @description
 */
public class CopyFile {

	public static void main(String[] args) throws IOException {
		if (args.length != 2) {
			System.err.println("Usage:\n  java CopyFile.java <source> <target>");
			System.exit(1);
		}
		copy(args[0], args[1]);
	}

	static void copy(String source, String target) throws IOException {
		// 友情提示：测试时请使用无关紧要的文件
		// TODO:
		File file = new File(target);
		if (file.createNewFile()) {
		    // 文件创建成功:
			try (InputStream input = new FileInputStream(source); 
					OutputStream output = new FileOutputStream(target)) {

				input.transferTo(output);
				}
		}else {
			throw new IOException();
		}
	}
}
