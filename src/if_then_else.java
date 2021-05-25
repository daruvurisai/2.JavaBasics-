public class if_then_else {
    public static void main(String[] args){
        boolean gameover=true;
        int score =800;
        int levelcompleted=5;
        int bonus =100;

        if(score<5000 && score>1000){
            System.out.println("Your score is less than 5000 but grater than 1000");
        }
        else if (score<1000){
            System.out.println("Your score was less than 1000");
        }
        else{
            System.out.println("Got Here");
        }




    }
}
