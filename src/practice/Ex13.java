package practice;

import java.util.Scanner;

public class Ex13 {//2739
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		for(int k = 1; k<10; k++) {
			System.out.println(n+"*"+k+"="+(n*k));
		}
	}
}

