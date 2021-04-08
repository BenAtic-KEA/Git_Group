import java.util.ArrayList;
import problemSet.AbstractProblem;

public class Refresh_ArrayList extends AbstractProblem{
    public static void main(String[] args) {
        ArrayList<String> haystack = new ArrayList<>();
        haystack.add("needle1");

        System.out.println("Gennemsøg \"haystack\" for strengen \"needle1\".");
        System.out.println("Resultat: " + doesArrayListContainString(haystack, "needle1"));
        System.out.println("Gennemsøg \"haystack\" for strengen \"needle2\".");
        System.out.println("Resultat: " + doesArrayListContainString(haystack, "needle2"));

        System.out.println(haystack);
    }

    private final String problemDescription = "Skriv en metode med navnet doesArraylistContainString, der modtager 2 parametre:\n" +
            "en arrayliste og enstreng.\n" +
            "Metoden returnerer en boolean:\n" +
            "•Hvis strengen ikke findes i arraylisten indsættes strengen i listen og metoden returnerer false\n" +
            "•Hvis strengen findes i arraylisten returnerer metoden true og printer ”The String has been found\"";


    }

    public static boolean doesArrayListContainString(ArrayList<String> haystack, String needle) {
        if (haystack.contains(needle)) {
            System.out.println("The string has been found");
            return true;
        } else {
            System.out.println("The string has not been found and was added to the haystack.");
            haystack.add(needle);
            return false;
        }
    }

    @Override
    public void printProblemDescription() {
       // return QUOI
    }
}


//Skriv en metode med navnet doesArraylistContainString, der modtager 2 parametre:
// en arrayliste og enstreng.
// Metoden returnerer en boolean:
// •Hvis strengen ikke findes i arraylisten indsættes strengen i listen og metoden returnerer false
// •Hvis strengen findes i arraylisten returnerer metoden true og printer ”The String has been found"
