package practice;

import java.util.Scanner;

public class Ex09 {//9498
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sco = 0;
		char grade1 = 'A';
		char grade2 = 'B';
		char grade3 = 'C';
		char grade4 = 'D';
		char grade5 = 'F';
		sco = sc.nextInt();
		if(sco>=90) {
			System.out.println(grade1);
		}else if(sco>=80){
			System.out.println(grade2);
		}else if(sco>=70){
			System.out.println(grade3);
		}else if(sco>=60){
			System.out.println(grade4);
		}else {
			System.out.println(grade5);
		}
		
	}

}
