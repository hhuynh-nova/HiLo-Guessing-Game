//Hoa Huynh
//HiLo Project
//Guessing game

import java.util.Random;
import java.util.Scanner;

public class hhuynh_HiLo
{
   public static void main (String[] args)
   {
      Random gen = new Random();
      Scanner scan = new Scanner(System.in);
      
      int num;
      int guess;
      int value;
      
      guess = 0;
      value = 0;
      
      System.out.println("Welcome to the HiLo Guessing Game!");
      System.out.println("Your job is to guess the randomly generated number between 1 and 100.");
      System.out.println("The program will let you know if your guess is correct, too high or too low.");
      System.out.println("You can quit at any time or retry the game. Let's begin! \n");
      
      System.out.println("Please enter your guess or 404 if you would like to stop guessing and get a new number.");
      System.out.println("Entering 505 exits the game completely.");

      num = gen.nextInt(100) + 1;

      while(guess != 505)
         {  
            switch(guess)
            {
               case 404:
               {
                  System.out.println("\nThe number you were trying to guess was: " + num);
                  System.out.println("Please enter 505 to absolutely quit or enter a new guess to play again!");
                  
                  if(guess == 404)
                  {
                     num = gen.nextInt(100) + 1;
                     value = 0;
                  }
               }
               
               default:
               {
                  guess = scan.nextInt();

                  value++;
                  
                  if(num == guess)
                  {
                     System.out.println("\nCorrect!! The number you were guessing was " + num + "!");
                     System.out.println("It has taken you " + value + " guess(es) to correctly guess the number.");
                     System.out.println("Please enter your guess to play again or 404 if you would like to stop guessing.");
                     num = gen.nextInt(100) + 1;
                     value = 0;
                  }
                  
                  else if(guess < num && guess > 0)
                  {
                     System.out.println("\nYour guess is LOWER than the number that you were trying to find.");
                     System.out.println("Please enter your guess or 404 if you would like to stop guessing.");
                  }
                  
                  else if(guess > num && guess < 101)
                  {
                     System.out.println("\nYour guess is HIGHER than the number that you were trying to find.");
                     System.out.println("Please enter your guess or 404 if you would like to stop guessing.");
                  }
                  
                  else if((guess > 100 || guess <= 0) && guess != 404 && guess != 505)
                  {
                     System.out.println("\nPlease enter a proper guess or quit with 404.");
                  }
               }       //Ends default
            }          //Ends switch
         }             //Ends 505 while loop
      
      System.out.println("\nHave a nice day!");
   }
}