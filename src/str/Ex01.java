package str;

public class Ex01 {
public static void main(String[] args) {
	String s = new String(); // 자동으로 null 값이 들어감 
	s = "aBcD";
	System.out.println( s );
	s= s.toUpperCase();//첫번쨰 글자가 소문자인것들은 기능이 없지만 대문자인 경우 기능이 있음 
					//모든 문자를 대문자로 변환(일시적)
	System.out.println(s);
	System.out.println(s.toLowerCase());
	
	System.out.println(s.charAt(0));  //뒤엔 인덱스 번호
	System.out.println(s.charAt(1));
	

}
}
