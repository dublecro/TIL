package ws;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ws02_jongun {

	public static void main(String[] args) {
		System.out.println("Lotto Start");
		
		Scanner sc = new Scanner(System.in);
		//로또 번호 생성
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
		
		//숫자 삽입
		int as[] = new int[4];
		
		for (int i = 0; i < ar.length; i++) {
			try {
				System.out.println("Input first number");
				
				
				as[i] = Integer.parseInt(sc.next());
			
				
				
					for (int j = 0; j < i; j++) {
						if(as[i] == as[j]) {
							System.out.println("입력한 값 중 중복된 값이 있습니다.");
							i--;
							continue;
						}
					}
				
				if(as[i] < 1 || as[i]  > 10) {
					System.out.println("1 ~ 10까지의 값을 입력하시오.");
					continue;
				}
			
			}catch(Exception e) {
				System.out.println("숫자를 입력하시오.");
				continue;
			}
		}
					
		System.out.println("입력한 번호는:" + Arrays.toString(as));
		
		int count = 0;
		for (int i = 0; i < as.length; i++) { 
			for (int j = 0; j < i; j++) {
				if(ar[i] == as[j]) {
					count++;
				}
			}
		}
		System.out.println("맞힌 숫자는 ");
		
	}

}