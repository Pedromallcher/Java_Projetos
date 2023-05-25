import java.util.Scanner;

///////////////////////////////////////////////////////////////////

public class App {
    public static void main (String [] args){
        Scanner Scanner = new Scanner(System.in);

        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

        System.out.println("N1 : ");
        int n1 = Scanner.nextInt();
        System.out.println("N2 : ");
        int n2 = Scanner.nextInt();


        System.out.println("1 -");
        System.out.println("2 -");
        System.out.println("3 -");
        System.out.println("4 -");
        System.out.println("Request : ");
        int option = Scanner.nextInt();

        int clc = 0;

        switch (option) {
            case 1:
                clc = n1 +n2;
                System.out.println(clc);
                
                break;
        
            default:
                break;
        }
                Scanner.close();
    
    }







}