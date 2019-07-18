package Expressions;

public class statements {
    public static void main(String[] args) {
        int myVariables = 50;
        myVariables++;
        myVariables--;
        System.out.println("This is a test");

        System.out.println("this is " + "Another " + "still more. ");

        boolean condition = true;
        if (condition) { // begin block 1
            System.out.println("Condition is true.");
        } // end block one
        else { // begin block 2
            System.out.println("Condition is false.");
        } // end block 2
    }
}
