package Zy_0629;

public class Zy_0629_01_3 {
	/**
	 * @Author: 
	 * @Date 2020/6/29 19:04
	 **/
	public static void main(String[] args) {
		System.out.println("35���϶�ת��Ϊ�������϶�Ϊ" + toFahrenheit((double) 35));
		System.out.println("60�������϶�ת��Ϊ���϶�Ϊ" + toCentigrade((double) 60));
	}

	public static double toFahrenheit(Double degree) {
		return degree * 9 / 5 + 32;
	}

	public static double toCentigrade(Double degree) {
		return (degree - 32) * 5 / 9;
	}
}
