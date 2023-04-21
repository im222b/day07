package str;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.print.DocFlavor.STRING;
import javax.swing.SizeRequirements;

public class Ex04 {
	public static void main(String[] args) {
		/*
		 * StringBuilder s = new
		 * StringBuilder("Have a nice day Have a nice day Have a nice day"); String
		 * specificString = "a";
		 * 
		 * List<Integer> intList = new ArrayList<>(); int index =
		 * s.indexOf(specificString);
		 * 
		 * while(index > -1) { intList.add(index); index = s.indexOf(specificString,
		 * index +1);
		 * 
		 * } System.out.println(Arrays.toString(intList.toArray()));
		 */
		ArrayList<Integer> arr = new ArrayList<>();
		String a = "Have a nice day Have a nice day Have a nice day";

		int index = a.indexOf("a");
		String word = "a";
		while (index != -1) {
			arr.add(index);
			index = a.indexOf(word, index + word.length());
		}
		System.out.println(arr);
	
	
	}
}
