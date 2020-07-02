package Zy_0630;

/**
 * @author: 
 * @Date: 2020��6��30��
 * @Description:
 */
public class Zy_0630_01_1 {
	public static void main(String[] args) {
		
		//����
		Point point1 = new Point(1, 2);
		Point point2 = new Point(4, 5);

		point1.movePoint(3, 3);
		point2.movePoint(1, -2);

		System.out.println("p1����(" + point1.getX() + "," + point1.getY() + ")");
		System.out.println("p2����(" + point2.getX() + "," + point2.getY() + ")");
	}
}

class Point {
	private int x, y;

	Point() {
	}

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void movePoint(int dx, int dy) {
		/**
		 * ��x������dx����λ��y������dy����λ
		 */
		this.x += dx;
		this.y += dy;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

}