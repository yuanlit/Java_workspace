
package com.tianliyuan.task;
/**
 * 
 * @author 田力源  Email: yuanlit@aliyun.com
 * @date 2020年9月24日上午6:58:33
 * @description 回形数
 */
public class RectangleTest {
	public static void main(String[] args) {
		int n = 10;
		int[][] list = new int[n][n];
		int maxX = n - 1;	// X轴最大坐标
		int maxY = n - 1;	// Y轴最大坐标
		int minX = 0;		// X轴最小坐标
		int minY = 0;		// Y轴最小坐标
		int count = 1;
		while(minX <= maxX) {
			for(int i = minY; i <= maxY; i++) {
				list[minX][i] = count;
				count++;
			}
			minX++;
			for(int i = minX; i <= maxX; i++) {
				list[i][maxY] = count;
				count++;
			}
			maxY--;
			for(int i = maxY; i >= minY; i--) {
				list[maxX][i] = count;
				count++;
			}
			maxX--;
			for(int i = maxX; i >= minX; i--) {
				list[i][minY] = count;
				count++;
			}
			minY++;
		}
		
		int temp = 0;
		// 反转
		for(int i = 0; i < list.length; i++) {
			for(int j = 0; j < list[i].length / 2; j++) {
				temp = list[i][j];
				list[i][j] = list[i][list[i].length - j - 1];
				list[i][list[i].length - j - 1] = temp;
			}
		}
		
		for(int i = 0; i < list.length; i++) {
			for(int j = 0; j < list[i].length; j++) {
				System.out.print(list[i][j] + "\t");
			}
			System.out.print("\n");
		}
		System.out.println(list);
	}
}
