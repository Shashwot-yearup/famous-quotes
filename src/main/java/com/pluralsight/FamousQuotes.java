package com.pluralsight;

import java.util.ArrayList;

import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {

        boolean appRunning = true;

        while (appRunning) {
            try {

                //create a scanner wo we can ask questions
                Scanner input = new Scanner(System.in);

                //create an array of names
                ArrayList<String> quotes = new ArrayList<>();// created a list.

                //10 famous quotes
                quotes.add("The only thing we have to fear is fear itself.");
                quotes.add("I think, therefore I am.");
                quotes.add("To be, or not to be, that is the question.");
                quotes.add("In the middle of difficulty lies opportunity.");
                quotes.add("It always seems impossible until it's done.");
                quotes.add("The unexamined life is not worth living.");
                quotes.add("Genius is one percent inspiration and ninety-nine percent perspiration.");
                quotes.add("Stay hungry, stay foolish.");
                quotes.add("That which does not kill us makes us stronger.");
                quotes.add("Nothing will work unless you do.");


                System.out.print("Please pick a number from (#1 to #10) for a famous quote.(0) to exit");
                int index = input.nextInt();

                //this way if they pick 1 it really starts at 0
                --index;

                //turn off the loop
                if (index < 0) {
                    appRunning = false;
                }

                System.out.println("You selected the quote: " + quotes.get(index));
                System.out.println("");

                System.out.println("Do you want to see more then one quotes? (yes/no)"); //asked the user if they want to see more then one quote.
                String name = input.nextLine();

                if (name.equalsIgnoreCase("no"))
                    appRunning = false;

            } catch (Exception e) {

                //log the error to some reporting system or email the developer

                //maybe print out a shorter version of the error
                System.out.println(e.getMessage());

                //here's where we diced what to do if all went wrong
                //maybe display a friendly message
                System.out.println("Sorry that number was invalid");

            }
        }
    }
}
