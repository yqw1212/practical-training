package Zy_0630;

import java.util.Random;

/**
 * @author: 
 * @Date: 2020年7月1日
 * @Description:
 */
public class Zy_0630_03_2 {
	public static void main(String[] args) {
		Student[] students = new Student[5];
		Random random = new Random();

		//使用随机数给该数组装入各系学生的对象
		for (int i = 0; i < 5; i++) {
			int course = Math.abs(random.nextInt()) % 3;
			String sexString = "";
			int sex = Math.abs(random.nextInt()) % 2;

			switch (sex) {
			case 0: {
				sexString = "男";
				break;
			}
			case 1: {
				sexString = "女";
				break;
			}
			}

			switch (course) {
			case 0: {
				students[i] = new English(String.valueOf(Math.abs(random.nextInt()) % 1000), "student" + i, sexString,
						Math.abs(random.nextInt()) % 80, (double) Math.abs(random.nextInt()) % 100,
						(double) Math.abs(random.nextInt()) % 100, (double) Math.abs(random.nextInt()) % 100);
				break;
			}
			case 1: {
				students[i] = new Computer(String.valueOf(Math.abs(random.nextInt()) % 1000), "student" + i, sexString,
						Math.abs(random.nextInt()) % 80, (double) Math.abs(random.nextInt()) % 100,
						(double) Math.abs(random.nextInt()) % 100, (double) Math.abs(random.nextInt()) % 100,
						(double) Math.abs(random.nextInt()) % 100);
				break;
			}
			case 2: {
				students[i] = new Literature(String.valueOf(Math.abs(random.nextInt()) % 1000), "student" + i,
						sexString, Math.abs(random.nextInt()) % 80, (double) Math.abs(random.nextInt()) % 100,
						(double) Math.abs(random.nextInt()) % 100, (double) Math.abs(random.nextInt()) % 100,
						(double) Math.abs(random.nextInt()) % 100);
				break;
			}
			}

		}
		
		//输出信息
		for (Student student : students) {
			System.out.println(student);
		}
	}
}

class Student {
	//私有属性
	private String name;
	private String ID;
	private String sex;
	private int age;
	protected double grade;

	public Student(String ID, String name, String sex, int age) {
		this.name = name;
		this.ID = ID;
		this.sex = sex;
		this.age = age;
	}

	public String toString() {
		return "学号:" + this.ID + " 姓名：" + this.name + " 性别：" + this.sex + " 年龄：" + this.age + " 综合成绩：" + this.grade;
	}
}

class English extends Student {
	//构造方法
	English(String ID, String name, String sex, int age, double speech, double end, double mid) {
		super(ID, name, sex, age);
		super.grade = speech * 0.5 + end * 0.25 + mid * 0.25;
	}
}

class Computer extends Student {
	//构造方法
	Computer(String ID, String name, String sex, int age, double operate, double english, double end, double mid) {
		super(ID, name, sex, age);
		super.grade = operate * 0.4 + english * 0.2 + end * 0.2 + mid * 0.2;
	}
}

class Literature extends Student {
	//构造方法
	Literature(String ID, String name, String sex, int age, double speech, double work, double end, double mid) {
		super(ID, name, sex, age);
		super.grade = speech * 0.35 + work * 0.35 + end * 0.15 + mid * 0.15;
	}
}