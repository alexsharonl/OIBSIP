import java.util.*;

class guessTheNumber{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int generated_number = (int)(Math.random()*100); 
        
        int guess;
        int attempt=1; 
        int repeat=1;

        do{
            System.out.print("\nHello! Computer have generated a random number between 1 to 100.\n");
            System.out.print("\nGuess the number : ");
           
            guess = sc.nextInt();

            if(guess == generated_number){
                System.out.println("\nSuperb!..You guess the right number.");
                System.out.print("You have guess the number in " + attempt);
                
                if(attempt==1)
                    System.out.println(" attempt..\n");
                else
                    System.out.println(" attempts..\n");

                attempt = 1;
                System.out.print("Do you want to play again(1/0) : ");
                
                repeat = sc.nextInt();
                generated_number = (int)(Math.random()*100);

                System.out.println();
            }
            
            else if(guess > generated_number && guess < (generated_number+5))
                System.out.println("Close! Your number is large.\n");
            
            else if(guess < generated_number && guess > (generated_number-5))
                System.out.println("CLose! Your number is small.\n");

            else if(guess > generated_number)
                System.out.println("Your number is too large.\n");

            else
                System.out.println("Your number is too small.\n");

            attempt++;

        }while(repeat != 0);

        System.out.println("Thank you for playing!\n");
        sc.close();
    }
}