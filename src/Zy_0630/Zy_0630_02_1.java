package Zy_0630;

/**
 * @author: 
 * @Date: 2020��7��1��
 * @Description:
 */
public class Zy_0630_02_1 {
	public static void main(String[] args) {
		//����
		
		Player[] players = new Player[12];
		//ʹ��ѭ������12��
		for (int i = 0; i < 12; i++) {
			players[i] = Player.create();
		}
	}
}

class Player {
	
	//������
	static int count = 0;

	//���췽����Ϊ˽��
	private Player() {
	}

	public static Player create() {
		Player player = null;
		if (count < 11) {
			count++;
			player = new Player();
			System.out.println("�Ѿ�������" + count + "������");
			return player;
		} else {
			System.out.println("�Ѿ�������11������, �����ٴ���");
		}
		return null;
	}
}