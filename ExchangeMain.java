package ExchangeExample;

import java.util.Scanner;

public class ExchangeMain {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		HowMuchClass exchangePrint = new HowMuchClass();
		Choice exchangeChoice = new Choice();
		WhatKindClass exchangeKind = new WhatKindClass();
		ExchangeClass exchangeMoney = new ExchangeClass();
		wonChangeClass exchangeChange = new wonChangeClass();

		while(true) {

			exchangePrint.inputData();
			if(exchangePrint.num == 0) {
				break;		
			}
			exchangeKind.process(exchangePrint.wonKOR, exchangePrint.num);
			
			exchangeChoice.print(exchangeKind.selectedTypeText, exchangeKind.exchangeRate,
								exchangePrint.num, exchangeKind.changeMoney, exchangeKind.changeWon);
			
			exchangeMoney.returnMoney(exchangePrint.num, exchangeKind.changeMoney, exchangeKind.selectedTypeText);
			
			exchangeChange.change(exchangeKind.changeWon);
			
			break;
		}	

	} 

}
		
		
			