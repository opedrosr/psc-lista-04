import java.util.Scanner;
public class Qdois {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome, senha;

        System.out.println("Digite seu nome: ");
        nome = sc.next();
        System.out.println("Digite sua senha: ");
        senha = sc.next();

        while(nome.equals(senha)){
            System.out.println("Nome ou senha inválido! Digite novamente... ");
            System.out.print("Nome: ");
            nome = sc.next();
            System.out.print("Senha: ");
            senha = sc.next();
        } 
            System.out.println("Seja bem-vindo(a)!");

        sc.close();
    }
}