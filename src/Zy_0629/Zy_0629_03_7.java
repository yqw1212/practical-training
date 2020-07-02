package Zy_0629;

public class Zy_0629_03_7 {
	/**
	 * @Author: 
	 * @Date 2020/6/29 22:45
	 **/
	public static void main(String[] args) {
		int[] array1 = {1,2,3,4};
		for(int i=0;i<array1.length/2;i++) {
			int f;
			f = array1[i];
			array1[i] = array1[array1.length-1-i];
			array1[array1.length-1-i] = f;
		}
		for(int i=0;i<array1.length;i++) {
			System.out.print(array1[i]+" ");
		}
	}
}
