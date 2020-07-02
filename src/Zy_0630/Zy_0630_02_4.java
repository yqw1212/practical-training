package Zy_0630;

import java.util.Calendar;

/**
 * @author: 
 * @Date: 2020年7月1日
 * @Description:
 */
public class Zy_0630_02_4 {
	public static void main(String[] args) {
		TestCompany.main(null);
	}
}

class TestCompany {
	public static void main(String[] args) {

		// 把若干各种类型的员工放在一个ColaEmployee数组里
		ColaEmployee[] colaEmployees = { new SalariedEmployee("salariedEmployee", 8, 5000),
				new HourlyEmployee("hourlyEmployee", 5, 100, 200), new SalesEmployee("salesEmployee", 1, 0.66, 50000) };

		// 打印每个员工当月的工资
		for (ColaEmployee colaEmployee : colaEmployees) {
			new Company().getSalary(colaEmployee, 5);
		}
	}
}

class Company {
	// 打印出某月某个员工的工资数额
	public void getSalary(ColaEmployee c, int month) {
		System.out.println(c.getName() + month + "月的月薪为" + c.getSalary(month) + "元");
	}
}

class SalesEmployee extends ColaEmployee {
	private double rate;
	private int sell;

	SalesEmployee(String name, int month, double rate, int sell) {
		super(name, month);
		this.rate = rate;
		this.sell = sell;
	}

	public double getSalary(int month) {
		/**
		 * 工资=月销售额*提成率
		 */
		if (month == super.month) {
			return sell * rate + 100;
		} else {
			return sell * rate;
		}
	}

}

class HourlyEmployee extends ColaEmployee {

	private int hours;
	private int moneyPerHour;

	HourlyEmployee(String name, int month, int moneyPerHour, int hours) {
		super(name, month);
		this.moneyPerHour = moneyPerHour;
		this.hours = hours;
	}

	public double getSalary(int month) {
		/**
		 * 每月工作超出160 小时的部分按照1.5 倍工资发放。
		 */
		if (month == super.month) {
			if (hours > 160) {
				return moneyPerHour * 160 + moneyPerHour * (hours - 160) * 1.5 + 100;
			} else {
				return moneyPerHour * hours + 100;
			}
		} else {
			if (hours > 160) {
				return moneyPerHour * 160 + moneyPerHour * (hours - 160) * 1.5 + 100;
			} else {
				return moneyPerHour * hours + 100;
			}
		}
	}

}

class SalariedEmployee extends ColaEmployee {
	private double money;

	public SalariedEmployee(String name, int month, double money) {
		super(name, month);
		this.money = money;
	}

	public double getSalary(int month) {
		if (month == super.month) {
			return money + 100;
		} else {
			return money;
		}
	}
}

class ColaEmployee {

	// 私有属性
	private String name;
	protected int month;

	ColaEmployee(String name, int month) {
		this.name = name;
		this.month = month;
	}

	public double getSalary(int month) {
		return 0;
	}

	public String getName() {
		return name;
	}

}
