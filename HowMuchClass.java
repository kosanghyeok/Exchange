package ExchangeExample;

import java.util.Scanner;
public class HowMuchClass {
	

		public double wonKOR = 0;
		public int num = 0;
		
		public void inputData() {
			
			Scanner myInput = new Scanner(System.in);
			System.out.print("���� ��ȭ �Է� : ");
			wonKOR = myInput.nextDouble();
			System.out.print("\nȯ���� ȭ�� ������ �����Ͻʽÿ�(1:USD 2:EUR 3:JPY 0:����) : ");
			num = myInput.nextInt();

			myInput.close();
		}

	}
	

