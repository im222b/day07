package str;

public class Ex05 {
	 
    public static void main(String[] args) {
        String example = "It is a fun java programming";
        int count = 0;
        for (int i = 0; i < example.length(); i++) {
            if (example.charAt(i) == 'a') count++;
        }
        int count1 = 0;
        for (int i = 0; i < example.length(); i++) {
            if (example.charAt(i) == 'g') count1++;
        }
        
        System.out.println("총개수 : "+ example.length());
        System.out.println("a의 개수: " + count);
        System.out.println("g의 개수: " + count1);
    }
 
}