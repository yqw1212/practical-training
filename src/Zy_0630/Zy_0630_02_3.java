package Zy_0630;

/**
 * @author:
 * @Date: 2020��7��1��
 * @Description:
 */
public class Zy_0630_02_3 {
	public static void main(String[] args) {
		//����
		PolyDemo.main(null);
	}
}

/**
 * @author: ������20195503
 * @Date: 2020��7��1��
 * @Description:������
 */
class PolyDemo{
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(4, 5, "green");
		Circle circle = new Circle("white", 6);

		rectangle.showAll();
		circle.showAll();
	}
}

class Circle extends Shape {
	
	//˽�����ԣ��뾶
	private int radius;

	Circle(String color, int radius) {
		super(color);
		this.radius = radius;
	}

	public int getPer() {
		return (int) (2 * this.radius * Math.PI);
	}

	public int getArea() {
		return (int) (this.radius * this.radius * Math.PI);
	}

	public void showAll() {
		System.out.println("���:" + getArea() + ",�ܳ�:" + getPer() + ",��ɫ:" + getColor());
	}

}

class Rectangle extends Shape {
	private int width;//��
	private int height;//��

	Rectangle(int width, int height, String color) {
		super(color);
		this.width = width;
		this.height = height;
	}

	public int getPer() {
		return 2 * (this.width + this.height);
	}

	public int getArea() {
		return this.width * this.height;
	}

	public void showAll() {
		System.out.println("���:" + getArea() + ",�ܳ�:" + getPer() + ",��ɫ:" + getColor());
	}
}

class Shape {
	private int area;//���
	private int per;//�ܳ�
	private String color;//��ɫ

	Shape() {
	}

	Shape(String color) {
		this.color = color;
	}

	public int getArea() {
		return area;
	}

	public int getPer() {
		return per;
	}

	public String getColor() {
		return color;
	}

	public void showAll() {
		System.out.println("���:" + getArea() + ",�ܳ�:" + getPer() + ",��ɫ:" + getColor());
	}
}