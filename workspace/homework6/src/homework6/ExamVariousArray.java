package homework6;

import java.util.Scanner; 
public class ExamVariousArray { 
 
 
 	public static void main(String[] args) { 
 		Scanner s = new Scanner(System.in); 
 		System.out.println("************"); 
 		System.out.println("1. �� ��°�� ū �� ã��"); 
 		System.out.println("2. �ɻ� ���� ���"); 
 		System.out.println("3. �л� ����,��� �� ���ϱ�"); 
 		System.out.println("4. 5�� ����Ʈ�� ������ ���� ���ϱ�"); 
 		System.out.println("5. ��ġ���ʴ� ���� 10�� �Է¹ޱ�"); 
		System.out.println("6. �����ϱ�"); 
 		System.out.print("���ϴ� �޴���>>"); 
 		int menu = s.nextInt(); 
 		switch(menu){ 
 		case 1: 
 			new SecondMax().start(); 
 			break; 
 		case 2: 
 			new AvgScore().avg(); 
 			break; 
 		case 3: 
 			new StudentScore().stu(); 
 			break; 
 		case 4: 
 			new AptPersonCount().apt(); 
 			break;
		case 5:
			new OnlyNumber().onl();
			break;
 		case 6: 
 			System.exit(0); 
 			break; 
 		} 
 	}  
 } 