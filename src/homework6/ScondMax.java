package homework6;

import java.util.Scanner;

class SecondMax {
	
	public static void main(String[] s){
		new SecondMax().start();
	}
	
	void start() {
		Scanner s = new Scanner(System.in);
		System.out.println("10개의 숫자를 입력받아 배열에 저장하고 두번큰 수를 출력하라");
		
		int number[] = new int[10];
		for(int i=0; i<number.length; i++){
			System.out.print((i+1) + "번째 수를 입력하시오 : ");
			number[i]= s.nextInt();
		}
		
		 int max=number[0];
		 int secondmax=number[1];
		 for(int i=0;i<10;i++)
		 {
		 if(number[i]>max)
		 max=number[i];
		 }
		 System.out.print("두번째로 큰 수는"+secondmax+"입니다.");
	}
}
