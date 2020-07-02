package Zy_0629;

public class Zy_0629_02_10 {
	/**
	 * @Author: 
	 * @Date 2020/6/29 22:00
	 **/
	public static void main(String[] args) {
		double money = 30000;
		for (int i = 0; i < 10; i++) {
			money *= 1.06;
			System.out.println("µÚ" + (i + 1) + "ÄêÐ½Îª" + money);
		}
	}
}
