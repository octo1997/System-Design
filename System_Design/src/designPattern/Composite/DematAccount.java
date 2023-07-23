package designPattern.Composite;

public class DematAccount extends Component {
	long balance;
	int accntNo;

	public DematAccount(long balance, int accntNo) {
		super();
		this.balance = balance;
		this.accntNo = accntNo;
	}

	@Override
	public AccountStatement getStatement() {
		// TODO Auto-generated method stub
		return statement;
	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}

}
