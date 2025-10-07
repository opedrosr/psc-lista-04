import java.util.Scanner;
public class Qoito {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double n1,n2,n3,n4,n5;
           
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

        System.out.println("Soma dos números: " + (n1 + n2 + n3 + n4 + n5));
        System.out.println("Média dos números: " + (n1 + n2 + n3 + n4 + n5)/5);

      
      
  sc.close();
  
    }
}
