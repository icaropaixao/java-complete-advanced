package introducao.funcoes;

public class FuncoesMatematicas {

    public static void main(String[] args) {

        // Math.sqrt = RAIZ QUADRADA
        // Math.pow = FAZ POTENCIAÇÃO (elevado ao quadrado)
        // Math.abs = PEGA O VALOR ABSOLUTO (se for negativo fica positivo)

        int A;
        A = (int) Math.sqrt(15); // Variável A recebe a raiz quadrada do numero em parenteses
        System.out.println(A);

        A =  (int) Math.pow(5, 5); // Variável A recebe o resultado de 2 elevado a 2
        System.out.println(A);

        A = Math.abs(10); // Variável A recebe o valor absoluto de x
        System.out.println(A);



    }

}
