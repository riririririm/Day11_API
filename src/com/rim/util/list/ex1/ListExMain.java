package com.rim.util.list.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class ListExMain {

	public static void main(String[] args) {
		// 1.정보입력 2.정보출력 3.종료
		// 1>>이름,나이입력
		// 2>>모든정보출력

		Scanner sc = new Scanner(System.in);
		ArrayList info = new ArrayList();
		ListExInput input = new ListExInput();
		ListExView view = new ListExView();
		boolean check = true;

		while (check) {
			System.out.println("1.정보입력 / 2.정보출력 / 3.종료");
			int select = sc.nextInt();

			switch (select) {
			case 1:
				//info = input.setInfo();
				input.setInfo(info);
				break;
			case 2:
				view.view(info);
				break;
			case 3:
				System.out.println("프로그램 종료");
				check = false;
				break;
			default:
				System.out.println("1~3중에 선택하세요.");
			}
		}

	}

}
