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
		System.out.println("������ �����մϴ�. 0 ~ 9������ ���ڸ� �Է����ּ��� ");
		
		String ans[] = new String[ai.length];
		
		
		
			for( int i = 0; i < ai.length; i ++ ){
				ans[i] = "";
			}
			
			
			for (int i = 0; i < ans.length; i++) {
				try {
					System.out.println(i+1 +"��° ���� �Է����ּ���" );
					String cmd = sc.next();
					if( cmd.equals("����")) {
						System.out.println("������ �����մϴ�.");
						sc.close();
						return;
					}else {
						ans[i] = cmd;	
						
						
					}
					for (int j = 0; j < ans.length; j++) {

						if( ans[i].equals(ans[j]) && i != j ) {
							System.out.println("�ߺ����� �ֽ��ϴ�. �ٽ� �Է����ּ���" );
							i--;
							break;
						}
					}
	
				}catch (Exception e) {
					// TODO: handle exception
					System.out.println("�μ��� ����" );
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
						
			System.out.print("�ζ� ��ȣ�� : ");
			for(int i = 0; i < ai.length; i++) {
				System.out.print(ai[i]+", ");
			}
			System.out.println("");
			System.out.print("�Է� ��ȣ�� : ");
			for(int i = 0; i < ai.length; i++) {
				System.out.print(ans[i]+", ");
			}
			System.out.println("");
			System.out.print("���� ������ : " + strike);
			
			sc.close();
	}
}
