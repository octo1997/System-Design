package designPattern.Composite;

public class CompositeAccount extends Component {

	
	
	
	@Override
	public AccountStatement getStatement() {
		// TODO Auto-generated method stub
		statement = new AccountStatement();
		for(Component cpt : accounts) {
			statement.concatenate(cpt.getStatement());
		}
		
		return statement;
	}

	@Override
	public double getBalance() {
		int total = 0;
		for(Component cpt : accounts) {
			total += cpt.getBalance();
		}
		
		return total;
	}

}
