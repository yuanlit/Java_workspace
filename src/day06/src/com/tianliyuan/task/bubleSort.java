package com.tianliyuan.task;

public class bubleSort {
	public static void main(String[] args) {
		
		int[] list = new int[]{3,534,32,1,3,221,312,423,12,312,3123,123,123, 123, 12};
		int temp;
		// 冒排
		for(int i = 0; i < list.length - 1; i++) {
			for(int j = 0; j < list.length - i - 1; j ++) {
				if(list[j + 1] < list[j]) {
					temp = list[j + 1];
					list[j + 1] = list[j];
					list[j] = temp;
				}
			}
		}
		
	
		// 快排
		for(int i = 0; i < list.length - 1; i++) {
			for(int j = 0; j < list.length - i - 1; j ++) {
				if(list[j + 1] < list[j]) {
					temp = list[j + 1];
					list[j + 1] = list[j];
					list[j] = temp;
				}
			}
		}
		
		for(int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
	}
}
