package hickman_ch7_18;

import java.util.ArrayList;
import java.util.Scanner;

public class Question {
	
	// Create an array with the first set of questions (for player 1)
	public void questions1(int index){
		ArrayList<String> player1Question = new ArrayList<String>();
		player1Question.add("Which member of Metallica is the lead singer?");
		player1Question.add("\nWhich actress plays Jessica Jones in the self-titled Netflix series?");
		player1Question.add("\nWhich publisher produces Martian Manhunter comic books?");
		player1Question.add("\nWho's is the first voice heard in the movie Lord of the Rings: The Fellowship of the Ring?");
		player1Question.add("\nWhich Norse God is known for his/her mischief?");
		System.out.println(player1Question.get(index));	}
	
	
	// Create an array with a set of possible answers to match each respective question
	public void options1(int index){
		ArrayList<String> player1Answer = new ArrayList<String>();
		player1Answer.add("A. Lars Ulrich\nB. Kirk Hammett\nC. James Hetfield\nD. Robert Trujillo");
		player1Answer.add("A. Krysten Ritter\nB. Megan Fox\nC. Ruby Rose\nD. Jenna Dewan");
		player1Answer.add("A. Marvel\nB. DC\nC. Image\nD. Dark Horse");
		player1Answer.add("A. Gandalf\nB. Bilbo\nC. Galadriel\nD. Frodo");
		player1Answer.add("A. Odin\nB. Thor\nC. Freya\nD. Loki");
		System.out.println(player1Answer.get(index));	}
	
	
	// Create an array that holds the correct answer of each question
	public String answers1(int index){
		ArrayList<String> correctAnswer1 = new ArrayList<String>();
		correctAnswer1.add("c");
		correctAnswer1.add("a");
		correctAnswer1.add("b");
		correctAnswer1.add("c");
		correctAnswer1.add("d");
		return correctAnswer1.get(index);	}
	
	
	// Create an array of questions for Player 2
	public void questions2(int index){
		ArrayList<String> player2Question = new ArrayList<String>();
		player2Question.add("Who played the 10th Doctor on Doctor Who?");
		player2Question.add("\nWhich character in Buffy the Vamire Slayer was a werewolf?");
		player2Question.add("\nWhich is Shakespeare's shortest play?");
		player2Question.add("\nIn which Avengers movie did Mavel superheroes defeat Thanos?");
		player2Question.add("\nThe following quote is spoken by which Dragon Ball Z character? 'You'll laugh at your fears when you find out who you are.'");
		System.out.println(player2Question.get(index));	}
	
	
	// Create an array to hold the possible answers for Player 2's questions
	public void options2(int index){
		ArrayList<String> player2Answer = new ArrayList<String>();
		player2Answer.add("A. David Tennant\nB. Benedict Cumberbatch\nC. Matt Smith\nD. Alan Rickman");
		player2Answer.add("A. Xander\nB. Spike\nC. Oz\nD. Willow");
		player2Answer.add("A. Hamlet\nB. The Comedy of Errors\nC. Much Ado About Nothing\nD. Henry IV");
		player2Answer.add("A. Endgame\nB. Avengers\nC. Age of Ultron\nD. Infinity War");
		player2Answer.add("A. Goku\nB. Vegeta\nC. Bulma\nD. Piccolo");
		System.out.println(player2Answer.get(index));	}
	
	
	// The correct answers for Player 2's questions
	public String answers2(int index){
		ArrayList<String> correctAnswer2 = new ArrayList<String>();
		correctAnswer2.add("a");
		correctAnswer2.add("c");
		correctAnswer2.add("b");
		correctAnswer2.add("a");
		correctAnswer2.add("d");
		return correctAnswer2.get(index);	}
	
	
	// Get the answer from the players
	// Player should input A, B, C, or D but any case should be allowed
	// Once the player has entered the answer to the current question,
	// the loop should break and begin again after the next question is displayed
	public String getAnswer(){
		
		Scanner keyboard = new Scanner(System.in);
		
		String usrAnswer="";
		
		System.out.print("Please enter your answer: ");
		usrAnswer = keyboard.nextLine();
		
		while(usrAnswer == "A" || usrAnswer == "a"|| usrAnswer == "B" || usrAnswer == "b" ||
				usrAnswer == "C" || usrAnswer == "c" || usrAnswer == "D" || usrAnswer == "d") {
			
			if (usrAnswer == "A" || usrAnswer == "a"|| usrAnswer == "B" || usrAnswer == "b" ||
					usrAnswer == "C" || usrAnswer == "c" || usrAnswer == "D" || usrAnswer == "d"){
				break;	} }
		
		return usrAnswer;		}

}
