package Zy_0630;

/**
 * @author: 
 * @Date: 2020年6月30日
 * @Description:
 */
public class Zy_0630_01_1 {
	public static void main(String[] args) {
		
		//测试
		Point point1 = new Point(1, 2);
		Point point2 = new Point(4, 5);

		point1.movePoint(3, 3);
		point2.movePoint(1, -2);

		System.out.println("p1坐标(" + point1.getX() + "," + point1.getY() + ")");
		System.out.println("p2坐标(" + point2.getX() + "," + point2.getY() + ")");
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
		 * 将x点右移dx个单位，y点上移dy个单位
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