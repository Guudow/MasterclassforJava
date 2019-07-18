package Variable;

public class Operators {

    public static void main(String[] args) {

        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;

        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result );

        previousResult = result;

        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;

        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;

        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;
        result = result + 1; // add value to result
        System.out.println("Result is now " + result);

        result++;
        System.out.println("Result is now " + result);

        result--;
        System.out.println("Result is now " + result);

        boolean isAlean = false;
        if (isAlean == false)
            System.out.println("It is not an alient!");

        int topScore = 80;
        if (topScore < 100)
            System.out.println("You got high score");

        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100))
            System.out.println("greater than top score and less then 100");

        if ((topScore > 90) || (secondTopScore <= 90))
            System.out.println("one of these tests is true");

        // 1. Create a double variable with the value 20
        double mydoublevalue = 20d;
        // 2. create second variable of type double with the value 80
        double mydouble = 80;
        // 3. add both numbers up and multiply by 25
        double myTotal = (mydoublevalue + mydouble) * 25;
        System.out.println("Mytotal = " + myTotal);
        // 4. Use the reminder operator to figure out the reminder from the sum of #3 divided by 40
        double TheReminder =  myTotal % 40;
        System.out.println("The reminder = " + TheReminder);
        if (TheReminder <= 20)
        System.out.println("Total was over the limit");





    }
}
