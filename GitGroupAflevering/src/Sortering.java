import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Sortering {


    private final String problemDescription = "Skriven metode, der indlæser 5 tekststrenge fra tastaturetog " +
            "udskriver dem på skærmen i alfabetisk faldende orden på skærmen.";

   public static void sortWords(){

       Scanner wordPrinter = new Scanner(System.in);

       ArrayList<String> listOfWords = new ArrayList<>();

       System.out.println("Write 5 words: ");
        // opretter loop til at prompte brugeren for 5 ord.
       for (int i = 0; i < 5; i++){
           listOfWords.add(i,wordPrinter.nextLine());
       }
        // sortere listen af ord.
       Collections.sort(listOfWords);
        // printer hvert enkelt ord.
       for(int i = 0; i < 5; i++){

           System.out.println(listOfWords.get(i));

       }

   }
   public String getProblemDescription(){

        return problemDescription;
   }

   public void printProblemDescription(){

       System.out.println(problemDescription);
   }


}
