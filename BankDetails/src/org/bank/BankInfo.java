package org.bank;

public class BankInfo extends AxisBank{
	
	public void saving() {
		System.out.println("saving account");
	}
	private void fixed() {
		System.out.println("fixed account");
	}
	public static void main(String[] args) {
		
	
	BankInfo bank = new BankInfo();
	bank.saving();
	bank.fixed();
	bank.deposit();
	}
}
