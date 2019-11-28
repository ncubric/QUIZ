package edu.unca.csci201;

public class MultipleChoiceQuestion implements Question {


	private String CorrectAnswer;
	private String question;
	
	 
	 public MultipleChoiceQuestion(String string) {
		question = string + "(Please pick A or B or C or D for your answer)"; 
		
		
	 }
	 
	
	
	@Override
	public String getTheQuestionText() {
		return question;
		
	}

	@Override
	public boolean isCorrectAnswer(String answer) {
		CorrectAnswer = answer;
		return true;
	}

	@Override
	public String getCorrectAnswer() {
		
		return CorrectAnswer;
	}

}
