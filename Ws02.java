package ws;

import java.util.Random;
import java.util.Scanner;

public class Ws02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ai = new int[6];
		
		Random r = new Random();
		
		for (int i = 0; i < ai.length; i++) {
			ai[i] = r.nextInt(10);
			
			for (int j = 0; j < i; j++ ) {
				if ( ai[i] == ai[j]) {
					i--;
				}
			}
		}
		
		
		Scanner sc = new Scanner(System.in);		
		//a = r.nextInt(9);
		System.out.println("게임을 시작합니다. 0 ~ 9까지의 숫자를 입력해주세요 ");
		
		String ans[] = new String[ai.length];
		
		
		
			for( int i = 0; i < ai.length; i ++ ){
				ans[i] = "";
			}
			
			
			for (int i = 0; i < ans.length; i++) {
				try {
					System.out.println(i+1 +"번째 값을 입력해주세요" );
					String cmd = sc.next();
					if( cmd.equals("종료")) {
						System.out.println("게임을 종료합니다.");
						sc.close();
						return;
					}else {
						ans[i] = cmd;	
						
						
					}
					for (int j = 0; j < ans.length; j++) {

						if( ans[i].equals(ans[j]) && i != j ) {
							System.out.println("중복값이 있습니다. 다시 입력해주세요" );
							i--;
							break;
						}
					}
	
				}catch (Exception e) {
					// TODO: handle exception
					System.out.println("인셉션 오류" );
					sc.close();
					return;
				}		
			
			}			
			int strike = 0;
			for (int i = 0; i < ai.length; i++) {
				for( int j = 0; j < ans.length; j++) {
					
					 if( ai[j] != Integer.parseInt(ans[j]) && ai[i] == Integer.parseInt(ans[j]) ) {
						strike++;
					}
					
				}
			
				
			}
						
			System.out.print("로또 번호는 : ");
			for(int i = 0; i < ai.length; i++) {
				System.out.print(ai[i]+", ");
			}
			System.out.println("");
			System.out.print("입력 번호는 : ");
			for(int i = 0; i < ai.length; i++) {
				System.out.print(ans[i]+", ");
			}
			System.out.println("");
			System.out.print("맞은 갯수는 : " + strike);
			
			sc.close();
	}
}
