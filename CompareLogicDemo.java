import java.util.Scanner;

public class CompareLogicDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("mosha = ");
        int mosha = scanner.nextInt();

        System.out.print("eshteNxenes (true/false) = ");
        boolean eshteNxenes = scanner.nextBoolean();


        boolean zbritjaLejohet = (mosha < 18) || eshteNxenes;


        boolean zbritjeShtese = (mosha < 12) && eshteNxenes;


        System.out.println("Zbritja lejohet: " + zbritjaLejohet);
        System.out.println("Zbritje shtesë 2 lek: " + zbritjeShtese);

        scanner.close();
    }
}
