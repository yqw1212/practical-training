package Zy_0630;

/**
 * @author: 
 * @Date: 2020��7��1��
 * @Description:
 */
public class Zy_0630_02_2 {
	public static void main(String[] args) {
		
		//����
		VehicleTest.main(null);
		Test.main(null);
		
	}
}

/**
 * @author: ������20195503
 * @Date: 2020��7��1��
 * @Description:������
 */
class Test{
	public static void main(String[] args) {
		Car car = new Car("Honda","red",2);
		car.run();
	}
}

/**
 * @author: ������20195503
 * @Date: 2020��7��1��
 * @Description:������
 */
class VehicleTest{
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle("benz", "black");
		vehicle.run();
	}
}

class Vehicle{
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

class Car extends Vehicle{
	Car(String brand, String color,int loader) {
		super(brand, color);
		this.loader = loader;
	}
	
	@Override
	public void run() {
		System.out.println("���ܰɣ��γ���");
	}
	
	private int loader;
	
}