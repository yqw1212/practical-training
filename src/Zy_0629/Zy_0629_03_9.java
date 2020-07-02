package Zy_0629;

public class Zy_0629_03_9 {
	/**
	 * @Author:
	 * @Date 2020/6/29 22:50
	 **/
	public static void main(String[] args) {
		int[] array = { -10, 2, 3, 246, -100, 0, 5 };
		double sum = 0;
		int max = -9999, min = 9999;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
			if (array[i] > max) {
				max = array[i];
			}
			if (array[i] < min) {
				min = array[i];
			}
		}
		System.out.println("平均数:" + (sum / array.length) + ",最大值:" + max + ",最小值:" + min);
	}
}
