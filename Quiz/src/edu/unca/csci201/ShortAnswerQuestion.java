package edu.unca.csci201;

public class ShortAnswerQuestion implements Question {

	private String CorrectAnswer;
	private String question;

	
	
	public ShortAnswerQuestion(String string) {
		question = string + "(Please type in your answer in small letters!)";
	
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
