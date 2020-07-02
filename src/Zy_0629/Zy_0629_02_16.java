package Zy_0629;

public class Zy_0629_02_16 {
	/**
	 * @Author: 
	 * @Date 2020/6/29 22:30
	 **/
	public static void main(String[] args) {
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
