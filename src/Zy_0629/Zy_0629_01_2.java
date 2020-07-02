package Zy_0629;


public class Zy_0629_01_2 {
	/**
	 * @Author: 
	 * @Date 2020/6/29 19:02
	 **/
	public static void main(String[] args) {
		int number = (int) (Math.random() * 1000 + 1);
		System.out.println("number=" + number + ",各位数的和=" + add(number));
	}

	public static int add(int num) {
		if (num < 10) {
			return num;
		} else {
			return num % 10 + add(num / 10);
		}
	}
}
