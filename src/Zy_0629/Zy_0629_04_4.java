package Zy_0629;

public class Zy_0629_04_4 {
	/**
	 * @Author: 
	 * @Date 2020/6/29 23:10
	 **/
	public static void main(String[] args) {
		int[] array = { 6, 5, 4, 3, 2, 1 };
		asc(array);
		for (int i : array) {
			System.out.print(i + " ");
		}
	}

	public static void asc(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j + 1]) {
					int f = array[j];
					array[j] = array[j + 1];
					array[j + 1] = f;
				}
			}
		}
	}
}
