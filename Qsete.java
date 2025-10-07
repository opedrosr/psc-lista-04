import java.util.Scanner;
public class Qsete {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1, n2, n3, n4, n5;
        double maior;

        System.out.println("Digite o primeiro numero: ");
        n1=sc.nextDouble();
        System.out.println("Digite o segundo numero: ");
        n2=sc.nextDouble();
        System.out.println("Digite o terceiro numero: ");
        n3=sc.nextDouble();
        System.out.println("Digite o quarto numero: ");
        n4=sc.nextDouble();
        System.out.println("Digite o quinto numero: ");
        n5=sc.nextDouble();

        maior = n1;
        
        if (n2 > n3) maior = n2;
        if (n3 > n4) maior = n3;
        if (n4 > n5) maior = n4;
        if (n5 > n4) maior = n5;

       System.out.println("Maior numero é: " + maior ); 

        sc.close();
    }
}