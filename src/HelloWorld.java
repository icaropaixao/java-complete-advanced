
import java.util.Locale;
import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args){
        Product();

    }

    public static void Product(){
        String product1 = "Computer";
        String product2 = "Office desk";
        byte age = 30;
        int code = 5290;
        char gender = 'F';
        double preco1 = 2100.0;
        double preco2 = 650.50;
        double measure = 53.234567;

    System.out.println("Products:");
    System.out.printf("%s, which price is $ %.2f%n", product1, preco1);
    System.out.printf("%s, which price is $ %.2f%n", product2, preco2);
    System.out.println();
    System.out.printf("Record: %d years old, code %d and gender: %c%n", age, code, gender);
    System.out.println();
    System.out.printf("Measue with eight decimal places: %.8f%n", measure);
    System.out.printf("Rouded (three decimal places): %.3f%n", measure);
    Locale.setDefault(Locale.US);
    System.out.printf("US decimal point: %.3f%n", measure);
    }

    public static void Scanner(){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

    }
}



