package Zy_0629;

import java.util.Scanner;

public class Zy_0629_02_12 {
	/**
	 * @Author: 
	 * @Date 2020/6/29 22:10
	 **/
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double money = scanner.nextDouble();
		double charge = 0;
		if (money < 100) {
			charge = 1;
		} else if (money <= 5000) {
			charge = money * 0.01;
		} else {
			charge = 50;
		}
		System.out.println("»ã·ÑÎª" + charge + "Ôª");
	}
}
