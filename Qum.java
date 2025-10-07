import java.util.Scanner;
public class Qum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota;

        System.out.print("Digite sua nota, entre 0 e 10! ");
        nota =  sc.nextInt();

        while(nota < 0 || nota > 10 ){
            System.out.println("Nota invalida, digite novamente");
            nota = sc.nextInt();
        }
        if(nota <= 10){
            System.out.println("Sua nota foi " + nota);
        }


        sc.close();
    }
}