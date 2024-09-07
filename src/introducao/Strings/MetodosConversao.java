package introducao.Strings;

public class MetodosConversao {

    public static void main(String[] args) {

        String letras = " ABC abc Abc";

        String letrasMinusculas = letras.toLowerCase(); // tranformando tudo em minusculo
        String letrasMaiusculas = letras.toUpperCase();// tranformando tudo em maiusculoas
        String letrasSemEspaco = letras.trim();// elimina espaços em branco
        String pegarLetras = letras.substring(2); // pega as letras apartir do indice escolhido
        String pegarLetras2 = letras.substring(2,3); // pega as letras apartir do indice escolhido ate o final escolhido
        String letrasReplace = letras.replace("a","i"); // troca o caracter escolhido por um novo
        String letrasReplace2 = letras.replace("Abc","Iip");

        System.out.println("Original: " +letras);
        System.out.println("LowerCase: " +letrasMinusculas);
        System.out.println("UperCase: " +letrasMaiusculas);
        System.out.println("TRIM: " +letrasSemEspaco);
        System.out.println("SubString: " +pegarLetras);
        System.out.println("SubString2: " +pegarLetras2);
        System.out.println("Replace: " +letrasReplace);
        System.out.println("Replace: " +letrasReplace2);

    }

}
