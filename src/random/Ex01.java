package random;

import java.util.ArrayList;

public class Ex01 {
public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		
		for(int i =0; i<6; i++) { //0.000 ~ 0.999 값을 생성 
			double ran = Math.random();
			arr.add( (int)(ran*45)+1 );
		}
		System.out.println( arr );
}
}
