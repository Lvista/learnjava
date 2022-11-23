package com.itranswarp.learnjava;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 * @modifier Lvista
 * @description 创建Patter匹配格式对象，使用()对Patter对象进行分组匹配，
 * 使用Pattern.matcher方法返回一个Matcher对象，可用该对象group(int index)返回一个
 * index序号的String。
 */
public class Time {
	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
		for(int i : parseTime(dtf.format(LocalTime.now()))) {
			System.out.println(i);
		}
	}
	/**
	 * 从"21:05:19"中提取时，分，秒，否则抛出IllegalArgumentException
	 */
	public static int[] parseTime(String s) {
		// FIXME:
		if(s==null)throw new IllegalArgumentException();
		int[] lt=new int[3];
		Pattern p = Pattern.compile("(\\d{2})\\:(\\d{2})\\:(\\d{2})");
		Matcher matcher = p.matcher(s);
		if(matcher.matches()) {
			lt[0]=Integer.parseInt(matcher.group(1));
			lt[1]=Integer.parseInt(matcher.group(2));
			lt[2]=Integer.parseInt(matcher.group(3));
			if(ifitsligal(lt)) {
				return lt;
			}else
				throw new IllegalArgumentException();
		}else
		throw new IllegalArgumentException();
	}

	private static boolean ifitsligal(int[] lt) {
		// TODO Auto-generated method stub
		if(!rangeInDefined(lt[0],0,23)) return false;
		else if(!rangeInDefined(lt[1],0,59))return false;
		else if(!rangeInDefined(lt[2],0,59))return false;
		else return true;
	}
	
	public static boolean rangeInDefined(int current, int min, int max) {
		return Math.max(min, current) == Math.min(current, max);
	}

}
