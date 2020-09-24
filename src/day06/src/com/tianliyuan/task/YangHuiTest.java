package com.tianliyuan.task;

public class YangHuiTest {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		// 1.聲明並初始化二維數組
		int[][] yanghui = new int[50][];
		// 2.動態賦值
		for (int i = 0; i < yanghui.length; i++) {
			yanghui[i] = new int[i + 1];
			yanghui[i][0] = yanghui[i][i] = 1;
			for (int j = 1; j < yanghui[i].length - 1; j++) {
				yanghui[i][j] = yanghui[i - 1][j - 1] + yanghui[i - 1][j];
			}
		}
		// 3. 遍歷
		
		for (int i = 0; i < yanghui.length; i++) {
			for (int j = 0; j < yanghui[i].length; j++) {
				System.out.print(yanghui[i][j] + "  ");
			}
			System.out.println();
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}
}
