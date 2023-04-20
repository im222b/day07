package set;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<String> id = new ArrayList<>();
		ArrayList<String> pwd = new ArrayList<>();
		ArrayList<String> name = new ArrayList<>();
		ArrayList<String> phone = new ArrayList<>();
		String inputName = null, inputPhone = null, 
				inputId = null, inputPwd = null;
		int num;
		while (true) {
			System.out.println("1.아이디 등록");
			System.out.println("2.아이디 보기");
			System.out.println("3.아이디 삭제");
			System.out.println("4.모든 아이디 보기");
			System.out.println("5.종료");
			System.out.print(">>> : ");
			num = input.nextInt();

			switch (num) {
			case 1:
				System.out.print("아이디 입력 : ");
				inputId = input.next();
				System.out.print("비번 입력 : ");
				inputPwd = input.next();
				System.out.print("이름 입력 : ");
				inputName = input.next(); // 입력 방식
				System.out.print("전화번호 입력 : ");
				inputPhone = input.next();
				if (!id.contains(inputId)) {// 받은 입력값이 기존에 있던값인지 확인
					if (!name.contains(inputName)) {
						id.add(inputId);
						pwd.add(inputPwd);
						name.add(inputName); // arr로 등록
						phone.add(inputPhone);
						System.out.println("등록완료");
					} else {
						System.out.println("등록된 아이디 입니다.");
					}
				} else {
					System.out.println("이미 등록된 회원입니다");
				}
				break;

			case 2:
				System.out.print("아이디 입력 : ");
				inputId = input.next();
				System.out.print("비번 입력 : ");
				inputPwd = input.next();
				int index1 = id.indexOf(inputId);
				if (id.contains(inputId)) {
					if(pwd.contains(inputPwd)) {
					System.out.println("비번 : " + pwd.get(index1));
					System.out.println("이름 : " + name.get(index1));
					System.out.println("연락처 : " + phone.get(index1));
					} else {
					System.out.println("등록되지 않은 회원입니다.");
				}
				}
				break;
			case 3:
				System.out.print("아이디 입력 : ");
				inputId = input.next();
				System.out.print("비번 입력 : ");
				inputPwd = input.next();
				int index2 = id.indexOf(inputId);
				if (id.contains(inputId)) {
					if (pwd.contains(inputPwd)) {
						name.remove(index2); // arr에 있는 이름 지우기
						id.remove(index2); // arr에 있는 이름 지우기
						pwd.remove(index2); // arr에 있는 이름 지우기
						phone.remove(index2);
						System.out.println("삭제 완료");
					} else {
						System.out.println("존재하지 않는 회원입니다");
					}
				}
				break;
			case 4:
				System.out.println("회원 확인");
				System.out.print("아이디 입력 : ");
				inputId = input.next();
				System.out.print("비번 입력 : ");
				inputPwd = input.next();
				if (id.contains(inputId)) {
					if (pwd.contains(inputPwd)) {
				System.out.println("모든 연락처 출력");
				System.out.println("아이디 :" + id);
				System.out.println("비번 :" + pwd);
				System.out.println("이름 :" + name);
				System.out.println("번호 :" + phone);
					} else {
						System.out.println("존재하지 않는 회원입니다");
					}
				}
				break;
			case 5:
				System.out.println("종료");
				System.exit(1);
			}
		}
	}
}
