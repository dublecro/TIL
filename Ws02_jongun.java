package ws;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ws02_jongun {

	public static void main(String[] args) {
		System.out.println("Lotto Start");
		
		Scanner sc = new Scanner(System.in);
		//�ζ� ��ȣ ����
		int ar[] = new int[4];
		Random r = new Random();
		
		for (int i = 0; i < ar.length; i++) {
			ar[i] = r.nextInt(10) + 1;
			for (int j = 0; j < i; j++) {
				if(ar[i] == ar[j]) {
					i--;
				}
			}
		}
		//System.out.println(Arrays.toString(ar));
		
		//���� ����
		int as[] = new int[4];
		
		for (int i = 0; i < ar.length; i++) {
			try {
				System.out.println("Input first number");
				
				
				as[i] = Integer.parseInt(sc.next());
			
				
				
					for (int j = 0; j < i; j++) {
						if(as[i] == as[j]) {
							System.out.println("�Է��� �� �� �ߺ��� ���� �ֽ��ϴ�.");
							i--;
							continue;
						}
					}
				
				if(as[i] < 1 || as[i]  > 10) {
					System.out.println("1 ~ 10������ ���� �Է��Ͻÿ�.");
					continue;
				}
			
			}catch(Exception e) {
				System.out.println("���ڸ� �Է��Ͻÿ�.");
				continue;
			}
		}
					
		System.out.println("�Է��� ��ȣ��:" + Arrays.toString(as));
		
		int count = 0;
		for (int i = 0; i < as.length; i++) { 
			for (int j = 0; j < i; j++) {
				if(ar[i] == as[j]) {
					count++;
				}
			}
		}
		System.out.println("���� ���ڴ� ");
		
	}

}