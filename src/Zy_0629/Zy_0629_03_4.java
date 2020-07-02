package Zy_0629;

public class Zy_0629_03_4 {
	/**
	 * @Author: 
	 * @Date 2020/6/29 19:55
	 **/
	public static void main(String[] args) {
		double[][] array = { { 1.1, 1.2, 1.3, 1.4 }, { 2.1, 2.2, 2.3, 2.4 }, { 3.1, 3.2, 3.3, 3.4 },
				{ 4.1, 4.2, 4.3, 4.4 }, { 5.1, 5.2, 5.3, 5.4 } };
		for (int i = 0; i < array.length; i++) {
			int j = 0;
			for (j = 0; j < array[i].length - 1; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println(array[i][j]);
		}
	}
}
