package Zy_0629;

import java.util.Scanner;

public class Zy_0629_02_17 {
	/**
	 * @Author: 
	 * @Date 2020/6/29 22:35
	 **/
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		while (num >= 10) {
			System.out.print(num % 10);
			num /= 10;
		}
		System.out.print(num);
	}
}
