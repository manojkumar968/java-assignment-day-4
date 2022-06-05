package p1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Re {

	public static void main(String[] args) {

		Pattern p=Pattern.compile("o");
//		Matcher m=p.matcher();
		String[] str=p.split("hello manoj how are you manoj");
		
		for(String s:str) {
			System.out.println(s);
		}
		
	}
}