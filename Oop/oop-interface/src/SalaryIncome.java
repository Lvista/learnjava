
public class SalaryIncome implements Income {

	// TODO
	private double income;

	public SalaryIncome(double income) {
		this.income = income;
	}

	@Override
	public double GetIncome() {
		return this.income;
	}

}
