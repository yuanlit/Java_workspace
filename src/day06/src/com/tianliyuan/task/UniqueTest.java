package com.tianliyuan.task;

public class UniqueTest {
	public static void main(String[] args) {
		Boolean isUnique;
		int[] list = new int[6];
		int index = 0;
		int random;
		do {
			isUnique = true;
			random = (int)(Math.random() * 7);
			System.out.println("当前随机数为：" + random);
			if (index == 0) {
				list[index] = random;
				index = 1;
				isUnique = false;
			} else {
				for(int i = 0; i < index; i++) {
					if(list[i] == random) {
						isUnique = false;
					}
				}
			}
			if(isUnique) {
				list[index] = random;
				index++;
			}
		} while (index < list.length);
		
		
		
		
		for(int i = 0; i < list.length; i++) {
			System.out.print(list[i] + "\t");
		}
	}
}
