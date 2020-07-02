package Zy_0629;

import java.util.Scanner;

public class Zy_0629_02_1 {
	/**
	 * @Author: 
	 * @Date 2020/6/29 19:08
	 **/
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double bonus = 0;
		int money = scanner.nextInt();
		if (money <= 100000) {
			bonus = money * 0.1;
		} else if (money <= 200000) {
			bonus = 100000 * 0.1 + (money - 100000) * 0.075;
		} else if (money <= 400000) {
			bonus = 100000 * 0.1 + 100000 * 0.075 + (money - 200000) * 0.05;
		} else if (money <= 600000) {
			bonus = 100000 * 0.1 + 100000 * 0.075 + 200000 * 0.05 + (money - 400000) * 0.03;
		} else if (money <= 1000000) {
			bonus = 100000 * 0.1 + 100000 * 0.075 + 200000 * 0.05 + 200000 * 0.03 + (money - 600000) * 0.015;
		} else {
			bonus = 100000 * 0.1 + 100000 * 0.075 + 200000 * 0.05 + 200000 * 0.03 + 400000 * 0.015
					+ (money - 1000000) * 0.01;
		}
		System.out.println("��������Ϊ" + money + ",���Ž���Ϊ" + bonus);
	}
}
