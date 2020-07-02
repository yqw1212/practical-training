package Zy_0629;

import java.util.Scanner;

public class Zy_0629_02_4 {
	/**
	 * @Author: 
	 * @Date 2020/6/29 19:15
	 **/
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		switch (num) {
		case 1: {
			System.out.println("x=1");
			break;
		}
		case 5: {
			System.out.println("x=5");
			break;
		}
		case 10: {
			System.out.println("x=10");
			break;
		}
		default: {
			System.out.println("x=none");
			break;
		}
		}
	}
}
