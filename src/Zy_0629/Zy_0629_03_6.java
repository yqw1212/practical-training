package Zy_0629;

public class Zy_0629_03_6 {
	/**
	 * @Author: 
	 * @Date 2020/6/29 22:40
	 **/
	public static void main(String[] args) {
		int[][] array1 = { { 2, 3, 4 }, { 4, 6, 8 } };
		int[][] array2 = { { 1, 5, 2, 8 }, { 5, 9, 10, -3 }, { 2, 7, -5, -18 } };
		int[][] result = new int[2][4];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 4; j++) {
				int sum = 0;
				for (int p = 0; p < 3; p++) {
					sum += array1[i][p] * array2[p][j];
				}
				result[i][j] = sum;
			}
		}
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	}
}
