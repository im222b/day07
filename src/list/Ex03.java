package list;

import java.util.ArrayList;

public class Ex03 {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		arr.add("aaa");
		arr.add("bbb");
		arr.add("ccc");
		System.out.println(arr.indexOf("bbb"));
		System.out.println(arr.indexOf("bbb22")); //없어서 -1 있으면 1
		System.out.println("====set=====");
		
		System.out.println(arr);
		arr.remove("bbb");
		arr.add("bbb");
		arr.add(1,"홍길동");// 특정위치에 값을 넣고 싶다면 위치값 단 그 위치값을 지운후
		System.out.println(arr);// 삭제후 추가 하면 마지막에 추가
	
		arr.set(1,"김개똥"); // 지운후 값을 넣지않고 바로 위치 변경 사용가능
		System.out.println(arr);
	
	
	}
	
	

}
