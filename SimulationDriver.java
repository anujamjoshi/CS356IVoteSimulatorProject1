import java.util.Random;
import java.util.Scanner;
public class SimulationDriver{

	public static void main(String[]args){


		Scanner testInput = new Scanner(System.in);
		Random randomGenerator = new Random();
		int testNum=0; 
		while(testNum!=5){
			System.out.println("PLEASE CHOOSE A TEST number");
			System.out.println("Test 1: True/False with no changes in student answers ");
			System.out.println("Test 2: MCQ with no changes in student answers ");
			System.out.println("Test 3: T/F with changes in student answers ");
			System.out.println("Test 4: MCQ with changes in student answers ");
			System.out.println("Type '5' to Quit");
			testNum=testInput.nextInt(); 
			if (testNum==1){
				IVoteService service1 = new IVoteService();
				service1.getQuestionType("T/F");

				int numStudents=randomGenerator.nextInt(40);
				System.out.println("Number of Students Generated are:"+ numStudents);
				service1.addStudents(numStudents);
				String answer="";
				for (int i =0; i < numStudents;i++){
					int ans = randomGenerator.nextInt(2);
					if (ans==0){
						answer="T";
					}
					else{
						answer="F";
					}
					service1.setStudentAnswer(i, answer);
				}
				service1.getFinalAnswer();
				service1.answerStatistics();

			}
			else if (testNum==2){
				IVoteService service1 = new IVoteService();
				service1.getQuestionType("MCQ");

				int numStudents=randomGenerator.nextInt(40);
				System.out.println("Number of Students Generated are:"+ numStudents);
				service1.addStudents(numStudents);
				String answer="";
				for (int i =0; i < numStudents;i++){
					int ans = randomGenerator.nextInt(4);
					if (ans==0){
						answer="A";
					}
					else if (ans==1){
						answer="B";
					}
					else if (ans==2){
						answer="C";
					}
					else if (ans==3){
						answer="D";
					}
					service1.setStudentAnswer(i, answer);
				}
				service1.getFinalAnswer();
				service1.answerStatistics();
			}
			else if (testNum ==3){

				IVoteService service1 = new IVoteService();
				service1.getQuestionType("T/F");

				int numStudents=randomGenerator.nextInt(40);
				System.out.println("Number of Students Generated are:"+ numStudents);
				service1.addStudents(numStudents);
				String answer="";
				for (int i =0; i < numStudents;i++){
					int ans = randomGenerator.nextInt(2);
					if (ans==0){
						answer="T";
					}
					else{
						answer="F";
					}
					service1.setStudentAnswer(i, answer);
				}
				System.out.println("CHANGING THE ANSWER");
				int ans = randomGenerator.nextInt(2);
				if (ans==0){
					answer="T";
				}
				else{
					answer="F";
				}
				service1.setStudentAnswer(randomGenerator.nextInt(numStudents), answer);
				service1.getFinalAnswer();
				service1.answerStatistics();
			}
			else if (testNum == 4){
				IVoteService service1 = new IVoteService();
				service1.getQuestionType("MCQ");

				int numStudents=randomGenerator.nextInt(40);
				System.out.println("Number of Students Generated are:"+ numStudents);
				service1.addStudents(numStudents);
				String answer="";
				for (int i =0; i < numStudents;i++){
					int ans = randomGenerator.nextInt(4);
					if (ans==0){
						answer="A";
					}
					else if (ans==1){
						answer="B";
					}
					else if (ans==2){
						answer="C";
					}
					else if (ans==3){
						answer="D";
					}
					service1.setStudentAnswer(i, answer);
				}
				System.out.println("CHANGING THE ANSWER");
				int ans = randomGenerator.nextInt(4);
				if (ans==0){
					answer="A";
				}
				else if (ans==1){
					answer="B";
				}
				else if (ans==2){
					answer="C";
				}
				else if (ans==3){
					answer="D";
				}
				service1.setStudentAnswer(randomGenerator.nextInt(numStudents), answer);
				service1.getFinalAnswer();
				service1.answerStatistics();

			}
		}
	
	}
}
