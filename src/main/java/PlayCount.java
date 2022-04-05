import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class PlayCount {
    private static final Path playCounter = Paths.get(System.getProperty("user.dir") + "\\resources\\samples_data.txt");

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This is the play counter. This counts how many times Dragon Cave has been played through.");
        //Calling create file method
        createCounter();
        //Call file update method
        updateCounter();
        //Call read file method
        readCounter();
        //Call delete file method
        System.out.println("Do you want to delete the file? 1 for Y, 2 for N");
        int choice = scanner.nextInt();
        if (choice == 1){
            deleteCounter();
        }if (choice == 2){
            System.out.println("file intact.");
            System.exit(0);
        }

    }
    //Create file method
    public static void createCounter(){
        try{
            Files.createFile(playCounter);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    //File update method
    public static void updateCounter(){
        try{
            Files.writeString(playCounter, "Current playthrough count is at ?");
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    //Read file method
    public static void readCounter(){
    String temp;
        try{
            temp = Files.readString(playCounter);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    //Delete file method
    public static void deleteCounter() throws IOException{
        Files.delete(playCounter);
    }
}
