package Zy_0629;

public class Zy_0629_03_8 {
	/**
	 * @Author: 
	 * @Date 2020/6/29 22:45
	 **/
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 2, 4, 6, 7, 3, 2, 1, 2 };
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[i] == array[j] && i != j) {
					array[j] = 0;
				}
			}
		}
		for (int i : array) {
			System.out.print(i+" ");
		}
	}
}
