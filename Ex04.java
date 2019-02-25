import java.util.Scanner;

class Ex04 {
  public static void main(String[] args) {
 
	  int n = 0 ; // 삼각형 가로의 길이 
	  System.out.println("삼각형의 층 수 를 입력해주세요 :");
	  Scanner sc = new Scanner(System.in);
	  
	  n = Integer.parseInt(sc.nextLine());
	 /* n = (n*2) -1; //층수를 (2*n-1)로 해서 가로의 크기로 바꾼다 
	  
	  System.out.println();
	  
	  //삼각형
	  
	  for(int i = 1; i<=n ; i+=2) {
		  //빈칸 찍는 반복문 
		  for(int k = 1; k<=(n-i)/2;k++) {
			  System.out.print(" ");
		  }
		  for(int j=1; j<=i;j++) {
			  System.out.print("*");
		  }
		  System.out.println();
	  }
	  System.out.println("삼각형 완성!");
	  */
	  
	 for(int i = n; i>0;i--) {
		 for(int j=i-1;j<n;j++) {
			 System.out.print(" ");
		 }
		 for(int k=i*2-1;k>0;k--) {
			 System.out.print("*");
		 }
		 System.out.println();
	 }
	  System.out.println("역삼각형 완성!");
	 
  }
}