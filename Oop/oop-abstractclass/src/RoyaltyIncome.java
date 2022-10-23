
/**
 * 稿费收入税率是20%
 */
public class RoyaltyIncome extends Income {

	// TODO
	public RoyaltyIncome(double income) {
		super(income);
	}

	@Override
	public double GetIncome() {
		return this.income;
	}

}
