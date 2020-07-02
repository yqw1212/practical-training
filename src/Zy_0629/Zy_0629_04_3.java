package Zy_0629;

public class Zy_0629_04_3 {
	/**
	 * @Author: 
	 * @Date 2020/6/29 23:05
	 **/
	public static void main(String[] args) {
		result();
	}
	public static void result() {
		int flag = 0;
		for(int i=201;;i++) {
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					break;
				}
				if(j==i-1) {
					flag=1;
				}
			}
			if(flag==1) {
				System.out.println(i);
				break;
			}
		}
	}
}
