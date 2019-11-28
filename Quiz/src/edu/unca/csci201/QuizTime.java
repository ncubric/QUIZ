package edu.unca.csci201;

public class QuizTime {

	public static void main(String[] args) {
		
			
		Quiz quiz = new Quiz();
		
		TrueFalseQuestion question1 = new TrueFalseQuestion("October 10th falls on a Tuesday every year.");
		question1.isCorrectAnswer("F");
		quiz.addQuestion(question1);
		
		TrueFalseQuestion question2 = new TrueFalseQuestion("Oreo cookies have existed longer than cholocate chip cookies.");
		question2.isCorrectAnswer("T");
		quiz.addQuestion(question2);
		
		TrueFalseQuestion question3 = new TrueFalseQuestion("Female kangaroos have three vaginas.");
		question3.isCorrectAnswer("T");
		quiz.addQuestion(question3);
		
		TrueFalseQuestion question4 = new TrueFalseQuestion("France was still executing people with a guillotine when the first Star Wars film came out in 1977");
		question4.isCorrectAnswer("T");
		quiz.addQuestion(question4);
		
		MultipleChoiceQuestion question5 = new MultipleChoiceQuestion("How many months have 28 days?\nA) 2 B) 1 C) All of them D) Depends if it's a leap year or not");
		question5.isCorrectAnswer("C");
		quiz.addQuestion(question5);
		
		MultipleChoiceQuestion question6 = new MultipleChoiceQuestion("How many corpses are on Mount Everest that are used as waypoints for climbers?\nA) 10 B)1 C) None D) over 200 ");
		question6.isCorrectAnswer("D");
		quiz.addQuestion(question6);
		
		MultipleChoiceQuestion question7 = new MultipleChoiceQuestion("Peanut butter can contain what?\nA) nails B) rat hair C) chocolate D) parts of plains");
		question7.isCorrectAnswer("B");
		quiz.addQuestion(question7);
		
		MultipleChoiceQuestion question8 = new MultipleChoiceQuestion("What was once illegal to serve in Kansas?\nA) Ice cream on Cherry pie B) Pizza C) Tea D) Pumpkin pie");
		question8.isCorrectAnswer("A");
		quiz.addQuestion(question8);
		
		ShortAnswerQuestion question9 = new ShortAnswerQuestion("What is the smallest country in the world?");
		question9.isCorrectAnswer("vatican");
		quiz.addQuestion(question9);
		
		ShortAnswerQuestion question10 = new ShortAnswerQuestion("What city has the largest population in the world?");
		question10.isCorrectAnswer("shangai");
		quiz.addQuestion(question10);
		
		ShortAnswerQuestion question11 = new ShortAnswerQuestion("What country owns Greenland?");
		question11.isCorrectAnswer("denmark");
		quiz.addQuestion(question11);
		
		ShortAnswerQuestion question12 = new ShortAnswerQuestion("What year was the first car made?");
		question12.isCorrectAnswer("1885");
		quiz.addQuestion(question12);
		
		
		
		
		
		quiz.giveQuiz();
		
	

	}

	

}
