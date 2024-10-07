package exceptionss.try_catch.bloco_finally;

import  java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {


        // O BLOCO FINALLY EXECUTA MESMO SE DER ERRO OU NÃO
        //EXEMPLO
        
        Scanner sc = null;

        File file = new File("C:/excemplo");

        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }
        catch (FileNotFoundException erro){
            System.out.println("ERRORR " + erro.getMessage());
        }
        finally {
            System.out.println("Bloco finally");
            if (sc != null) {
                sc.close();
            }

        }
    }
}
