package Zy_0630;

/**
 * @author: 
 * @Date: 2020��6��30��
 * @Description:
 */
public class Zy_0630_01_2 {
	public static void main(String[] args) {
		
		//����
		Rectangle rectangle = new Rectangle(4, 5);
		rectangle.showAll();
	}
}

class Rectangle {
	
	//˽������
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
		System.out.println("��:" + this.length + ",��:" + this.width + ",���:" + getArea() + "�ܳ�:" + getPer());
	}

}
