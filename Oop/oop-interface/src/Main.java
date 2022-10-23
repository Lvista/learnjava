
/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 * 
 * @modify Lvista
 * 
 * @description 接口是更为抽象的抽象类父类，接口只能存在抽象方法，
 不允许实例字段，可以参考下表：
---------------abstract class-------------------interface
继承---------只能extends一个class---------可以implements多个interface
字段-----------	可以定义实例字段----------------不能定义实例字段
抽象方法---------可以定义抽象方法-----------------可以定义抽象方法
非抽象方法-------可以定义非抽象方法----------------可以定义default方法
 */
public class Main {

	public static void main(String[] args) {
		// TODO: 用接口给一个有工资收入和稿费收入的小伙伴算税:
		Income[] incomes = new Income[] {
//				new Income(3000), 
				new SalaryIncome(7500), new RoyaltyIncome(12000) };
		double total = 0;
		// TODO:
		for (Income income : incomes) {
			total += income.GetIncome();
		}
		System.out.println(total);
	}

}
