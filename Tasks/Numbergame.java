import java.util.Random;
import java.util.Scanner;

public class Numbergame {

public void game(){
Scanner scan = new Scanner (System.in);
Random random = new Random();
// maximum number to guess
int maxNumber = 100; 
 // maximum number of attempts
int maxAttempts = 5;

System.out.println("Welcome to the Number Guessing Game!");
System.out.println();
int totalScore = 0;
boolean playAgain = true;

while(playAgain){
int randomNumber = random.nextInt(maxNumber) + 1;
System.out.println("Guess the number between 0 to 100");

int attempts = 0;
boolean guessedCorrectly = false;

while(attempts < maxAttempts){
System.out.println("Attempt " + (attempts + 1) + ": Enter your guess: ");
int userGuess = scan.nextInt();

if(userGuess == randomNumber){
System.out.println("Congratulations! You guessed the number " +randomNumber+ " in " +(attempts + 1)+ " attempts.");
guessedCorrectly = true;
break;
}
else if (userGuess < randomNumber){
System.out.println(" Try Again! The number is bigger.");
}
else{
System.out.println(" Try Again! The number is smaller.");
} 
attempts++;
}
if(!guessedCorrectly){
System.out.println("Sorry, you couldn't guess the number. The number was " + randomNumber + ".");
}
totalScore += maxAttempts - attempts;
System.out.println("Do you want to play again? (yes/no): ");
String playAgainInput = scan.next();
playAgain = playAgainInput.equalsIgnoreCase("yes");
}
System.out.println("Thanks for playing! Your total score out of 5 is: " + totalScore);
scan.close();
}
public static void main(String[] args) {
Numbergame nb = new Numbergame();
nb.game();
}
}