public class Answer {
	String answer;
	boolean correct=false; 
	public Answer (String ans){
		answer=ans;
	}
	public String getAnswer(){
		return answer;
	}
	public void setCorrect(){
		correct=true;
	}
	public boolean isCorrect(){
		return correct;
		
	}
}

