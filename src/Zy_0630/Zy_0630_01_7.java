package Zy_0630;

/**
 * @author: 
 * @Date: 2020��7��1��
 * @Description:
 */
public class Zy_0630_01_7 {
	public static void main(String[] args) {
		
		//����
		Vehicle vehicle = new Vehicle("BMW", "black");
		vehicle.run();
	}
}

class Vehicle {
	
	//˽������
	private String brand;
	private String color;
	private double speed;

	Vehicle(String brand, String color) {
		this.brand = brand;
		this.color = color;
		this.speed = 0;
	}

	public String getBrand() {
		return brand;
	}

	public String getColor() {
		return color;
	}

	public double getSpeed() {
		return speed;
	}

	public void run() {
		System.out.println("���ܰɣ�������");
	}
}
