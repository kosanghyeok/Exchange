package ExchangeExample;

import java.util.Scanner;
public class HowMuchClass {
	

		public double wonKOR = 0;
		public int num = 0;
		
		public void inputData() {
			
			Scanner myInput = new Scanner(System.in);
			System.out.print("받은 원화 입력 : ");
			wonKOR = myInput.nextDouble();
			System.out.print("\n환전할 화폐 종류를 선택하십시오(1:USD 2:EUR 3:JPY 0:종료) : ");
			num = myInput.nextInt();

			myInput.close();
		}

	}
	

