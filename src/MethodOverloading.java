public class MethodOverloading {
    public static void main(String[] args){
        int newScore = calculateScore("Sai",100);
        System.out.println(newScore);
        //overloaded method
        int SecondScore=calculateScore(10);
        System.out.println(SecondScore);
        calculateScore();

    }
    public static int calculateScore(String PlayerName , int score){
        System.out.println("PlayerName "+PlayerName+" Scored "+score+ "points");
        return score*1000;
    }
    public static int calculateScore( int score){
        System.out.println("Unnamed player Scored "+score+ "points");
        return score*1000;
    }
    public static int calculateScore(){
        System.out.println("No Player name , No player Score");
        return 0;
    }

}
