package homework6;

import java.util.Scanner;

class SecondMax {
	public static void main(String[] s){
		//new SecondMax().start();
	}
	
	void start() {
		int i;
		Scanner s = new Scanner(System.in);
		System.out.println("10���� ���ڸ� �Է¹޾� �迭�� �����ϰ� �ι�ū ���� ����϶�");
		
		int number[] = new int[10];
		for(i=0; i<number.length; i++){
			System.out.print((i+1) + "��° ���� �Է��Ͻÿ� : ");
			number[i]= s.nextInt();
		}
		int max=0;
		int secondmax=0;
		int j=0;
		 for(i=0;i<10;i ++)
		 {
		 if(number[i]>max)
		 max=number[i];
		 j=i;
		 }
		 System.out.print("�ι�°�� ū ����"+(j+1)+"��°��"+max+"�Դϴ�.");
	}
}