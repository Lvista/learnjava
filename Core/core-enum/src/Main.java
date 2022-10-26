/*
 * @author Liaoxuefeng
 * 
 * @modify Lvista
 * 
 * @description
 * 1、枚举类型enum，可用于定义一串枚举数据，它在编译器编译为何一般class一样，
 * 2、可用obj.name()来访问该对象名称，但不可被覆写。用obj.toString()可进行覆写来
 * 返回希望看到的值
 * 3、非常适合用switch语句
 */

public class Main {
	public static void main(String[] args) {
		Weekday day = Weekday.SUN;
		
		//switch语句
		switch (day) {
		case MON:
		case TUE:
		case WED:
		case THU:
		case FRI:
			System.out.println("Today is " + day + ". Work at office!");
			break;
		case SAT:
		case SUN:
			System.out.println("Today is " + day.name() + ". Work at home!");
			break;
		default:
			throw new RuntimeException("cannot process " + day);
		}
		
		//if语句，注意class的字段比较
		if (day.dayValue == 6 || day.dayValue == 0) {
			System.out.println("Today is " + day + ". Work at home!");
		} else {
			System.out.println("Today is " + day + ". Work at office!");
		}
	}
}

enum Weekday {
	MON(1, "星期一"), // public static final Weekday MON = new Weekday(1, "星期一");
	TUE(2, "星期二"), // public static final Weekday TUE = new Weekday(2, "星期二");
	WED(3, "星期三"), // public static final Weekday WED = new Weekday(3, "星期三");
	THU(4, "星期四"), // public static final Weekday THU = new Weekday(4, "星期四");
	FRI(5, "星期五"), // public static final Weekday FRI = new Weekday(5, "星期五");
	SAT(6, "星期六"), // public static final Weekday SAT = new Weekday(6, "星期六");
	SUN(0, "星期日"); // public static final Weekday SUN = new Weekday(0, "星期日");

	public final int dayValue;
	private final String chinese;

	// 将上面括号内的值在class内部进行实例
	private Weekday(int dayValue, String chinese) {
		this.dayValue = dayValue;
		this.chinese = chinese;
	}

	/*
	 * 在println()调用obj.toString时使用该覆写的toString 若不覆写则输出“SUN”
	 */

	@Override
	public String toString() {
		return this.chinese;
	}
}
