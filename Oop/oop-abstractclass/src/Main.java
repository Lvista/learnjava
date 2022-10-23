
/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 * 
 * @modify Lvista
 * 
 * @Description 抽象类可以描述为一种隐性父类，不在主函数中使用，
 只用于给子类提供模板
 * 
 * 
 */
public class Main {

	public static void main(String[] args) {
		// TODO: 用抽象类给一个有工资收入和稿费收入的小伙伴算税:
		Income[] incomes = new Income[] { 
				new SalaryIncome(7500), //无法使用new Income();
				new RoyaltyIncome(12000) 
				};
		double total = 0;
		// TODO:
		for (Income income : incomes) {
			total += income.GetIncome();
		}
		System.out.println(total);
	}

}
