package com.tianliyuan.task;

public class ErWeiArray {
	public static void main(String[] args) {
		// 二维数组静态初始化
		int[][] classNameNumberList = new int[][] { { 10, 111 }, { 11, 112 }, { 12, 113 } };
		for (int i = 0, len = classNameNumberList.length; i < len; i++) {
			for (int j = 0; j < classNameNumberList[i].length; j++) {
//				System.out.print(classNameNumberList[i][j] + "\t");
			}
			System.out.println();
		}

		int sum = 0;
		int[][] lists = new int[][] { { 3, 5, 8 }, { 12, 9 }, { 7, 0, 6, 4 } };
		for (int i = 0, len = classNameNumberList.length; i < len; i++) {
			for (int j = 0; j < lists[i].length; j++) {
				sum += lists[i][j];
			}
		}
//		System.out.println(sum);
		
		
		for(int i = 0; i < 10; i++) {
			for(int j = 10; j > i; j++) {
				
			}
		}
	}
}
