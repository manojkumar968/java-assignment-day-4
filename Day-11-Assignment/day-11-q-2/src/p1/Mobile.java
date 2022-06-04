package p1;

public class Mobile {
	
	String[] outdatedModels = {"note4","note5","note6","note7"};

	public void searchOutdatedModel(String companyName,String... model ){
		Mobile m=new Mobile();
		
		for(String modEnter:model) {
			for(String modSet:m.outdatedModels ) {
				
				if(modEnter==modSet) {
					System.out.println(modEnter+"_OUTDATE");
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		Mobile m=new Mobile();
		m.searchOutdatedModel("Samsung","note4","note11","note7");
	}
}
