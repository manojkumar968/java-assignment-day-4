package p1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		Regular_Expression re=new Regular_Expression();
		Pattern p=Pattern.compile("Java");
		Matcher m=p.matcher(re.data);
		
		int count=0;
		while(m.find()) {
			count++;
			System.out.println(m.start()+"--------"+m.end()+"---------"+m.group());
		}
		
		System.out.println("The no of occurrences: "+count);

	}

}
