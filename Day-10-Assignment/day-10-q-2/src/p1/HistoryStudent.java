package p1;

public class HistoryStudent extends Student {

	String historyMarks;
	String civicsMarks;
	
	public HistoryStudent(int hMarks,int civMarks,String name,String add) {
		super(name,add);
		this.historyMarks=this.getParcentage(hMarks);
		this.civicsMarks=this.getParcentage(civMarks);
	}
	

	@Override
	public String toString() {
		return "HistoryStudent [historyMarks=" + historyMarks + ", civicsMarks=" + civicsMarks + ", name=" + name
				+ ", address=" + address + "]";
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
