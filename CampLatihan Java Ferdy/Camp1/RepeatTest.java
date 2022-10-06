import java.util.Scanner;

public class RepeatTest {
    private Random num = new Random();       
    private int answer = num.nextInt(10);   
    private int guess;  
    private String playAgain;  

    public void inputGuess(){
        System.out.println("Enter a number between 1 and 10 as your first guess: ");
        Scanner input = new Scanner(System.in);
        guess = input.nextInt(); 
        do{
        if (guess < 1 || guess > 10){
            System.out.println("That is not a valid entry. Please try again: ");
            guess = input.nextInt();
        }else if (guess > answer){
            System.out.println("Too high, Try Again: ");
            guess = input.nextInt();
        }else if (guess < answer){
            System.out.println("Too low, Try Again: ");
            guess = input.nextInt();
        }

        }while (guess != answer);

        System.out.println("Congratulations, You guessed the number!");
        System.out.println("Would you like to play again? Enter Y to play or any other key to quit: ");
        playAgain = input.nextLine();
        if(playAgain == "Y" || playAgain == "y"){
            System.out.println("Enter a number between 1 and 10 as your first guess: ");
            guess = input.nextInt(); 
        }

    }
}