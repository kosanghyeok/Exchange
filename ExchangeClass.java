package ExchangeExample;

import java.util.Scanner;

public class ExchangeClass {

	public void returnMoney(int num, int changeMoney, String moneyText) {
		//ȯ���ݾ� ���� ��¸�
		System.out.printf("\nȯ���ݾ� : %d %s \n", changeMoney, moneyText);
		switch(num) {
		case 1:
			System.out.println("\n$100 ���� " + (int) changeMoney / 100 + " ��");
			System.out.println("$50 ���� " + (int) changeMoney % 100 / 50 + " ��");
			System.out.println("$20 ���� " + (int) changeMoney % 100 % 50 / 20 + " ��");
			System.out.println("$10 ���� " + (int) changeMoney % 100 % 50 % 20 / 10 + " ��");
			System.out.println("$5 ���� " + (int) changeMoney % 100 % 50 % 20 % 10 / 5 + " ��");
			System.out.println("$1 ���� " + (int) changeMoney % 100 % 50 % 20 % 10 % 5 / 1 + " ��");
		break;
		case 2:
			System.out.println("\n200���α� " + (int) changeMoney / 200 + " ��");
			System.out.println("100���α� " + (int) changeMoney % 200 / 100 + " ��");
			System.out.println("50���α� " + (int) changeMoney % 200 % 100 / 50 + " ��");
			System.out.println("20���α� " + (int) changeMoney % 200 % 100 % 50 / 20 + " ��");
			System.out.println("10���α� " + (int) changeMoney % 200 % 100 % 50 % 20 / 10 + " ��");
			System.out.println("5���α� " + (int) changeMoney % 200 % 100 % 50 % 20 % 10 / 5 + " ��");
			System.out.println("2���ε��� " + (int) changeMoney % 200 % 100 % 50 % 20 % 10 % 5 / 2 + " ��");
			System.out.println("1���ε��� " + (int) changeMoney % 200 % 100 % 50 % 20 % 10 % 5 % 2 / 1 + " ��");
		break;
		default:
			System.out.println("\n10000���� " + (int) changeMoney / 10000 + " ��");
			System.out.println("5000���� " + (int) changeMoney % 10000 / 5000 + " ��");
			System.out.println("2000���� " + (int) changeMoney % 10000 % 5000 / 2000 + " ��");
			System.out.println("1000���� " + (int) changeMoney % 10000 % 5000 % 2000 / 1000 + " ��");
			System.out.println("500������ " + (int) changeMoney % 10000 % 5000 % 2000 % 1000 / 500 + " ��");
			System.out.println("100������ " + (int) changeMoney % 10000 % 5000 % 2000 % 500 / 100 + " ��");
			System.out.println("50������ " + (int) changeMoney % 10000 % 5000 % 2000 % 500 % 100 / 50 + " ��");
			System.out.println("10������ " + (int) changeMoney % 10000 % 5000 % 2000 % 500 % 100 % 50 / 10 + " ��");
			System.out.println("1������ " + (int) changeMoney % 10000 % 5000 % 2000 % 500 % 100 % 50 % 10 / 1 + " ��");
		}

	}

}
	
	

