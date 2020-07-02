package Zy_0630;

/**
 * @author:
 * @Date: 2020年7月1日
 * @Description:
 */
public class Zy_0630_02_3 {
	public static void main(String[] args) {
		//测试
		PolyDemo.main(null);
	}
}

/**
 * @author: 闫琦文20195503
 * @Date: 2020年7月1日
 * @Description:测试类
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
	
	//私有属性，半径
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
		System.out.println("面积:" + getArea() + ",周长:" + getPer() + ",颜色:" + getColor());
	}

}

class Rectangle extends Shape {
	private int width;//宽
	private int height;//长

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
		System.out.println("面积:" + getArea() + ",周长:" + getPer() + ",颜色:" + getColor());
	}
}

class Shape {
	private int area;//面积
	private int per;//周长
	private String color;//颜色

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
		System.out.println("面积:" + getArea() + ",周长:" + getPer() + ",颜色:" + getColor());
	}
}