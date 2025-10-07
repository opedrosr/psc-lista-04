import java.util.Scanner;

public class Qcinco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("População inicial do país A: ");
        double popA = sc.nextDouble();

        System.out.print("População inicial do país B: ");
        double popB = sc.nextDouble();

        System.out.print("Taxa de crescimento de A (%): ");
        double taxaA = sc.nextDouble() / 100; // converte para decimal

        System.out.print("Taxa de crescimento de B (%): ");
        double taxaB = sc.nextDouble() / 100; // converte para decimal

        int anos = 0;

        while (popA < popB) {
            popA += popA * taxaA;
            popB += popB * taxaB;
            anos++;
        }

        System.out.println("Serão necessários " + anos + " anos para A ultrapassar ou igualar B.");
        System.out.println("População final de A: " + (int)popA);
        System.out.println("População final de B: " + (int)popB);

        sc.close();
    }
}
