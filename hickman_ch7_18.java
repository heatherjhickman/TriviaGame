package hickman_ch7_18;

public class hickman_ch7_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Author: Heather Hickman
		Class: CPT 236 H01 Intro to Java Programming
		Date written: 7/25/2019
		Date last updated: 7/25/2019
		Program name: hickman_ch7_18.java
		
		Program summary: Chapter 7, Challenge 18, "Trivia Game"
		Summary:  In this programming challenge you will create a simple trivia game for two players.
		The program will work like this:

		Starting with player 1, each player gets a turn at answering five trivia questions. (There are a total of 10 questions.)
		When a question is displayed, four possible answers are also displayed. Only one of the answers is correct, and if the
		player selects the correct answer he or she earns a point. After answers have been selected for all of the questions,
		the program displays the number of points earned by each player and declares the player with the highest number of points
		the winner.
		
		In this program you will design a Question class to hold the data for a trivia question.
		The Question class should have member variables for the following data:
		
			A trivia question
			Possible answer #1, #2, #3, and #4
			The number of the correct answer (1, 2, 3, or 4)
			
		The Question class should have appropriate constructor(s), accessor, and mutator functions.
		
		The program should create an array of 10 Question objects, one for each trivia question.
		Make up your own trivia questions on the subject or subject of your choice for the objects.*/
		
		
		// Initialize variables
		String userAnswer;
		String rightAnswer;
		int p1numWins = 0;
		int p2numWins = 0;
		
		// Create a new trivia game object using the Question class
		Question triviaGame = new Question();
		
		
		// Use a for loop to cycle through Player 1's questions and answers
		// add +1 to player 1's total correct count if they answered the question correctly
		for(int index = 0; index <5; index++) {
			triviaGame.questions1(index);
			triviaGame.options1(index);
			userAnswer = triviaGame.getAnswer();
			rightAnswer = triviaGame.answers1(index);	
			
			if(userAnswer.equals(rightAnswer)) {
				p1numWins++;		}}
		
		
		// simple divider between player 1 and player 2's sets of questions
		System.out.println();
		System.out.println("------------------------------");
		System.out.println("Player 2's turn!");
		System.out.println("------------------------------");
		System.out.println();


		// Use a for loop to cycle through Player 2's questions and answers
		// add +1 to player 2's total correct count if they answered the question correctly		
		for(int index = 0; index <5; index++) {
			triviaGame.questions2(index);
			triviaGame.options2(index);
			userAnswer = triviaGame.getAnswer();
			rightAnswer = triviaGame.answers2(index);			
			if(userAnswer.equals(rightAnswer)) {
				p2numWins++;		}}
		
		
		// Print out how many times each player got the questions correct
		System.out.println("\nPlayer 1 got " + p1numWins + "/5");
		System.out.println("Player 2 got " + p2numWins + "/5");
		
		// if/else to determine the winner and print out a 'congrats' statement
		if (p1numWins > p2numWins) {
			System.out.println("Congrats Player 1, you win!"); }
		
		else  if(p1numWins < p2numWins){
			System.out.println("Congrats Player 2, you win!"); }
		
		else{ System.out.println("The game was a draw!"); }
		
	}

}
