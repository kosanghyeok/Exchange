package ExchangeExample;
import java.util.Scanner;


public class ExchangeEntire {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final double EXCHANGE_RATE_USD = 1136.8 ;
		final double EXCHANGE_RATE_EURO = 1348.7 ;
		final double EXCHANGE_RATE_JPY = 10.25 ;
		
		double wonKOR, exchangeRate, exchange;
		int changeMoney, changeKOR;
		String selectedTypeText;
		
		Scanner myInput = new Scanner(System.in) ;
		System.out.println("ȯ���� ��ȭ�� ���Դϱ�? : ");
	    wonKOR = myInput.nextDouble() ;
	    System.out.printf("ȯ���� ���� ���� 1:USD 2:EUR 3:jpy ?\n");
	    int num = myInput.nextInt();
	   
	 
	    
	    if(num == 1) {
	    	 	selectedTypeText = "USD" ;
	    	 	exchangeRate = EXCHANGE_RATE_USD;
	    } else if (num == 2) {
	    		selectedTypeText = "EUR" ;
	    		exchangeRate = EXCHANGE_RATE_EURO;
	    }else {
	    		selectedTypeText = "JPY" ;
	    		exchangeRate = EXCHANGE_RATE_JPY;
	    }	
	    
	    
	    
	    
	    
	    
	    System.out.printf("%s��(��) �����Ͽ����ϴ�.\n", selectedTypeText);
	    
	    
	    exchange = wonKOR / exchangeRate;
	    changeMoney = (int) exchange;
		exchange = exchange - changeMoney;
		changeKOR = (int) (exchange * exchangeRate);
		changeKOR = changeKOR / 10 * 10;
	    
		System.out.printf("\n���� ȯ���� 1 %s�� %f ���Դϴ�.", selectedTypeText, exchangeRate);
		System.out.printf("\nȯ���ݾ� : %d %s", changeMoney, selectedTypeText);
		
		
		// 1�޷�, 2�޷�, 5�޷�, 10�޷�, 20�޷�, 50�޷�, 100�޷�
			
			if (num == 1) {			
				System.out.println("\n$100 ���� " + (int) changeMoney / 100 + " ��");
				System.out.println("$50 ���� " + (int) changeMoney % 100 / 50 + " ��");
				System.out.println("$20 ���� " + (int) changeMoney % 100 % 50 / 20 + " ��");
				System.out.println("$10 ���� " + (int) changeMoney % 100 % 50 % 20 / 10 + " ��");
				System.out.println("$5 ���� " + (int) changeMoney % 100 % 50 % 20 % 10 / 5 + " ��");
				System.out.println("$1 ���� " + (int) changeMoney % 100 % 50 % 20 % 10 % 5 / 1 + " ��");
	    
    
	    	} else if (num == 2) {
				
			// 1 5����, 10����, 20����, 50����, 100����, 200����, 500����
	    	System.out.println("\n200���� " + (int) changeMoney / 200 + " ��");
			System.out.println("100���� " + (int) changeMoney % 200 / 100 + " ��");
			System.out.println("50���� " + (int) changeMoney % 200 % 100 / 50 + " ��");
			System.out.println("20���� " + (int) changeMoney % 200 % 100 % 50 / 20 + " ��");
			System.out.println("10���� " + (int) changeMoney % 200 % 100 % 50 % 20 / 10 + " ��");
			System.out.println("5���� " + (int) changeMoney % 200 % 100 % 50 % 20 % 10 / 5 + " ��");
			System.out.println("2���ε��� " + (int) changeMoney % 200 % 100 % 50 % 20 % 10 % 5 / 2 + " ��");
			System.out.println("1���ε��� " + (int) changeMoney % 200 % 100 % 50 % 20 % 10 % 5 % 2 / 1 + " ��");
	
				
	    	} else {		   					   
			 // 10,000��, 5,000��, 2,000��, 1,000��, 500��, 100��, 50��, 10��, 5��, 1��			
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
			    
			
			//��ȭ �Ž�����
				// 1000��, 500��, 100��, 50��, 10��
			System.out.println("\n�Ž����� : " + changeKOR + " ��");
			System.out.println("1õ���� " + (int) changeKOR % 50000 % 10000 % 5000 / 1000 + " ��");
			System.out.println("500�� " + (int) changeKOR % 50000 % 10000 % 5000 % 1000 / 500 + " ��");
			System.out.println("100�� " + (int) changeKOR % 50000 % 10000 % 5000 % 1000 % 500 / 100 + " ��");
			System.out.println("50�� " + (int) changeKOR % 50000 % 10000 % 5000 % 1000 % 500 % 100 / 50 + " ��");
			System.out.println("10�� " + (int) changeKOR % 50000 % 10000 % 5000 % 1000 % 500 % 100 % 50 / 10 + " ��");	
			
			
			
			 myInput.close();
			
			
	    }
	}

					
					
	

