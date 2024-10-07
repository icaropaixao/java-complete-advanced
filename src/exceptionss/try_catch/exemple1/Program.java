package exceptionss.try_catch.exemple1;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        method1();

        System.out.println("End program");

    }
    //TRY CATCHS
        public static void method1(){

            System.out.println("*** METODO 1 start ***");
            method2();
            System.out.println("*** METODO 1 END ***");



        }
    public static void method2(){
        System.out.println("*** METODO 2 start ***");
        Scanner scan = new Scanner(System.in);

        // bloco que pode gerar erro
        try {
            String[] vect = scan.nextLine().split(" ");
            int position = scan.nextInt();
            System.out.println(vect[position]); // erro, colocando uma posição inexistente
        }

        // bloco para caso ocrroa o erro esperado
        catch (ArrayIndexOutOfBoundsException erro) { // nome do erro
            System.out.println("Invalid Position:(ArrayIndexOutOfBoundsException)");

            // mostra a sequencia de chamadas que deram erro
            erro.printStackTrace();

            scan.next();
        }
        catch (InputMismatchException erro) {
            System.out.println("Input Error :(InputMismatchException)");
        }
        System.out.println("*** METODO 2 END ***");

    }
}
