package homework6;
import java.util.Scanner;
public class StudentScore {
	public static void main(String[] s){
		new SecondMax().start();
	}
void stu(){
	Scanner s = new Scanner(System.in);
	System.out.println("5���� ����,����,���� ������ �������� �� ��� ���ϱ�");
	System.out.println("=========================");
	int[][] score = new int[5][3];
	int i=0;
	int j=0;
	int sum1=0,sum2=0,sum3=0,stu1sum=0,stu2sum=0,stu3sum=0,stu4sum=0,stu5sum=0;
	double avg1=0,avg2=0,avg3=3,stu1avg=0,stu2avg=0,stu3avg=0,stu4avg=0,stu5avg=0;

	for(i=0; i<score.length;i++){
		System.out.print((i+1)+"�� �л� ����,����,����:");
		score[i][0]=s.nextInt();
		score[i][1]=s.nextInt();
		score[i][2]=s.nextInt();
		sum1 += score[i][0];
		sum2 += score[i][1];
		sum3 += score[i][2];
		avg1 = sum1/5.0;
		avg2 = sum2/5.0;
		avg3 = sum3/5.0;
	}

		for(j=0;j<3;j++){
			stu1sum += score[0][j];
			stu2sum += score[1][j];
			stu3sum += score[2][j];
			stu4sum += score[3][j];
			stu5sum += score[4][j];
			stu1avg = stu1sum/3.0;
			stu2avg = stu2sum/3.0;
			stu3avg = stu3sum/3.0;
			stu4avg = stu4sum/3.0;
			stu5avg = stu5sum/3.0;
		}

		System.out.println("����������"+sum1+"�̰� �����"+avg1+"�Դϴ�");
		System.out.println("����������"+sum2+"�̰� �����"+avg2+"�Դϴ�");
		System.out.println("����������"+sum3+"�̰� �����"+avg3+"�Դϴ�");
		System.out.println("1���л��� ������"+stu1sum+", �����"+stu1avg+"�̴�");
		System.out.println("2���л��� ������"+stu2sum+", �����"+stu2avg+"�̴�");
		System.out.println("3���л��� ������"+stu3sum+", �����"+stu3avg+"�̴�");
		System.out.println("4���л��� ������"+stu4sum+", �����"+stu4avg+"�̴�");
		System.out.println("5���л��� ������"+stu5sum+", �����"+stu5avg+"�̴�");
	}
}



