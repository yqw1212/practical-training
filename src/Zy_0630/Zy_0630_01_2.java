package Zy_0630;

/**
 * @author: 
 * @Date: 2020年6月30日
 * @Description:
 */
public class Zy_0630_01_2 {
	public static void main(String[] args) {
		
		//测试
		Rectangle rectangle = new Rectangle(4, 5);
		rectangle.showAll();
	}
}

class Rectangle {
	
	//私有属性
	private int length, width;

	Rectangle(int width, int length) {
		this.length = length;
		this.width = width;
	}

	public int getArea() {
		return this.length * this.width;
	}

	public int getPer() {
		return (this.length + this.width) * 2;
	}

	public void showAll() {
		System.out.println("长:" + this.length + ",宽:" + this.width + ",面积:" + getArea() + "周长:" + getPer());
	}

}
