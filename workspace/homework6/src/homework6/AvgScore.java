package homework6;

import java.util.Scanner;

public class AvgScore {
	void avg(){
		Scanner s = new Scanner(System.in);
		System.out.println("=================");
		int i;
		double[] number = new double[10];
		for(i=0; i<number.length; i++){
			System.out.print((i+1) + "�� �ɻ����� �Է� : ");
			number[i]= s.nextDouble();
		}
			double max=number[0];
			double min=number[0];
			double sum=0;
			double average=0;
			for(i=0;i<10;i++)
			{
				if(number[i]>max)
					max=number[i];
				if(number[i]<min)
					min=number[i];
				sum += number[i];			
			}
			average = (sum-min-max)/8.0;
			System.out.print("���� ū ������ ���� ���� ������ ������\n 8���� ���� �����"+average+"�Դϴ�.");
		}
	}

