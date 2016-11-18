package homework6;
import java.util.Scanner;
public class OnlyNumber {
	void onl(){
		Scanner s = new Scanner(System.in);
		System.out.println("==========================");
		System.out.println("1~100사이의 숫자를 입력하세요");
		int number[] = new int[10];
					
		for(int i=0; i<number.length; i++){
		boolean type = false;
		int numbers;
		System.out.print((i+1) + "번째 숫자: ");
			if(s.hasNextInt())
			numbers= s.nextInt();
			else
			return;
			for(int j=0;j<i;j++){
			if(numbers == number[j])
			type = true;
			break;
	}
	if(type&&numbers >=1 && numbers <= 100)
	number[i++] = numbers;
	else
	System.out.println("잘못 입력하셨습니다. 다시 입력하세요");

}
}
}


