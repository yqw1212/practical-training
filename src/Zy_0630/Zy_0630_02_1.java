package Zy_0630;

/**
 * @author: 
 * @Date: 2020年7月1日
 * @Description:
 */
public class Zy_0630_02_1 {
	public static void main(String[] args) {
		//测试
		
		Player[] players = new Player[12];
		//使用循环创建12次
		for (int i = 0; i < 12; i++) {
			players[i] = Player.create();
		}
	}
}

class Player {
	
	//计数器
	static int count = 0;

	//构造方法设为私有
	private Player() {
	}

	public static Player create() {
		Player player = null;
		if (count < 11) {
			count++;
			player = new Player();
			System.out.println("已经创建了" + count + "个对象");
			return player;
		} else {
			System.out.println("已经创建了11个对象, 不能再创建");
		}
		return null;
	}
}