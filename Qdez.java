import java.util.Scanner;

public class Qdez {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n1, n2;
        System.out.println("Digite o primeiro número: ");
        n1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        n2 = sc.nextInt();

        if (n1 < n2) {
            for (int i = n1 + 1; i < n2; i++) {
                System.out.println(i);
            }
        } else if (n1 > n2) {
            for (int i = n2 + 1; i < n1; i++) {
                System.out.println(i);
            }
        } else {
            System.out.println("Os números são iguais!");
        }

        sc.close();
    }
}
