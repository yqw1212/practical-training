package Zy_0630;

/**
 * @author:
 * @Date: 2020��6��30��
 * @Description:
 */
public class Zy_0630_01_4 {
	public static void main(String[] args) {
		PersonCreate.main(null);
		
	}
}

class Person {
	private String name;
	private double height;
	private int age;

	public void sayHello() {
		System.out.println("hello,my name is " + this.getName());
	}

	public String getName() {
		return name;
	}

	public double getHeight() {
		return height;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

/**
 * @author: ������20195503
 * @Date: 2020��7��1��
 * @Description:������
 */
class PersonCreate {

	
	public static void main(String[] args) {
		
		//����
		Person zhangsan = new Person();
		zhangsan.setName("zhangsan");
		zhangsan.setAge(33);
		zhangsan.setHeight(1.73);

		Person lishi = new Person();
		lishi.setName("lishi");
		lishi.setAge(44);
		lishi.setHeight(1.74);

		zhangsan.sayHello();
		lishi.sayHello();
	}
}
