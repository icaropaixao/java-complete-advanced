package exceptionss.try_catch.exemple1;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // bloco que pode gerar erro
        try {
            String[] vect = scan.nextLine().split(" ");
            int position = scan.nextInt();
            System.out.println(vect[position]); // erro, colocando uma posição inexistente
        }

        catch (ArrayIndexOutOfBoundsException erro) { // nome do erro
            System.out.println("Invalid Position:(ArrayIndexOutOfBoundsException)");
        }
        catch (InputMismatchException erro) {
            System.out.println("Input Error :(InputMismatchException)");
        }

        System.out.println("End program");






        scan.close();

    }
}
