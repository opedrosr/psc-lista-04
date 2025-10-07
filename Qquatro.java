public class Qquatro {
    public static void main(String[] args) {
        double popA = 80000;
        double popB = 200000;
        double taxaA = 0.03;  
        double taxaB = 0.015; 
        int anos = 0;

        while (popA < popB) {
            popA = popA + (popA * taxaA);
            popB = popB + (popB * taxaB);
            anos++;
        }

        System.out.println("Serão necessários " + anos + " anos para a população de A ultrapassar ou igualar B.");
        System.out.println("População final de A: " + (int)popA);
        System.out.println("População final de B: " + (int)popB);
    }
}
