package Zy_0629;

import java.util.Scanner;

public class Zy_0629_02_2 {
	/**
	 * @Author: 
	 * @Date 2020/6/29 19:10
	 **/
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int grade = scanner.nextInt();
		grade = grade / 10;
		switch (grade) {
		case 10: {
			System.out.println("等级为A");
			break;
		}
		case 9: {
			System.out.println("等级为A");
			break;
		}
		case 8: {
			System.out.println("等级为B");
			break;
		}
		case 7: {
			System.out.println("等级为C");
			break;
		}
		case 6: {
			System.out.println("等级为D");
			break;
		}
		default: {
			System.out.println("等级为E");
			break;
		}
		}
	}
}
