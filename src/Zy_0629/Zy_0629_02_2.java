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
			System.out.println("�ȼ�ΪA");
			break;
		}
		case 9: {
			System.out.println("�ȼ�ΪA");
			break;
		}
		case 8: {
			System.out.println("�ȼ�ΪB");
			break;
		}
		case 7: {
			System.out.println("�ȼ�ΪC");
			break;
		}
		case 6: {
			System.out.println("�ȼ�ΪD");
			break;
		}
		default: {
			System.out.println("�ȼ�ΪE");
			break;
		}
		}
	}
}
