package homework;

import java.util.Scanner;

public class Array_cy {
	public static void main(String[] args) {
//		스캐너 추가 !!
		 Scanner scanner = new Scanner(System.in);

//		문자를 담는 배열선언 (Stirng) !!!
		String foodMenu[] = new String[6];

//		System.out.println("오늘 점메추");
//
//		foodMenu[0] = "된찌";
//		foodMenu[1] = "마라탕";
//		foodMenu[2] = "소바";
//		foodMenu[3] = "라멘";
//		foodMenu[4] = "돈깟스";
//		foodMenu[5] = "김찌";
//		
//		for (int i = 0; i < foodMenu.length; i++) {
//			System.out.println("오늘 점메추 :" +foodMenu[i] );
//		}
//	
		for (int i = 0; i < foodMenu.length; i++) {
			foodMenu[i] = scanner.next();
			System.out.println("오늘 점메추해줘!!! :" + foodMenu[i]);
		}
		
		scanner.close();

	} 

}
