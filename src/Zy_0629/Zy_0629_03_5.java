package Zy_0629;

public class Zy_0629_03_5 {
	/**
	 * @Author:
	 * @Date 2020/6/29 19:58
	 **/
	public static void main(String[] args) {
		int[] array = { 18, 25, 7, 36, 13, 2, 89, 63 };
		int max = 0, index = -1;
		for (int i = 0; i < 8; i++) {
			if (array[i] > max) {
				max = array[i];
				index = i;
			}
		}

		System.out.println("最大的数为" + max);
		System.out.println("下标" + index);
	}
}
