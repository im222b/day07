package set;

import java.util.ArrayList;
import java.util.Scanner;

public class dsadsa {
   public static void main(String[] args) {
      ArrayList<String> name = new ArrayList<>();
      ArrayList<String> phone = new ArrayList<>();
      Scanner input = new Scanner(System.in);
      String inputName = null, inputPhone = null;
      int num;

      while (true) {
         System.out.println("1. 연락처 등록");
         System.out.println("2. 연락처 보기");
         System.out.println("3. 연락처 삭제");
         System.out.println("4. 모든 연락처 보기");
         System.out.println("5. 종료");
         System.out.print(">>> : ");
         num = input.nextInt();

         switch (num) {
         case 1: // 이름과 전화번호 (중복 허용 안됨)
            System.out.print("이름 입력 : ");
            inputName = input.next();
            System.out.print("연락처 입력 : ");
            inputPhone = input.next();
            if (!name.contains(inputName)) {
               if (!phone.contains(inputPhone)) {
                  name.add(inputName);
                  phone.add(inputPhone);
                  System.out.println("등록 완료되었습니다");
               } else {
                  System.out.println("이미 등록된 연락처입니다");
               }
            } else {
               System.out.println("이미 등록된 회원입니다");
            }
            break;

         case 2: // 등록되어 있지 않으면 목록에 없습니다
            System.out.print("연락처를 확인할 회원 이름 입력 : ");
            inputName = input.next();
            int index1 = name.indexOf(inputName);
            if (name.contains(inputName)) {
               System.out.println("연락처 : " + phone.get(index1));
            } else {
               System.out.println("등록되지 않은 회원입니다");
            }
            break;

         case 3: // 목록에 없으면 목록에 없습니다
            System.out.print("삭제할 회원의 이름 입력 : ");
            inputName = input.next();
            int index2 = name.indexOf(inputName);

            if (name.contains(inputName)) {
               name.remove(index2);
               phone.remove(index2);
            } else {
               System.out.println("존재하지 않는 회원입니다");
            }
            break;

         case 4: // 등록되어 있는 목록 전부 출력
            System.out.println("모든 연락처 출력");
            System.out.println("이름 : " + name);
            System.out.println("연락처 : " + phone);
            break;

         case 5:
            System.out.println("종료");
            System.exit(1);
         }
      }
   }
}