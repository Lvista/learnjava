package com.itranswarp.learnjava;

/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 * 
 * @modify Lvista
 * 
 * @description 
 * StringBuilder是字符串缓冲区类，储存类型未知。
 * 需要用toString()来转换成String。
 * 
 * StringBuilder() ：创建一个初始值为空的字符串对象
 * StringBuilder(int c) ：创建一个初始值为空的字符串对象,c为容量
 * StringBuilder(String str) ： 创建一个初始值为str的字符串对象
 * 
 * 一般用str.append("anoterstr")来添加字符串
 */
public class Main {

	public static void main(String[] args) {
		String[] fields = { "name", "position", "salary" };
		String table = "employee";
		String insert = buildInsertSql(table, fields);
		System.out.println(insert);
		System.out.println(
				"INSERT INTO employee (name, position, salary) VALUES (?, ?, ?)"
				.equals(insert) ? "测试成功" : "测试失败");
	}

	static String buildInsertSql(String table, String[] fields) {
		// TODO:
		var insert = new StringBuilder(1024);
		insert.append("INSERT INTO ")
		.append(table)
		.append(" (")
		.append(fields[0])
		.append(", ")
		.append(fields[1])
		.append(", ")
		.append(fields[2])
		.append(") VALUES (?, ?, ?)")
		;
		
		return insert.toString();
	}

}
