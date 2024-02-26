package practice;

import java.util.Scanner;

public class Ex04 {//백준10430
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int A = sc.nextInt();
		int B= sc.nextInt();
		int C = sc.nextInt();
		
		System.out.println((A+B)%C);
		System.out.println(((A%C)+(B%C))%C);//우선순위확인
		System.out.println((A*B)%C);
		System.out.println((A%C)*(B%C)%C);
		
	}

}
