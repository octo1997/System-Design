package designPattern.Composite;

public class Exceutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Component cps = new CompositeAccount();
		
		cps.addAccount(new DematAccount(500, 1));
		cps.addAccount(new CurrencyAccount(5000, 1));
		
		System.out.println(cps.getBalance());
	}

}
