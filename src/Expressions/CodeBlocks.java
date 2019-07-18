package Expressions;

public class CodeBlocks {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

      //  if (score < 5000 && score > 1000) {
      //      System.out.println("your score was less than 500 but greater than 1000");
     //   } else if (score < 1000) {
     //           System.out.println("Your score was less than 1000");
     //   } else {
      //      System.out.println("Got here");
      //  }

        if (gameOver == true ) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("your final score was " + finalScore);
        }

        boolean newGameOver = true;
        // Score set to 10000
        int secondScore = 10000;
        // levelcompleted set to 8
        int secondLevelCompleted = 8;
        // bonus set to 200
        int secondBonus = 200;
        // print out a second score on the screen with the following
        if (newGameOver) {
            int finalScore = secondScore + (secondLevelCompleted * secondBonus);
            System.out.println("Your second final score was " + finalScore);
        }


    }
}
