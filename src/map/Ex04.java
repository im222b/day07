package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class Ex04 {
public static void main(String[] args) {
	HashMap<String, String> map = new LinkedHashMap<>(); //순서를 유지한다
	map.put("name", "홍길동");
	map.put("age", "20");
	map.put("addr", "산골짜기");
	System.out.println( map );
	
	//Set<String> set = map.keySet();
	//Iterator<String> it = set.iterator(); 
	Iterator<String> it =map.keySet().iterator(); // 반복자로 변환
	
	
	while(it.hasNext()){
		String key = it.next();
		System.out.println( key + " : "+map.get(key));
	}
}
}
