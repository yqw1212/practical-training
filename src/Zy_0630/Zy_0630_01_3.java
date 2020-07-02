package Zy_0630;

/**
 * @author: 
 * @Date: 2020年6月30日
 * @Description:
 */
public class Zy_0630_01_3 {
	public static void main(String[] args) {
		
		//测试
		Notebook notebook = new Notebook(8556, 'r');
		notebook.show();
	}
}

class Notebook {
	
	//私有属性
	private int code;
	private char color;

	Notebook() {
	}

	Notebook(int code, char color) {
		this.code = code;
		this.color = color;
	}

	public void show() {
		System.out.println("型号:" + getCode() + ",颜色:" + getColor());
	}

	public int getCode() {
		return code;
	}

	public char getColor() {
		return color;
	}

}
