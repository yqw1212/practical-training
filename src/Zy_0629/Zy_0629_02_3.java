package Zy_0629;

public class Zy_0629_02_3 {
	/**
	 * @Author: 
	 * @Date 2020/6/29 19:13
	 **/
	public static void main(String[] args) {
		int num = (int) (Math.random()*10+1);
		if(num%2==0) {
			System.out.println(num+"为偶数");
		}else{
			System.out.println(num+"为奇数");
		}
	}
}
