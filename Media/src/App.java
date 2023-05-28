import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner Scanner = new Scanner (System.in);

        System.out.println("Bem-Vindo a Media");

        System.out.println("Digite a nota 1 :");
        int num1 = Scanner.nextInt();
        System.out.println("Digite a nota 2 :");
        int num2 = Scanner.nextInt();
        System.out.println("Digite a nota 3 :");
        int num3 = Scanner.nextInt();
        System.out.println("Digite a nota 4 :");
        int num4 = Scanner.nextInt();
        int opcao = Scanner.nextInt();

        int res = num1 + num2 + num3 + num4;

        if (res>70){
            System.out.print("Aprovado");
        }if (res>40 && res<=50){
            System.out.println("Recuperacao");
        } if (res <40){
            System.out.println("Reprovaded");
        }
    }
}
