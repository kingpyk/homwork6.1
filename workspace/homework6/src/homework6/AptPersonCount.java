package homework6;
import java.util.Scanner;
public class AptPersonCount {
void apt(){
	Scanner s = new Scanner(System.in);
	System.out.println("=====================");
	System.out.println("5�� ����Ʈ�� ������ �ο� �ľ��ϱ�");
	int i=0,j=0,sum=0,sum1=0,sum2=0,sum3=0,sum4=0,sum5=0;
	int ho1=0,ho2=0,ho3=0;
	int Aptmem[][] = new int[5][3];
	for(i=0;i<5;i++)
	{
		for(j=0;j<3;j++){
			System.out.print((i+1)+"0"+(j+1)+"ȣ������ִ»���� ����:");
					Aptmem[i][j] = s.nextInt();
					sum += Aptmem[i][j];
					sum1 = (Aptmem[0][0]+Aptmem[0][1]+Aptmem[0][2]);
					sum2 = (Aptmem[1][0]+Aptmem[1][1]+Aptmem[1][2]);
					sum3 = (Aptmem[2][0]+Aptmem[2][1]+Aptmem[2][2]);
					sum4 = (Aptmem[3][0]+Aptmem[3][1]+Aptmem[3][2]);
					sum5 += Aptmem[4][j];
					ho1 = (Aptmem[0][0]+Aptmem[1][0]+Aptmem[2][0]+Aptmem[3][0]+Aptmem[4][0]);
					ho2 = (Aptmem[0][1]+Aptmem[1][1]+Aptmem[2][1]+Aptmem[3][1]+Aptmem[4][1]);
					ho3 += Aptmem[i][2];
		}
	}
	System.out.println("�� ����Ʈ�� �����ڴ� ���"+sum+"�Դϴ�.");
	System.out.println("1���� ��� �����ڴ� ���"+sum1+"�Դϴ�.");
	System.out.println("2���� ��� �����ڴ� ���"+sum2+"�Դϴ�.");
	System.out.println("3���� ��� �����ڴ� ���"+sum3+"�Դϴ�.");
	System.out.println("4���� ��� �����ڴ� ���"+sum4+"�Դϴ�.");
	System.out.println("5���� ��� �����ڴ� ���"+sum5+"�Դϴ�.");
	System.out.println("1ȣ ���ο� ��� �����ڴ� ���"+ho1+"�Դϴ�.");
	System.out.println("2ȣ ���ο� ��� �����ڴ� ���"+ho2+"�Դϴ�.");
	System.out.println("3ȣ ���ο� ��� �����ڴ� ���"+ho3+"�Դϴ�.");
	System.out.println(Aptmem[0][0]);
	System.out.println(Aptmem[0][1]);
	System.out.println(Aptmem[0][2]);
}
}
