public class Answer {
	String answer; // this is the answer that the user(student) inputs
	boolean correct=false; // if the user wants to create a "correct answer he/she can use this boolean to store it  
	// the constructor 
	public Answer (String ans){
		answer=ans;
	}
	// get the string answer 
	public String getAnswer(){
		return answer;
	}
	//this is used if the user wants to make a answer correct 
	public void setCorrect(){
		correct=true;
	}
	// checks to see if the answer is correct
	public boolean isCorrect(){
		return correct;
		
	}
}

