package Zy_0629;

import java.util.Scanner;

public class Zy_0629_02_6 {
	/**
	 * @Author: 
	 * @Date 2020/6/29 19:22
	 **/
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		System.out.println("yearΪ" + year);
		if (year % 400 == 0) {
			System.out.println("����");
		} else if (year % 100 == 0) {
			System.out.println("��������");
		} else if (year % 4 == 0) {
			System.out.println("����");
		} else {
			System.out.println("��������");
		}
	}
}
