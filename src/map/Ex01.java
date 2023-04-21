package map;

import java.util.HashMap;

/*
 HashMap
 - 키, 값(벨류)으로 이뤄져 있다  예(키)num(값)100
 - 순서는 유지되지않는다
 - 키의 중복은 허용하지 않는다. 값은 중복 가능
 
 */
public class Ex01 {
public static void main(String[] args) {
	HashMap<String,String> map1 = new HashMap<>();
	HashMap<Integer,String> map2 = new HashMap<>();
	HashMap<String,Integer> map3 = new HashMap<>();
	
	map1.put("name", "홍길동");
	map1.put("age", "20");
	map1.put("addr","산골짜기");
	
	System.out.println( map1 );
	System.out.println( map1.get("name") ); //해당하는 값을 불러오는 방법
	
	map2.put(1111, "하나");
	map2.put(2222, "둘");
	map2.put(3333, "셋");
	System.out.println(map2);
	System.out.println(map2.get(2222));
	System.out.println(map2.get(2)); //해당 값이 없다면 null
	
}
}
