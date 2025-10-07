import java.util.Scanner;
public class Qtres {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        int idade;
        double salario = 0;
        char sexo;
        char estadoCivil; 
          
       System.out.println("Digite seu nome: ");
       nome=sc.next();
       while (nome.length() <= 3){
        System.out.println("Nome inválido. Digite novamente! ");
        nome=sc.next();
       }
       System.out.println("Digite sua idade: ");
       idade=sc.nextInt();
       
       while(idade<0 || idade > 150){
       System.out.println("ERRO, digite novamente!");
        idade=sc.nextInt();
       }
       System.out.println("Digite seu salário: ");
       salario=sc.nextDouble();
       
       while (salario < 0) {
        System.out.println("ERRO, Digite novamente! ");
        salario=sc.nextDouble();
       }
       System.out.println("Sexo: ");
       sexo = sc.next().charAt(0);
       while (sexo!= 'f' && sexo!= 'm' ) {
        sexo=sc.next().charAt(0);
        System.out.println("ERRO, digite novamente! ");       
       }
       System.out.println("Digite seu estado civil (c,s,v,d): ");
       estadoCivil=sc.next().charAt(0);
       while (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil!= 'v' && estadoCivil!= 'd') {
        System.out.println("ERRO, digite novamente! ");
        estadoCivil=sc.next().charAt(0);
       }
       
       System.out.println("Nome: " + nome);
       System.out.println("Idade: " + idade);
       System.out.println("Salário: " + salario);
       System.out.println("Sexo: " + sexo);
       System.out.println("Estado cívil: " + estadoCivil);

    sc.close();
    }
}