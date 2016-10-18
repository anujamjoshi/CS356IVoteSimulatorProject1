public class TFQ implements Question {
	private int[] answerCount = { 0, 0 };
	@Override
	public String printResults() {
		return ("True: " + answerCount[0] + "\nFalse: " + answerCount[1]);
	}

	@Override
	public void addAnswers(Answer a) {

		if (a.getAnswer().toUpperCase() == "T") {
			answerCount[0]++;
		} else if (a.getAnswer().toUpperCase() == "F") {
			answerCount[1]++;
		}

	}

}

