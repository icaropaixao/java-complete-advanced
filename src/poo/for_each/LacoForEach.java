package poo.for_each;

public class LacoForEach {
    public static void main(String[] args) {

        String[] vect = new String[] {"joazinho", "maria" , "gabriel"};

        // sem for each
        for (int i = 0; i < vect.length; i++){
            System.out.println(vect[i]);
        }

        //  usando for each
        for (String obj : vect){
            System.out.println(obj);
        }
    }
}
