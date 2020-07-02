package Zy_0629;

public class Zy_0629_03_3 {
	public static void main(String[] args) {
		/**
		 * @Author: 
		 * @Date 2020/6/29 19:46
		 **/
		int[] numbers = { 1, 6, 2, 3, 9, 4, 5, 7, 8 };

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (numbers[j] > numbers[j + 1]) {
					numbers[j] = numbers[j] + numbers[j + 1];
					numbers[j + 1] = numbers[j] - numbers[j + 1];
					numbers[j] = numbers[j] - numbers[j + 1];
				}
			}
		}
		System.out.println("从小到大排序:");
		for (int i : numbers) {
			System.out.printf(i + " ");
		}
		System.out.println();

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (numbers[j] < numbers[j + 1]) {
					numbers[j] = numbers[j] + numbers[j + 1];
					numbers[j + 1] = numbers[j] - numbers[j + 1];
					numbers[j] = numbers[j] - numbers[j + 1];
				}
			}
		}
		System.out.println("从大到小排序:");
		for (int i : numbers) {
			System.out.printf(i + " ");
		}
	}
}
