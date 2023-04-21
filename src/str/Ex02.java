package str;

public class Ex02 {
public static void main(String[] args) {
	int num = 1111;
	String st = num+""; //문자 더하기 숫자는 문자 
	System.out.println(	st + num);
	int n = Integer.parseInt(st);//문자형 인트형으로 바꾸는법
	System.out.println(n+num);  //단 숫자형태로 이뤄진 문자열만 가능
	
	String st02 = "";
	st02 += "a";
	st02 += 'b';
	st02 += (char)'c' - 32; //
	System.out.println(st02);
}
}
		