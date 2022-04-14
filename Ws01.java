package ws;

import java.util.Random;
import java.util.Scanner;

public class Ws01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		Random r = new Random();
		Scanner sc = new Scanner(System.in);		
		a = r.nextInt(9);
		System.out.println("게임을 시작합니다. 0 ~ 9까지의 숫자를 입력해주세요 ");
		while( true ) {
			
			try {
				String cmd = sc.next();
				
				int s = 0;
				if( cmd.equals("종료")) {
					System.out.println("게임을 종료합니다.");
					sc.close();
					return;
				}else {
					s = Integer.parseInt(cmd);
				}
				
				
				if( s > a ) {
					System.out.println("입력된 값이 더 큽니다.");
					
				}else if ( s < a ) {
					System.out.println("입력된 값이 더 작습니다.");
					
					
				}else {
					System.out.println("정답입니다.");
					
					break;
				}
			} catch (Exception e) {
				
				System.out.println("잘못 입력된 값입니다...");
				continue;		
				
			}
					
		}
	
		sc.close();
	
	}

}
