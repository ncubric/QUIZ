package edu.unca.csci201;

public class TrueFalseQuestion implements Question {

	
	 private String CorrectAnswer;
	 private String question;
	
	
	public TrueFalseQuestion(String string) {
		question = string + "(Please pick T for true and F for false)";
		
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
