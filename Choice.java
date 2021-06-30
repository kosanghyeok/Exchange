package ExchangeExample;

public class Choice {
	
		public void print(String selectedTypeText, double exchangeRate, int moneyType, int returnMoney, int returnWon) {
			//공통 출력 부분만
			System.out.printf("\n%s을(를) 선택하셨습니다.\n", selectedTypeText);
			System.out.printf("\n현재 환율은 1 %s에 %f 원 입니다.\n", selectedTypeText, exchangeRate);

		}

	}