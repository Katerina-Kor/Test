package by.htp.test.logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import by.htp.test.bean.Account;
import by.htp.test.bean.Customer;

public class Logic {
	public List<Account> searchAccForCust(List<Account> accounts, Customer customer) {
		List<Account> rez = new ArrayList<Account>();
		
		for(Account currentAccount : accounts) {
			if(currentAccount.getHolder().equals(customer)) {
				rez.add(currentAccount);
			}
		}
		
		return rez;
	}
	
	public Customer searchCustByAcc(List<Account> accounts, String accountNumber) {
		Customer rez;
		
		for(Account currentAccount : accounts) {
			if(currentAccount.getAccountNumber().equalsIgnoreCase(accountNumber)) {
				rez = currentAccount.getHolder();
				return rez;
			}
		}
		return null;
	}
	
	public List<Account> sortByBalanceMax(List<Account> accounts){
		List<Account> rez = new ArrayList<>();
		
		rez.addAll(accounts);
		
		for(int i = 0; i < rez.size(); i++) {
			for(int j = 0; j < rez.size() - i - 1; j++) {
				Account a1 = rez.get(j);
				Account a2 = rez.get(j + 1);
				
				if(a1.getBalance() < a2.getBalance()) {
					Collections.swap(rez, j, j + 1);
				}
			}
		}
		return rez;
	}
	
	public double totalForCust(List<Account> accounts, Customer customer) {
		List<Account> customerAccounts = new ArrayList<>();
		customerAccounts = searchAccForCust(accounts, customer);
		double sum = 0;
		
		for(Account currentAccount : customerAccounts) {
			sum += currentAccount.getBalance();
		}
		return sum;
	}
	
	public double creditTotalForCust(List<Account> accounts, Customer customer) {
		List<Account> customerAccounts = new ArrayList<>();
		customerAccounts = searchAccForCust(accounts, customer);
		double sum = 0;
		
		for(Account currentAccount : customerAccounts) {
			if(currentAccount.getBalance() >= 0) {
				sum += currentAccount.getBalance();
			}
		}
		return sum;
	}
	
	public double debitTotalForCust(List<Account> accounts, Customer customer) {
		List<Account> customerAccounts = new ArrayList<>();
		customerAccounts = searchAccForCust(accounts, customer);
		double sum = 0;
		
		for(Account currentAccount : customerAccounts) {
			if(currentAccount.getBalance() < 0) {
				sum += currentAccount.getBalance();
			}
		}
		return sum;
	}
}
