package Zy_0630;

import java.util.Scanner;

/**
 * @author: 
 * @Date: 2020��7��1��
 * @Description:
 */
public class Zy_0630_03_1 {
	public static void main(String[] args) {
		Gardener g = new Gardener();
		g.create();
	}
}


/**
 * @author: ������20195503
 * @Date: 2020��7��1��
 * @Description:ˮ���ӿ�
 */
interface Fruit{
}

class Apple implements Fruit{
	public Apple() {
		System.out.println("������һ��ƻ����Ķ���");
	}
}

class Banana implements Fruit{
	public Banana() {
		System.out.println("������һ���㽶��Ķ���");
	}
}

class Grape implements Fruit{
	public Grape() {
		System.out.println("������һ��������Ķ���");
	}
}

class Gardener{
	public Fruit create() {
		
		//�û�����
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		
		//switch�ж�
		Fruit fruit = null;
		switch(name){
		case "ƻ��":
			fruit = new Apple();
			break;
		case "�㽶":
			fruit = new Banana();
			break;
		case "����":
			fruit = new Grape();
			break;
		}
		
		return fruit;
	}
}