import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
     gameRun();
     replay();
    }
    public static void gameRun(){
            System.out.println("Welcome to Dragon Cave\n" +
                        "You are in a land full of dragons. In front of you, you see two caves.\n" +
                        "In one cave, the dragon is friendly and will share his treasure with you.\n" +
                        "The other dragon is greedy and hungry and will eat you on site.\n" +
                        "Which cave will you go into? 1 or 2?");
            Scanner scanner = new Scanner(System.in);
                int choice = scanner.nextInt();
                if (choice == 1) {
                    System.out.println("You approach the cave...\n" +
                            "It is dark and spooky...\n" +
                            "A large dragon jumps out in one front of you! He opens his jaws and...\n" +
                            "Gobbles you down in one bite!");
                } else if (choice == 2) {
                    System.out.println("You approach the cave...\n" +
                            "It is dark and spooky...\n" +
                            "A large dragon jumps out in one front of you! He opens his jaws and...\n" +
                            "Welcomes you to his treasure hoard!");
                }
            }
        public static void replay(){
        int count  = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to play again? 1 for Y or 2 for N");
        int retry = scanner.nextInt();
        while (count > 0) {
            if (retry == 1) {
                count++;
                gameRun();
            }
            if (retry == 2) ;
            System.out.println("Thanks for playing!");
            System.exit(0);
        }
        }
    }
