import java.util.Scanner;

public class Movie {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String exit = "";
        String movies = "";
        int counter = 0;

        while (!exit.equalsIgnoreCase("quit")) {

            System.out.print("enter movie title:");
            movies = keyboard.nextLine();

            if (movies.equalsIgnoreCase("quit"))
                exit = "quit";
            else {
                System.out.println("title of your movie:" + movies);
                counter++;
            }
        }

        System.out.println("you entered " + counter + " movies:");


    }
}


