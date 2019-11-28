package edu.unca.csci201;

import java.util.Scanner;

public class Quiz {

		Question [] Quiz = new Question[25];
		Question [] wrongQuestions = new Question[25];
		
		public void addWrongQuestion(Question wq) {
			int i1 = 0;
			while(wrongQuestions[i1]!=null) {
				i1++;
			}
			wrongQuestions[i1] = wq;
			
		}
		
		
		public void addQuestion(Question q) {
				int i=0;
				while(Quiz[i]!=null) {
					i++;
					
				}
				Quiz[i] = q;
			
		}
		public double giveQuiz() {
			Scanner scan = new Scanner(System.in);
			
			double score = 0;
			
			int totalQuestions = 0;
			
			for(int i = 0; i<Quiz.length; i++) {
				
				if(Quiz[i] != null) {
				
					System.out.print(Quiz[i].getTheQuestionText());
				totalQuestions++;
				String UserAnswer = scan.nextLine();
				
				if(UserAnswer.equals(Quiz[i].getCorrectAnswer())) {
					score++;
				}else {
					addWrongQuestion(Quiz[i]);
					
					
				}
				
				}
				
				
			}
			System.out.println("\nYour score is: "+ score + " out of " + totalQuestions);
			System.out.println("\nThese are the questions you got wrong, and below them is the correct answer: ");
			for(int i = 0; i< wrongQuestions.length; i++) {
				if(wrongQuestions[i]!=null) {
					
					System.out.println(wrongQuestions[i].getTheQuestionText());
					System.out.println(wrongQuestions[i].getCorrectAnswer());
				}
				
			}
			return score;
			
			
		}
		
		

	

}
