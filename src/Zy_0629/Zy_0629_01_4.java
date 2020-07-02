package Zy_0629;

public class Zy_0629_01_4 {
	/**
	 * @Author:
	 * @Date 2020/6/29 19:06
	 **/
	public static void main(String[] args) {
		char letter = 'A';
		System.out.println("letter=" + letter + ",转化后为" + tolowwer(letter));
	}

	public static char tolowwer(char letter) {
		return (char) (letter + 32);
	}
}
