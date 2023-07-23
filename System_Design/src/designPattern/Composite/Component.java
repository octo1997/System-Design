package designPattern.Composite;

import java.util.ArrayList;
import java.util.List;

public abstract class Component {
	protected List<Component> accounts = new ArrayList<Component>();
	protected AccountStatement statement;
	public abstract AccountStatement getStatement();
	public abstract double getBalance();
	
	public Component getChild(int i) {
		return accounts.get(i);
	}
	
	public void addAccount(Component acc) {
		accounts.add(acc);
	}
	
	public void delAccount(Component acc) {
		accounts.remove(acc);
	}
}
