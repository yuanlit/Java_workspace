package com.tianliyuan.java;

public class ArrayTest {
	public static void main(String[] args) {
		// 一维数组的声明
		int[] ids;
		// 1.1静态初始化(数组的初始化和数组元素的赋值操作，同时进行)；
		ids = new int[] { 1001, 1002, 1003, 1004 };
		// 1.2 动态初始化（数组）
		char[] names = new char[5];
		System.out.println(ids);
		names[3] = 97;
		for (int i = 0, len = names.length; i < len; i++) {
			System.out.println(names[i]);
		}

		if (names[0] == 0) {
			System.out.println("nihao");
		}
	}
}
