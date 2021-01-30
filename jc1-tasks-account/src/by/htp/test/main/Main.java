package by.htp.test.main;

import java.util.List;

import by.htp.test.bean.Account;
import by.htp.test.bean.Bank;
import by.htp.test.bean.Customer;
import by.htp.test.logic.Logic;

public class Main {

	public static void main(String[] args) {
		Bank bank = new Bank();
		
		Customer IvanPetrov = new Customer("Ivan", "Petrov");
		Customer PetrIvanov = new Customer("Petr", "Ivanov");
		Customer SonyaArg = new Customer("Sonya", "Arg");
		Customer VladSerov = new Customer("Vlad", "Serov");
		
		Account ac1 = new Account("12345", 15, IvanPetrov);
		Account ac2 = new Account("12346", 20, IvanPetrov);
		Account ac3 = new Account("12347", -50, PetrIvanov);
		Account ac4 = new Account("12348", 100, PetrIvanov);
		Account ac5 = new Account("12349", 2, PetrIvanov);
		Account ac6 = new Account("12350", 80, PetrIvanov);
		Account ac7 = new Account("12351", 200, SonyaArg);
		Account ac8 = new Account("12352", 56, VladSerov);
		Account ac9 = new Account("12353", VladSerov);
		Account ac10 = new Account("12354", VladSerov);
		Account ac11 = new Account("12355", VladSerov);
		
		
		bank.add(IvanPetrov);
		bank.add(PetrIvanov);
		bank.add(SonyaArg);	
		bank.add(VladSerov);
		bank.add(ac1);
		bank.add(ac2);
		bank.add(ac3);
		bank.add(ac4);
		bank.add(ac5);
		bank.add(ac6);
		bank.add(ac7);
		bank.add(ac8);
		bank.add(ac9);
		bank.add(ac10);
		bank.add(ac11);
		
		ac7.setIsLocked(true);
		
		Logic logic = new Logic();
		List<Account> accounts;
		accounts = logic.searchAccForCust(bank.getAccounts(), VladSerov);
		accounts = logic.sortByBalanceMax(bank.getAccounts());
		Customer client = logic.searchCustByAcc(bank.getAccounts(), "12355");
		
		double s;
		s = logic.totalForCust(bank.getAccounts(),PetrIvanov);
		s = logic.creditTotalForCust(bank.getAccounts(), PetrIvanov);
		s = logic.debitTotalForCust(bank.getAccounts(), PetrIvanov);
		
		System.out.println(s);
		//System.out.println(client);
		//System.out.println(accounts);
	}

}
