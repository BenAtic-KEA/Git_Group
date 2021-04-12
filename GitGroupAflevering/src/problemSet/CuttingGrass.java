package problemSet;
import java.util.Scanner;

public class CuttingGrass{

    private final String problemDescription = """
            Hvor tit skal græsset slås? Om sommeren vokser græsset ca. 0,8 cm om dagen. 
            Skriv en metode,der tager imod 2 inputparametre:
                1. Hvor langt græsset er lige nu.
                2. hvor højt det må være for at skulle slås.
                
            Metoden skal beregne og returnere hvor mange dage der er til,at græsset skal slås næste gang.
                
            Benyt en Scanner til at få input fra brugeren, og udskriv resultatet på skærmen.""";

    private final double GROWTH = 0.8d;
    private static final Scanner sc = new Scanner(System.in);

    // Computes the days left until minlength has been reached and outputs it, rounded down by typecasting to Integer.
    public int daysLeft (double currentLength, double maxLength ){
        return (int) ((maxLength-currentLength)/GROWTH);
    }

    public static void solution() {
        System.out.println("Input current grass length: ");
        double current = sc.nextDouble();
        sc.nextLine();
        System.out.println("Input max grass length: ");
        double max = sc.nextDouble();
        sc.nextLine();
        CuttingGrass cg = new CuttingGrass();
        System.out.println(cg.daysLeft(current, max));
    }

    public static void main(String[] args) {
        solution();
    }
}
