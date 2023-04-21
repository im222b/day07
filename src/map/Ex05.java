package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;

import javax.swing.InputMap;

public class Ex05 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	HashMap<String, String> map = new LinkedHashMap<>();
	String meum , cash ;
	int num;
	while (true) {
		System.out.println("1.메뉴 등록");
		System.out.println("2.메뉴별 가격 보기");
		System.out.println("3.종료");
		System.out.print(">>> : ");
		num = input.nextInt();

		switch (num) {
		
		case 1 : //메뉴 등록
			System.out.print("음식 이름 입력 : ");
			meum = input.next();
			System.out.print("가격 입력 : ");
			cash = input.next();
			if (!map.containsKey(meum)) {
			map.put (meum,cash);
			}else {
				System.out.println("존재하는 메뉴입니다");
			}
			System.out.println("등록완료");
			break;
			 
		case 2 : //메뉴별 가격보기
			Iterator<String> food =map.keySet().iterator(); // 반복자로 변환
			while(food.hasNext()){
				String key = food.next();
				System.out.println( key + " : "+map.get(key));
			}
			System.out.println("1.수정");
			System.out.println("2.삭제");
			System.out.println("3.나가기");
			System.out.print(">>> : ");
			num = input.nextInt();
			switch (num) {
			case 1 ://수정
				System.out.print("음식 이름 입력 : ");
				meum = input.next();
				System.out.print("가격 입력 : ");
				cash = input.next();
				if (map.containsKey(meum)) {
					map.put (meum,cash);
				}else {
					System.out.println("존재하지 않는 메뉴입니다");
				}
				System.out.println("수정 완료");
				break;
			case 2 ://삭제
				System.out.print("음식 이름 입력 : ");
				meum = input.next();
				System.out.print("가격 입력 : ");
				cash = input.next();
				if (map.containsKey(meum)) {
					map.remove (meum,cash);
				}else {
					System.out.println("존재하지 않는 메뉴입니다");
				}
				System.out.println("삭제 완료");
				break;
			case 3 ://나가기
				System.out.println("종료");
				System.exit(1);
				
			}
			break;
			
		case 3 : //종료
			System.out.println("종료");
			System.exit(1);
		}
		}
}

}
