package moon_calendar;

import java.util.Scanner;

public class Calendar01 {
	public static final int[] max = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	
	public int MaxDay(int month) {
		return max[month - 1];
	}
	
	public void CalendarSample() {
		System.out.println("일     월    화    수    목    금    토");
		System.out.println("--------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
		
	}
	public static void main(String[] args) {
		// 숫자를 입력 받아 해당하는 달의 최대 일수를 출력하는 프로그램
		// 1)
		Scanner sc = new Scanner(System.in);
		Calendar01 cal = new Calendar01();
		System.out.println("월을 입력하시오 : ");
		int month = sc.nextInt();
		System.out.printf("%d월은 %d일까지 있습니다.\n" , month, cal.MaxDay(month));
		cal.CalendarSample(); 
		sc.close();
		// 2)
//		System.out.print("몇월의 최대 일수를 출력해드릴까요?  : ");
//		Scanner sc = new Scanner(System.in);
//		int month = sc.nextInt();
		
//		System.out.printf("%d월은 %d일까지 있습니다." , month, max[month-1]);

		
		//3)
		// int n = 0;
		// if ( month = 2n-1) {
		// System.out.println(month+"월은 31일까지 있습니다.");
		// } else if{ month
		// System.out.println(month+"월은 30일까지 있습니다.");
		// } else {
		// System.out.println(month+"월은 28일까지 있습니다.");
		// }
		//
	}

}
