package Zy_0629;

public class Zy_0629_02_9 {
	/**
	 * @Author: 
	 * @Date 2020/6/29 19:33
	 **/
	public static void main(String[] args) {
		int num = (int) (Math.random() * 100000);
		System.out.println(num);
		perNum(num);

	}

	public static void perNum(int num) {
		len++;
		if (num < 10) {
			System.out.println(num);
			System.out.println(len + "Î»Êý");
			return;
		} else {
			System.out.println(num % 10);
			perNum(num / 10);
		}
	}

	private static int len = 0;
}
