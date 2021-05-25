public class Methods {
    public static void main(String[] args) {
        //Calling method with 4 arguments
        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your Final Score was" + highScore);
        calculateScore(false, 10000, 8, 200);

        //calling challenge methods
        int position= calculatehighscoreposition(1000);
        displayhighscoreposition("sai",position);

        position= calculatehighscoreposition(100);
        displayhighscoreposition("sai Krishna",position);
    }

    //Creating a method
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {//passing the params
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        } else {
            return -1;
        }
    }
    //Challenge
    //Create a method call displayhighscoreposition
    //it should a players name as a aparameter and a 2nd parameter as a position in the hogh scoe table
    //you should display the players name along with a messge like "Managed to get into a position" and the
    //position they got and a further message "on the high score table"
    //Create a 2nd method called calculatedhighscoreposition
    //It should sent one argument onlt , the player score,
    //return data should be
    //1 if the score is >1000
    //2 if the score is >500 and <1000
    //3 if the score is >100 and <500
    //4 in all other cases
    //call both methods and display the results of the following
    //a score of 1500 , 900 , 400 , 50

    public static void displayhighscoreposition(String playername, int position) {
        System.out.println(playername + " Managed to Get into position " + position + " on the HIgh score table");
    }

    public static int calculatehighscoreposition(int playerScore) {
        if(playerScore>=1000){
            return 1;

        }
        else if(playerScore>=500 ){
            return 2;
        }
        else if(playerScore>=100 ){
            return 3;
        }
        else {
            return 4;
        }
    }

}
