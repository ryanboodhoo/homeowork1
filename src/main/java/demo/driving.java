package demo;

import java.util.Scanner;

public class driving {
    public static void main(String[] args) {
        //while vs for loop
        //write a method that keeps scanning or asking a user a question such as are we there yet?
        //when the use says yes..then quit the program
        Scanner scanner = new Scanner(System.in);
        int x = 0;

        while (x <= 5) {
            System.out.println("Are we there yet yes or no?");
            String answer = scanner.nextLine();  // Read user input

            if (answer.equalsIgnoreCase("no")) {
                x++;
            } else if (answer.equalsIgnoreCase("yes")){
                //what i want to do if the answer is no
                System.out.println("Yes we have arrived");
                break;
            } else if (answer.equalsIgnoreCase("quit")){
                break;
            } else {
                System.out.println("Please select valid input");
            }
        }
    }
}

