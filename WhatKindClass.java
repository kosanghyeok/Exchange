package ExchangeExample;

public class WhatKindClass {

		
		public final double EXCHANGE_RATE_USD = 1136.8 ;
		public final double EXCHANGE_RATE_EUR = 1348.7 ;
		public final double EXCHANGE_RATE_JPY = 10.25;
		public double exchangeRate = 0, exchange = 0;
		public int changeMoney = 0, changeWon = 0;
		public String selectedTypeText = null;

		public void process(double wonKOR, int num) {
	
			if(num == 1) {
				selectedTypeText = "USD";
				exchangeRate = EXCHANGE_RATE_USD;
			} else if(num == 2) {
				selectedTypeText = "EUR";
				exchangeRate = EXCHANGE_RATE_EUR;
			} else {
				selectedTypeText = "JPY";
				exchangeRate = EXCHANGE_RATE_JPY;
			}

			exchange = wonKOR / exchangeRate;
			changeMoney = (int)exchange;
			exchange = exchange - changeMoney;
			changeWon = (int)(exchange*exchangeRate);
			changeWon = changeWon / 10 * 10;

		}

	}
	
	

