package Zy_0629;

import java.util.Scanner;

public class Zy_0629_04_1 {
	/**
	 * @Author: 
	 * @Date 2020/6/29 22:55
	 **/
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		System.out.println(num + "µÄ½×³ËÎª:" + result(num));
	}

	public static int result(int num) {
		int result = 1;
		for (int i = 1; i <= num; i++) {
			result *= i;
		}
		return result;
	}
}
