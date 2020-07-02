package Zy_0630;

import java.util.Scanner;

/**
 * @author: 
 * @Date: 2020年7月1日
 * @Description:
 */
public class Zy_0630_03_1 {
	public static void main(String[] args) {
		Gardener g = new Gardener();
		g.create();
	}
}


/**
 * @author: 闫琦文20195503
 * @Date: 2020年7月1日
 * @Description:水果接口
 */
interface Fruit{
}

class Apple implements Fruit{
	public Apple() {
		System.out.println("创建了一个苹果类的对象");
	}
}

class Banana implements Fruit{
	public Banana() {
		System.out.println("创建了一个香蕉类的对象");
	}
}

class Grape implements Fruit{
	public Grape() {
		System.out.println("创建了一个葡萄类的对象");
	}
}

class Gardener{
	public Fruit create() {
		
		//用户输入
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		
		//switch判断
		Fruit fruit = null;
		switch(name){
		case "苹果":
			fruit = new Apple();
			break;
		case "香蕉":
			fruit = new Banana();
			break;
		case "葡萄":
			fruit = new Grape();
			break;
		}
		
		return fruit;
	}
}