package homework6;

import java.util.Scanner;

class SecondMax {
	
	public static void main(String[] s){
		new SecondMax().start();
	}
	
	void start() {
		Scanner s = new Scanner(System.in);
		System.out.println("10���� ���ڸ� �Է¹޾� �迭�� �����ϰ� �ι�ū ���� ����϶�");
		
		int number[] = new int[10];
		for(int i=0; i<number.length; i++){
			System.out.print((i+1) + "��° ���� �Է��Ͻÿ� : ");
			number[i]= s.nextInt();
		}
		
		 int max=number[0];
		 int secondmax=number[1];
		 for(int i=0;i<10;i++)
		 {
		 if(number[i]>max)
		 max=number[i];
		 }
		 System.out.print("�ι�°�� ū ����"+secondmax+"�Դϴ�.");
	}
}
