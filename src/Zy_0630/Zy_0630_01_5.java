package Zy_0630;

/**
 * @author: 
 * @Date: 2020��7��1��
 * @Description:
 */
public class Zy_0630_01_5 {
	public static void main(String[] args) {
		
		//����
		Person zhangsan = new Person("zhangsan", 33, 1.73);
		Person lishi = new Person("lishi", 44, 1.74);

		zhangsan.sayHello();
		lishi.sayHello();
	}
}

class Person {
	
	//˽������
	private String name;
	private int age;
	private double weight;

	Person(String name, int age, double weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}

	public void sayHello() {
		System.out.println("hello,my name is " + this.getName());
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getWeight() {
		return weight;
	}

}
