package Zy_0630;

/**
 * @author: 
 * @Date: 2020��7��1��
 * @Description:
 */
public class Zy_0630_01_6 {
	public static void main(String[] args) {
		
		//�����鴢��
		Student[] students = new Student[5];

		students[0] = new Student("С��", "A123", 67);
		students[1] = new Student("С��", "B123", 32);
		students[2] = new Student("СҰ", "C123", 94);
		students[3] = new Student("Сɭ", "D123", 37);
		students[4] = new Student("С��", "E123", 75);

		desc(students);
	}

	//����
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
	
	//˽������
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
		return "����:" + getName() + ",ѧ��:" + getCode() + ",�ɼ�:" + getGrade();
	}
}