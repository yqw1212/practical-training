package Zy_0629;

import java.util.Scanner;

public class Zy_0629_02_15 {
	/**
	 * @Author: 
	 * @Date 2020/6/29 22:24
	 **/
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int result = 1;
		for (int i = 1; i <= num; i++) {
			result *= i;
		}
		System.out.println(num + "µÄ½×³ËÎª:" + result);
	}
}
