package str;

public class Ex06 {
public static void main(String[] args) {
	 String str = new String("tESt sTring   change   first");
     String changeStr = new String();
     String[] s = str.toLowerCase().split(" "); //기준잡기
     
     System.out.println("변경 전 : "+str);
     for(int i=0;i<s.length;i++) {//배열
        for(int j=0;j<s[i].length();j++) {//배열 첫 문자
           if(j == 0) {
              changeStr += s[i].toUpperCase().charAt(j);
           }else {
              changeStr += s[i].charAt(j);
           }
        }
        changeStr += " ";
     }
     
     System.out.println("변경 후 : "+changeStr);
}
}
