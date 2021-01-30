package by.htp.test.bean;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	private List<Customer> customers;
	private List<Account> accounts;
	
	public Bank() {
		customers = new ArrayList<>();
		accounts = new ArrayList<>();
	}
	
	public boolean add(Customer customer) {
		return customers.add(customer);
	}
	
	public boolean remove(Customer customer) {
		return customers.remove(customer);
	}
	
	public boolean add(Account account) {
		return accounts.add(account);
	}
	
	public boolean remove(Account account) {
		return accounts.remove(account);
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accounts == null) ? 0 : accounts.hashCode());
		result = prime * result + ((customers == null) ? 0 : customers.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bank other = (Bank) obj;
		if (accounts == null) {
			if (other.accounts != null)
				return false;
		} else if (!accounts.equals(other.accounts))
			return false;
		if (customers == null) {
			if (other.customers != null)
				return false;
		} else if (!customers.equals(other.customers))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Bank [customers=" + customers + ", accounts=" + accounts + "]";
	}

		
	
	

}
