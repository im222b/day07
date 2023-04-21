package str;

public class Ex03 {
public static void main(String[] args) {
	String id= "test";
	id.trim(); //공백을 제	거한다
	System.out.println(id+"!");
	if (id.equals("test")) {
		System.out.println("인증통과");
	}else {
		System.out.println();
	}
	String addr = "우편번호/주소/상세주소"; // 구분 하기위게 / 
	String[] s = addr.split("/");             //어떤값을 기준으로 자를것인지
	System.out.println(s[0]);
	System.out.println(s[1]);
	System.out.println(s[2]);
	
	System.out.println("addr : " +addr);
	addr = addr.replace("/" ,"=>");
	System.out.println("addr : " +addr);
}
}
