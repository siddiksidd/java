package com.vm.java.tests;

public class SavingsAccountTest {
public static void main(String[] args) {
	
	SavingsAccount savingsaccount = new SavingsAccount(10633,16.16);
	savingsaccount.withdraw(250);
	System.out.println("after with drawing: Balance is:"+savingsaccount.getBalance());
	savingsaccount.deposit(400);
	System.out.println("after depositing: Balance is:"+savingsaccount.getBalance());
	savingsaccount.addInterest();
	System.out.println(savingsaccount.getBalance());
	
	
}
	
}