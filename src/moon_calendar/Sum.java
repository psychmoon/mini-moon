package moon_calendar;

import java.util.Scanner;

public class Sum {

	/*
	 * 두 수를 입력하세요.
	 * 5 10 (엔터)
	 * 두 수의 합은 15입니다.
	 */
	public static void main(String[] args) {
		System.out.println("두 수를 입력하세요.");
		System.out.println("ex) 1 30");
		System.out.print(": ");
		Scanner sc = new Scanner(System.in);
		int first = Integer.parseInt(sc.next());
		int second = Integer.parseInt(sc.next());
//	1)	
//		System.out.println(first+"와 "+second+"의 합은 "+(first+second)+"입니다.");
//	2)	
//		int sum = first + second;
//		System.out.println(first+"와 "+second+"의 합은 "+sum+"입니다.");
//  3)
		System.out.printf("%d와 %d의 합은 %d입니다.", first, second, first + second);
		sc.close();
		
	}
}
