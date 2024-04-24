package homework;

import java.util.Scanner;

public class Array_hj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner scanner = new Scanner(System.in);

		String foodstringArray[];
		foodstringArray = new String[5];
		
		System.out.println("먹고싶은 메뉴를 입력해주세요.");

		// 반복문 이용해서 , 콘솔에 입력한 양수 5개를 배열에 담기

		for (int i = 0; i < foodstringArray.length; i++) {
			foodstringArray[i] = scanner.next();
			System.out.println((i+1)+"번째 먹고싶은 메뉴는 " + foodstringArray[i] + "입니다.");
		}
//		System.out.println("먹고싶은 메뉴는 " + foodstringArray[0] + "입니다.");
//		System.out.println("먹고싶은 메뉴는 " + foodstringArray[1] + "입니다.");
//		System.out.println("먹고싶은 메뉴는 " + foodstringArray[2] + "입니다.");
//		System.out.println("먹고싶은 메뉴는 " + foodstringArray[3] + "입니다.");
//		System.out.println("먹고싶은 메뉴는 " + foodstringArray[4] + "입니다.");
		
		
		
	}

}
