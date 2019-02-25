
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 0 ;  // 숫자삼각형 층수 
		System.out.println("삼각형의 층 수 를 입력해주세요 :");
		Scanner sc = new Scanner(System.in);
		num = Integer.parseInt(sc.nextLine());
		
		for(int i=0; i<num;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=1+i;j<num+1;j++){
				System.out.print(j);
			}
			for(int j=num-1;j>i;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
