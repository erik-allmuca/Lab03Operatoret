import java.util.Scanner;

public class TarifaDemo {
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


        double tarifaPasZbritjes = tarifaBaze;
        if (eshteNxenes) {
            tarifaPasZbritjes = tarifaBaze * 0.9; 
        }
        System.out.println("Pas zbritjes nxënësi (nëse aplikohet): " + tarifaPasZbritjes);


        double tarifaPasShteses = tarifaPasZbritjes;
        if (distanceKm > 10) {
            tarifaPasShteses = tarifaPasZbritjes * 1.05; 
        }
        System.out.println("Pas shtesës distancë (" + distanceKm + " km): " + tarifaPasShteses);


        double tarifaPasKuponit = tarifaPasShteses;
        if (ditePune >= 22 && !eshteNxenes) {
            tarifaPasKuponit = Math.max(tarifaPasShteses - 200, 0);
        }
        System.out.println("Pas kuponit besnikëri: " + (int) Math.round(tarifaPasKuponit));


        int totali = (int) Math.round(tarifaPasKuponit);
        System.out.println("Totali (lek): " + totali);

        scanner.close();
    }
}
