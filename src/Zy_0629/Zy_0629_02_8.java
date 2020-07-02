package Zy_0629;

import java.util.Scanner;

public class Zy_0629_02_8 {
	/**
	 * @Author: 
	 * @Date 2020/6/29 19:30
	 **/
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] num = new int[3];
		for (int i = 0; i < 3; i++) {
			num[i] = scanner.nextInt();
		}

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				if (num[j] > num[j + 1]) {
					num[j] = num[j] + num[j + 1];
					num[j + 1] = num[j] - num[j + 1];
					num[j] = num[j] - num[j + 1];
				}
			}
		}
		System.out.println("从小到大排序:");
		for (int i : num) {
			System.out.printf(i + " ");
		}
		System.out.println();

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				if (num[j] < num[j + 1]) {
					num[j] = num[j] + num[j + 1];
					num[j + 1] = num[j] - num[j + 1];
					num[j] = num[j] - num[j + 1];
				}
			}
		}
		System.out.println("从大到小排序:");
		for (int i : num) {
			System.out.printf(i + " ");
		}
	}

}
