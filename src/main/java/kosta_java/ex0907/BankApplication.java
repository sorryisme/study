package kosta_java.ex0907;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args){
		boolean run = true;
		while(run) {
			System.out.println("-----------------------------------------");
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
			System.out.println("-----------------------------------------");
			System.out.print("����> ");
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				createAccount();
			} else if(selectNo == 2) {
				accountList();
			} else if(selectNo == 3) {
				deposit();
			} else if(selectNo == 4) {
				withdraw();
			} else if(selectNo == 5) {
				run = false;
			}
			
		}
		System.out.println("���α׷� ����");
	}
	
	private static void createAccount() {
		System.out.println("------------------");
		System.out.println("���»���");
		System.out.println("------------------");
		System.out.print("���¹�ȣ");
		String ano = scanner.next();
		System.out.print("������");
		String onwer = scanner.next();
		System.out.print("�ʱ��Աݾ�");
		int balance= scanner.nextInt();

		int arrlen = accountArray.length;
		for(int i = 0; i < arrlen; i++) {
			if(accountArray[i] == null) {
				accountArray[i] = new Account(ano,onwer,balance);
				System.out.println("���°� �����Ǿ����ϴ�.");
				return;
			}
		}
	}
	
	private static void accountList() {
		System.out.println("---------------");
		System.out.println("     ���¸��       ");
		System.out.println("---------------");
		int arrlen = accountArray.length;
		for(int i = 0; i < arrlen; i++) {
			if(accountArray[i] == null)break;
			System.out.println(accountArray[i].getAno() + "\t" + accountArray[i].getOwner() + "\t" + accountArray[i].getBalance());
		}
	}
	
	private static void deposit() {
		System.out.print("���¹�ȣ");
		Account account = findAccount(scanner.next());
		System.out.print("���ݾ�");
		int balance = scanner.nextInt();

		if(account.getAno().equals("")) {
			System.out.println("�������� �ʴ� �����Դϴ�");
		} else {
			account.setBalance(account.getBalance()+balance);
			System.out.println("������ �����Ǿ����ϴ�.");
		}
	}
	
	private static void withdraw() {
		System.out.print("���¹�ȣ");
		Account account = findAccount(scanner.next());
		System.out.print("��ݾ�");
		int balance = scanner.nextInt();

		if(account.getAno().equals("")) {
			System.out.println("�������� �ʴ� �����Դϴ�");
		} else {
			account.setBalance(account.getBalance()-balance);
			System.out.println("����� �����Ǿ����ϴ�.");
		}	
	}
	
	private static Account findAccount(String ano) {
		Account account = new Account("","",0);
		int arrlen = accountArray.length;
		for(int i = 0; i < arrlen; i++) {
			if(accountArray[i].getAno().equals(ano))
				account = accountArray[i];
				return account;
		}
		return account;
	}
	
}
