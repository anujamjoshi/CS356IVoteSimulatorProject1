
public class Student {
	private int ID; // value between 1 and 30 to make unique
	private Answer answer; 
	public Student(int id){
		setID(id);
	}
	public void setAnswer(String a){
		answer = new Answer(a);
	}
	public Answer getAnswer(){
		return answer; 
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	
}

