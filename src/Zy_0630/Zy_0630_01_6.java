package Zy_0630;

/**
 * @author: 
 * @Date: 2020年7月1日
 * @Description:
 */
public class Zy_0630_01_6 {
	public static void main(String[] args) {
		
		//用数组储存
		Student[] students = new Student[5];

		students[0] = new Student("小明", "A123", 67);
		students[1] = new Student("小王", "B123", 32);
		students[2] = new Student("小野", "C123", 94);
		students[3] = new Student("小森", "D123", 37);
		students[4] = new Student("小红", "E123", 75);

		desc(students);
	}

	//排序
	public static void desc(Student[] students) {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (students[j].getGrade() < students[j + 1].getGrade()) {
					Student s = null;
					s = students[j];
					students[j] = students[j + 1];
					students[j + 1] = s;
				}
			}
		}
		for (Student i : students) {
			System.out.println(i);
		}
	}
}

class Student {
	
	//私有属性
	String name;
	String code;
	int grade;

	Student(String name, String code, int grade) {
		this.name = name;
		this.code = code;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public String getCode() {
		return code;
	}

	public int getGrade() {
		return grade;
	}

	public String toString() {
		return "姓名:" + getName() + ",学号:" + getCode() + ",成绩:" + getGrade();
	}
}