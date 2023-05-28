import java.util.Scanner;

public class App{
    public static void main (String [] args){
    Scanner Scanner = new Scanner(System.in);


    System.out.println("Bem-Vindo a minha Aplicacao");


    System.out.println("Qual a distancia ate o seu destino ? ");
    Double Destino = Scanner.nextDouble();
    System.out.println("Qual km o seu carro faz por litro ? ");
    double KmporLitro = Scanner.nextDouble();
    System.out.println("Qual o preco atual da gasolina ? ");
    Double Gasolina = Scanner.nextDouble();

    

    double ValorFinal = (Destino / KmporLitro) * Gasolina;
    //System.out.println(ValorFinal);


    String msg = """
            A distancia que ira percorrer e: %f
            Seu carro far por km: %f litros
            O valor atual da gasolina e % f: 

            O valor final dessa Vigem vai ser de: %f

            """.formatted(Destino,KmporLitro , Gasolina , ValorFinal);
            System.out.print(msg);








    }      
}