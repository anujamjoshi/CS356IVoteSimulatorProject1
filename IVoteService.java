import java.util.ArrayList;
import java.util.Scanner;

public class IVoteService {
	ArrayList<Student> studentList = new ArrayList<Student>();
	Question question;

	// STEP 1: configuration:

	/* get question type from user and creates a question of that type and  answer choices although because we are using the driver class to simulate various scenarios I am not going to use it*/

//	public String getUserInput() {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("what type of question would you like to use today?");
//		System.out.println("Type 'T/F' for true-false question and 'MCQ' for multiple choice question");
//		String input = scan.nextLine();
//		while (!input.equalsIgnoreCase("T/F") && input.equals("MCQ")) {
//			System.out.println("Type 'T/F' for true and false question and 'MCQ' for multiple choice question");
//			input = scan.nextLine();
//		}
//		scan.close();
//		return input;
//	}

	public void getQuestionType(String type) {
		if (type.equalsIgnoreCase("T/F")) {
			question = new TFQ();
		} else if (type.equalsIgnoreCase("MCQ")) {
			question = new MCQuestion();
		}
	}

	// STEP 2: get submissions from students

	/*2A: add the students to the list and make their id's from 1 to the number of students*/
//	public int getNumStudentsfromUserInput() {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("How many students?");
//		int input = scan.nextInt();
//		scan.close();
//		return input;
//	}

	public void addStudents(int numberOfStudents) {
		for (int i = 1; i <= numberOfStudents; i++) {
			studentList.add(new Student(i));
		}
	}
	

	/* for this program we also need a way to set the answer for each student even if they decide to change it
	// by saving the answer in the Student class itself, we have eliminated the possibility that there are multiple answers for any one student
	 */
	
//	public String getUserInputAnswer(){
//		Scanner scan = new Scanner(System.in);
//		System.out.println("What is your answer?");
//		String input = scan.next();
//		scan.close();
//		return input;
//	}
	public void setStudentAnswer(int studentID, String answer) {
		System.out.println("Student " + studentID + "\tAnswer=" + answer);
		studentList.get(studentID).setAnswer(answer);
	}

	// gets the final answer of the student and adds it into the count for each
	// question
	public void getFinalAnswer() {
		for (Student s:studentList){
		question.addAnswers(s.getAnswer());
		}
	}
	

	// STEP 3: get Statistics for each question

	public void answerStatistics() {
		System.out.println(question.printResults());
	}

}

