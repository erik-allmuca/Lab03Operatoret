import java.util.Scanner;

public class TarifaEpsilonDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("tarifaTeorike = ");
        double tarifaTeorike = scanner.nextDouble();

        System.out.print("tarifaLlogaritur = ");
        double tarifaLlogaritur = scanner.nextDouble();

        final double EPS = 0.0001;


        boolean baraziSakte = (tarifaTeorike == tarifaLlogaritur);


        boolean baraziPerafert = Math.abs(tarifaTeorike - tarifaLlogaritur) < EPS;


        System.out.println("Barazi e saktë (==): " + baraziSakte);
        System.out.println("Barazi e përafërt (epsilon): " + baraziPerafert);

        scanner.close();
    }
}
