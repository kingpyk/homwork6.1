package homework6;
import java.util.Scanner;
public class StudentScore {
	public static void main(String[] s){
		new SecondMax().start();
	}
void stu(){
	Scanner s = new Scanner(System.in);
	System.out.println("5명의 국어,영어,수학 점수의 과목별총점 및 평균 구하기");
	System.out.println("=========================");
	int[][] score = new int[5][3];
	int i=0;
	int j=0;
	int sum1=0,sum2=0,sum3=0,stu1sum=0,stu2sum=0,stu3sum=0,stu4sum=0,stu5sum=0;
	double avg1=0,avg2=0,avg3=3,stu1avg=0,stu2avg=0,stu3avg=0,stu4avg=0,stu5avg=0;

	for(i=0; i<score.length;i++){
		System.out.print((i+1)+"번 학생 국어,영어,수학:");
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

		System.out.println("국어총점은"+sum1+"이고 평균은"+avg1+"입니다");
		System.out.println("영어총점은"+sum2+"이고 평균은"+avg2+"입니다");
		System.out.println("수학총점은"+sum3+"이고 평균은"+avg3+"입니다");
		System.out.println("1번학생의 총점은"+stu1sum+", 평균은"+stu1avg+"이다");
		System.out.println("2번학생의 총점은"+stu2sum+", 평균은"+stu2avg+"이다");
		System.out.println("3번학생의 총점은"+stu3sum+", 평균은"+stu3avg+"이다");
		System.out.println("4번학생의 총점은"+stu4sum+", 평균은"+stu4avg+"이다");
		System.out.println("5번학생의 총점은"+stu5sum+", 평균은"+stu5avg+"이다");
	}
}



