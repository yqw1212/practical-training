package Zy_0630;

/**
 * @author: 
 * @Date: 2020��6��30��
 * @Description:
 */
public class Zy_0630_01_3 {
	public static void main(String[] args) {
		
		//����
		Notebook notebook = new Notebook(8556, 'r');
		notebook.show();
	}
}

class Notebook {
	
	//˽������
	private int code;
	private char color;

	Notebook() {
	}

	Notebook(int code, char color) {
		this.code = code;
		this.color = color;
	}

	public void show() {
		System.out.println("�ͺ�:" + getCode() + ",��ɫ:" + getColor());
	}

	public int getCode() {
		return code;
	}

	public char getColor() {
		return color;
	}

}
