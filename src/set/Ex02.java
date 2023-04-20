package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;



public class Ex02 {
public static void main(String[] args) {
	ArrayList<String> arr = new ArrayList<>();
	arr.add("aaa");
	arr.add("bbb");
	arr.add("ccc");
	
	Iterator<String> it = arr.iterator();
	//[bof aaa bbb ccc eof]
	// it  it   it  it  
	/*
	System.out.println(it.hasNext());
	System.out.println(it.next());
	System.out.println(it.next());
	System.out.println(it.next());
	System.out.println(it.hasNext());
	*/
	//for(;it.hasNext();) // it.hasNext() == true
	while ( it.hasNext() );
	System.out.println(it.next());
	System.out.println("==========");
	
	HashSet<String> set = new HashSet<>();
	set.add("set.aaa");
	set.add("set.bbb");
	set.add("set.ccc");
	Iterator<String> ite = set.iterator();
	while ( ite.hasNext() );
		System.out.println(ite.next());
	


}
}
