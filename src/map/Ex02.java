package map;

import java.util.HashMap;

public class Ex02 {
public static void main(String[] args) {
	HashMap<String, String> map = new HashMap<>();
	
	map.put("선풍기","100만원");
	map.put("에어컨","50만원");
	map.put("자동차","10만원");
	
	System.out.println(map);
	System.out.println("결과 : "+map.containsKey("자동차")); //해당하는 키가 있는지 확인
	System.out.println("결과 : "+map.containsValue("50만원")); // 해당하는 값이 있는지 확인
	

	map.put("선풍기1", "100만원");
	map.put("자동차", "1000만원");
	System.out.println(map);  // 키에 대한 중복이 있을경우 값이 바뀜

	map.remove("선풍기1"); // 원하는 값 삭제
	System.out.println(map);
}
}
