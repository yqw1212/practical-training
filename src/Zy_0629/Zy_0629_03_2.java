package Zy_0629;

public class Zy_0629_03_2 {
	/**
	 * @Author: 
	 * @Date 2020/6/29 19:44
	 **/
	public static void main(String[] args) {
		char[] charArray1 = { 'n', 'e', 'u', 's', 'o', 'f', 't', 'e', 'd', 'u', 'c', 'a', 't', 'i', 'o', 'n' };
		char[] charArray2 = new char[16];
		System.arraycopy(charArray1, 0, charArray2, 0, 16);

		System.out.print("charArray1:");
		System.out.println(charArray1);

		System.out.print("charArray2:");
		System.out.println(charArray2);
	}
}
