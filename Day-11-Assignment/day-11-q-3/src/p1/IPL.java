package p1;

import java.util.Scanner;

public class IPL {

	void homeTeamStadium(Stadium stadium) { 
		
		switch(stadium) {
			
		case EDEN_GARDENS_STADIUM:
			System.out.println("This is the home ground of KKR");
			break;
		case WANKHEDE_STADIUM:
			System.out.println("This is the home ground of Mumbai Indians");
			break;
		case CHIDAMBARAM_STADIUM:
			System.out.println("“This is the home ground of CSK”");
			break;
		case M_CHINNASWAMY_STADIUM:
			System.out.println("“This is the home ground of RCB”");
			break;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter stadium name");
		String stadium=sc.nextLine();
		sc.close();
		String stadium2=stadium.toUpperCase();
		IPL i=new IPL();
		switch(stadium2) {
		case "EDEN GARDENS STADIUM":
			i.homeTeamStadium(Stadium.EDEN_GARDENS_STADIUM);
			break;
		case "WANKHEDE STADIUM":
			i.homeTeamStadium(Stadium.WANKHEDE_STADIUM);
			break;
		case "CHIDAMBARAM STADIUM":
			i.homeTeamStadium(Stadium.CHIDAMBARAM_STADIUM);
			break;
		case "M CHINNASWAMY STADIUM":
			i.homeTeamStadium(Stadium.M_CHINNASWAMY_STADIUM);
			break;
		}
	
	}
}
