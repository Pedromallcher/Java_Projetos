import java.util.Scanner;

public class App {
    public static void main (String [] args){
        Scanner Scanner = new Scanner(System.in);

        System.out.println("Bem-Vindo a calculadora");

        System.out.println("Digite o valor 1");
        int num1 = Scanner.nextInt();

        System.out.println("Digite o valor 2");
        int num2 = Scanner.nextInt();


        System.out.println("1 - Adicao");
        System.out.println("2 - Subtracao");
        System.out.println("3 - Multiplicacao");
        System.out.println("4 - Divisao");
        System.out.print("Digite aqui a sua escolha -> ");
        int opcao = Scanner.nextInt();
        

        int resultado = 0;

        switch (opcao) {
            case 1:
                resultado = num1 + num2;
                System.out.println(resultado);
            break;

            case 2:
                resultado = num1 - num2;
                System.out.println(resultado);
            break;

            case 3:
                resultado = num1 * num2;
                System.out.println(resultado);
            break;

            case 4:
            if (num2!= 0){
                resultado = num1/num2;
                System.out.println(resultado);
            } else {
                System.out.println("Nao e possivel dividir por 0");
            }break;
            
        
            default:
            System.out.println("Nao temos essa opcao em nosso bancos de dados");

                break;
        }
        Scanner.close();
    }
}
