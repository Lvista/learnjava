package com.itranswarp.learnjava;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 * @modifier Lvista
 * @description 
 * 利用Pattern构造搜索正则表达式，将匹配信息转换为Matcher，然后用
 * Matcher.appendReplacement替换字符串，得到替换后的字符串。
 * 要注意使用Matcher.appendReplacement一般要连用Matcher.appendTail,
 * 该方法将剩余字符串加到sb中。
 */
public class Template {

	final String template;
	final Pattern pattern = Pattern.compile("\\$\\{(\\w+)\\}");

	public Template(String template) {
		this.template = template;
	}

	public String render(Map<String, Object> data) {
		Matcher m = pattern.matcher(template);
		// TODO:
		StringBuilder sb = new StringBuilder();
		while (m.find()) {
				m.appendReplacement(sb, data.get(m.group(1)).toString());
		}
		m.appendTail(sb);//用于把最后一次替换的位置之后剩余字符加到sb中
		return sb.toString();
	}

}
