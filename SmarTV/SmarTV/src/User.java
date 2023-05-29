public class User {
    public static void main (String [] args){
    App App = new App ();

    System.out.println("A tv esta ligada ? " + App.ligada );
    System.out.println("Qual o volume atual ? " + App.volume );
    System.out.println("Qual o canal atual ? " + App.canal );


    App.AumentarVolume();
    System.out.println(App.volume);


    }
}
