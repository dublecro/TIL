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
		System.out.println("������ �����մϴ�. 0 ~ 9������ ���ڸ� �Է����ּ��� ");
		while( true ) {
			
			try {
				String cmd = sc.next();
				
				int s = 0;
				if( cmd.equals("����")) {
					System.out.println("������ �����մϴ�.");
					sc.close();
					return;
				}else {
					s = Integer.parseInt(cmd);
				}
				
				
				if( s > a ) {
					System.out.println("�Էµ� ���� �� Ů�ϴ�.");
					
				}else if ( s < a ) {
					System.out.println("�Էµ� ���� �� �۽��ϴ�.");
					
					
				}else {
					System.out.println("�����Դϴ�.");
					
					break;
				}
			} catch (Exception e) {
				
				System.out.println("�߸� �Էµ� ���Դϴ�...");
				continue;		
				
			}
					
		}
	
		sc.close();
	
	}

}
