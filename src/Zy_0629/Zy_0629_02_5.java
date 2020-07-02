package Zy_0629;

public class Zy_0629_02_5 {
	/**
	 * @Author: 
	 * @Date 2020/6/29 19:18
	 **/
	public static void main(String[] args) {
		int num = (int) (Math.random() * 10 + 1);
		System.out.println("num=" + num);
		if (num % 5 == 0 && num % 6 == 0) {
			System.out.println("能被5和6整除");
		} else if (num % 5 == 0) {
			System.out.println("能被5整除");
		} else if (num % 6 == 0) {
			System.out.println("能被6整除");
		} else {
			System.out.println("不能被5或6整除");
		}
	}
}
