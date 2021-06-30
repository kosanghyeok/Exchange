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
		System.out.println("환전할 원화는 얼마입니까? : ");
	    wonKOR = myInput.nextDouble() ;
	    System.out.printf("환전할 종류 선택 1:USD 2:EUR 3:jpy ?\n");
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
	    
	    
	    
	    
	    
	    
	    System.out.printf("%s을(를) 선택하였습니다.\n", selectedTypeText);
	    
	    
	    exchange = wonKOR / exchangeRate;
	    changeMoney = (int) exchange;
		exchange = exchange - changeMoney;
		changeKOR = (int) (exchange * exchangeRate);
		changeKOR = changeKOR / 10 * 10;
	    
		System.out.printf("\n현재 환율은 1 %s에 %f 원입니다.", selectedTypeText, exchangeRate);
		System.out.printf("\n환전금액 : %d %s", changeMoney, selectedTypeText);
		
		
		// 1달러, 2달러, 5달러, 10달러, 20달러, 50달러, 100달러
			
			if (num == 1) {			
				System.out.println("\n$100 지폐 " + (int) changeMoney / 100 + " 장");
				System.out.println("$50 지폐 " + (int) changeMoney % 100 / 50 + " 장");
				System.out.println("$20 지폐 " + (int) changeMoney % 100 % 50 / 20 + " 장");
				System.out.println("$10 지폐 " + (int) changeMoney % 100 % 50 % 20 / 10 + " 장");
				System.out.println("$5 지폐 " + (int) changeMoney % 100 % 50 % 20 % 10 / 5 + " 장");
				System.out.println("$1 지폐 " + (int) changeMoney % 100 % 50 % 20 % 10 % 5 / 1 + " 장");
	    
    
	    	} else if (num == 2) {
				
			// 1 5유로, 10유로, 20유로, 50유로, 100유로, 200유로, 500유로
	    	System.out.println("\n200유로 " + (int) changeMoney / 200 + " 장");
			System.out.println("100유로 " + (int) changeMoney % 200 / 100 + " 장");
			System.out.println("50유로 " + (int) changeMoney % 200 % 100 / 50 + " 장");
			System.out.println("20유로 " + (int) changeMoney % 200 % 100 % 50 / 20 + " 장");
			System.out.println("10유로 " + (int) changeMoney % 200 % 100 % 50 % 20 / 10 + " 장");
			System.out.println("5유로 " + (int) changeMoney % 200 % 100 % 50 % 20 % 10 / 5 + " 장");
			System.out.println("2유로동전 " + (int) changeMoney % 200 % 100 % 50 % 20 % 10 % 5 / 2 + " 개");
			System.out.println("1유로동전 " + (int) changeMoney % 200 % 100 % 50 % 20 % 10 % 5 % 2 / 1 + " 개");
	
				
	    	} else {		   					   
			 // 10,000엔, 5,000엔, 2,000엔, 1,000엔, 500엔, 100엔, 50엔, 10엔, 5엔, 1엔			
			System.out.println("\n10000엔권 " + (int) changeMoney / 10000 + " 장");
			System.out.println("5000엔권 " + (int) changeMoney % 10000 / 5000 + " 장");
			System.out.println("2000엔권 " + (int) changeMoney % 10000 % 5000 / 2000 + " 장");
			System.out.println("1000엔권 " + (int) changeMoney % 10000 % 5000 % 2000 / 1000 + " 장");
			System.out.println("500엔동전 " + (int) changeMoney % 10000 % 5000 % 2000 % 1000 / 500 + " 개");
			System.out.println("100엔동전 " + (int) changeMoney % 10000 % 5000 % 2000 % 500 / 100 + " 개");
			System.out.println("50엔동전 " + (int) changeMoney % 10000 % 5000 % 2000 % 500 % 100 / 50 + " 개");
			System.out.println("10엔동전 " + (int) changeMoney % 10000 % 5000 % 2000 % 500 % 100 % 50 / 10 + " 개");
			System.out.println("1엔동전 " + (int) changeMoney % 10000 % 5000 % 2000 % 500 % 100 % 50 % 10 / 1 + " 개");	
		    
	    	}
			    
			
			//원화 거스름돈
				// 1000원, 500원, 100원, 50원, 10원
			System.out.println("\n거스름돈 : " + changeKOR + " 원");
			System.out.println("1천원권 " + (int) changeKOR % 50000 % 10000 % 5000 / 1000 + " 장");
			System.out.println("500원 " + (int) changeKOR % 50000 % 10000 % 5000 % 1000 / 500 + " 개");
			System.out.println("100원 " + (int) changeKOR % 50000 % 10000 % 5000 % 1000 % 500 / 100 + " 개");
			System.out.println("50원 " + (int) changeKOR % 50000 % 10000 % 5000 % 1000 % 500 % 100 / 50 + " 개");
			System.out.println("10원 " + (int) changeKOR % 50000 % 10000 % 5000 % 1000 % 500 % 100 % 50 / 10 + " 개");	
			
			
			
			 myInput.close();
			
			
	    }
	}

					
					
	

