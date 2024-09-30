package composicao.ex02.application;

import composicao.ex02.entities.Comment;
import composicao.ex02.entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment ("Faça uma boa viagem!");
        Comment c2 = new Comment("Uau, isso é incrivel!");

        Post p1 = new Post(
                sdf.parse("21/06/2018 13:05:44"),
                " *FOTO* Viajando para Suiça",
                "Vou visitar este país maravilhoso",
                12);

        p1.addComment(c1);
        p1.addComment(c2);

        System.out.println(p1);


    }

}
