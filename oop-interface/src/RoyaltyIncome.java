
/**
 * 稿费收入税率是20%
 */
public class RoyaltyIncome implements Income {

	// TODO
	private double income;

	public RoyaltyIncome(double income) {
		this.income = income;
	}

	@Override
	public double GetIncome() {
		return this.income;
	}

}
