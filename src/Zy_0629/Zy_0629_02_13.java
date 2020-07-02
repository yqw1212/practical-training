package Zy_0629;

public class Zy_0629_02_13 {
	/**
	 * @Author: 
	 * @Date 2020/6/29 22:15
	 **/
	public static void main(String[] args) {
		int for_sum = 0;
		int while_sum = 0;
		int do_sum = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				for_sum += i;
			}
		}
		System.out.println("forÑ­»·:" + for_sum);

		int i = 1;
		while (i <= 100) {
			if (i % 3 == 0) {
				while_sum += i;
			}
			i++;
		}
		System.out.println("whileÑ­»·:" + while_sum);

		i = 1;
		do {
			if (i % 3 == 0) {
				do_sum += i;
			}
			i++;
		} while (i <= 100);
		System.out.println("doÑ­»·:" + do_sum);

	}
}
