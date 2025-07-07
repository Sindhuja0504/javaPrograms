package org.encapsulate;

public class TestAccount {

	public static void main(String[] args) {
		Account acc = new Account();
		acc.setName("rose");
		acc.setAccountNo(123454765);
		//Integer.parseInt("rose");
		acc.setAmount(2500.7f);
		System.out.println("name: " + acc.getName());
		System.out.println("AccountNo: " + acc.getAccountNo());
		System.out.println("Amount: " + acc.getAmount());

	}

}
