package homework;

import java.util.Scanner;

public class Array_hj {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String menus[] = new String[5];
		
		System.out.println("메뉴를 입력하세요.");
		
		for (int i = 0; i < menus.length; i++) {
			menus[i] = scanner.next();
			System.out.println("오늘 먹고 싶은 점심 메뉴 리스트 : " + menus[i]);			
		}
		
		scanner.close();
	}

}
