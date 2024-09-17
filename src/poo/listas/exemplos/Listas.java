package poo.listas.exemplos;

import java.util.List;
import  java.util.ArrayList;
import java.util.stream.Collectors;

public class Listas {
    public static void main(String[] args) {

        // Cria uma lista do tipo String utilizando a implementação ArrayList
        List<String> lista = new ArrayList<>();

        // Adiciona elementos à lista
        lista.add("Maria");  // índice 0
        lista.add("Alex");   // índice 1
        lista.add("Bob");    // índice 2
        lista.add("Anna");   // índice 3
        // Adiciona o elemento "Marco" na posição 2 (movendo "Bob" e "Anna" para frente)
        lista.add(2, "Marco");  // lista será: [Maria, Alex, Marco, Bob, Anna]

        // Exibe o tamanho da lista (número de elementos)
        System.out.println(lista.size());  // 5

        // Itera sobre a lista e imprime cada elemento
        for (String x : lista) {
            System.out.println(x);
        }
        System.out.println("---------------------");

        // Remove todos os elementos cujo primeiro caractere seja 'M'
        lista.removeIf(x -> x.charAt(0) == 'M');  // Remove "Maria" e "Marco"z

        // Itera novamente e imprime a lista atualizada
        for (String x : lista) {
            System.out.println(x);
        }
        System.out.println("---------------------");

        // Busca o índice de "Bob" na lista e exibe
        System.out.println("Index of Bob: " + lista.indexOf("Bob"));  // 1

        // Busca o índice de "Marco" (que já foi removido) e exibe
        System.out.println("Index of Marco: " + lista.indexOf("Marco"));  // -1 (não encontrado)
        System.out.println("---------------------");

        // Filtra a lista para obter os elementos cujo primeiro caractere seja 'A'
        List<String> result = lista.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

        // Itera sobre a nova lista filtrada e imprime os elementos (que começam com 'A')
        for (String x : result) {
            System.out.println(x);
        }
        System.out.println("---------------------");

        // Tenta encontrar o primeiro nome que começa com 'J', ou retorna null se não existir
        String name = lista.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);

        // Exibe o nome encontrado ou "null" se não houver nome com 'J'
        System.out.println(name);  // null (pois não há nomes com 'J' na lista)
    }

}
