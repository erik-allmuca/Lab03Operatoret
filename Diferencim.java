import java.util.Scanner;

public class TarifaAvancuar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("ditePune = ");
        int ditePune = scanner.nextInt();

        System.out.print("cmimDitor = ");
        double cmimDitor = scanner.nextDouble();

        System.out.print("eshteNxenes (true/false) = ");
        boolean eshteNxenes = scanner.nextBoolean();

        System.out.print("distanceKm = ");
        int distanceKm = scanner.nextInt();


        double tarifaBaze = ditePune * cmimDitor;
        System.out.println("Tarifa bazë: " + tarifaBaze);


        double tarifaPasZbritjes = eshteNxenes ? tarifaBaze * 0.9 : tarifaBaze;
        System.out.println("Pas zbritjes nxënësi (nëse aplikohet): " + tarifaPasZbritjes);


        double tarifaPasShteses = distanceKm > 10 ? tarifaPasZbritjes * 1.05 : tarifaPasZbritjes; 
        System.out.println("Pas shtesës distancë (" + distanceKm + " km): " + tarifaPasShteses);


        double tarifaPasBonusit;
        if (ditePune > 24 || distanceKm > 25) {
            tarifaPasBonusit = tarifaPasShteses * 0.97; 
        } else {
            tarifaPasBonusit = tarifaPasShteses;
        }
        System.out.println("Pas bonusit orar: " + tarifaPasBonusit);


        double tarifaPasKuponit = (ditePune >= 22 && !eshteNxenes) ? Math.max(tarifaPasBonusit - 200, 0) : tarifaPasBonusit;
        System.out.println("Pas kuponit besnikëri: " + tarifaPasKuponit);


        double tarifaFinale = Math.max(tarifaPasKuponit, 1500);
        System.out.println("Pas plafonit minimal (1500 lek): " + tarifaFinale);


        int totali = (int) Math.round(tarifaFinale);
        System.out.println("Totali (lek): " + totali);


        System.out.println("\nShembull dallimi midis || dhe &&:");

        int a = 5;

        boolean resultOr = (a < 10) || (++a > 10);
        System.out.println("Pas 'resultOr', a = " + a + " (|| shkurt-circuit)");

        a = 5;

        boolean resultAnd = (a > 10) && (++a > 5);
        System.out.println("Pas 'resultAnd', a = " + a + " (&& shkurt-circuit)");

        scanner.close();
    }
}
