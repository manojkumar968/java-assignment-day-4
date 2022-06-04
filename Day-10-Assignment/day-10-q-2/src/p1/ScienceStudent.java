package p1;

public class ScienceStudent extends Student {

	String physicMarks;
	String chemistryMarks;
	String mathMarks;
	public ScienceStudent(int pmarks,int cmarks,int mmarks,String name,String add) {
		
		super(name,add);
		this.physicMarks=this.getParcentage(pmarks);
		this.chemistryMarks=this.getParcentage(cmarks);
		this.mathMarks=this.getParcentage(mmarks);
		
	}
	
	

	


	@Override
	public String toString() {
		return "ScienceStudent [physicMarks=" + physicMarks + ", chemistryMarks=" + chemistryMarks + ", mathMarks="
				+ mathMarks + ", name=" + name + ", address=" + address + "]";
	}






	@Override
	public  String getParcentage(int marks) {
		if(marks>100) {
			System.out.println("enter vaild marks");
			return null;
		}
		else {
			return marks+"%";
		}
		
	}

}
