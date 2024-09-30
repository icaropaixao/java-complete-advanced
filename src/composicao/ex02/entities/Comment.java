package composicao.ex02.entities;

public class Comment {

    private String text;

    // construtor
    public Comment(){

    }
    public Comment(String text){
        this.text = text;
    }

    //gets sets
    public String getText(){
        return text;
    }
    public void setText(String text){
        this.text = text;
    }

}
