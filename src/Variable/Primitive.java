package Variable;

public class Primitive {
    public static void main(String[] args) {

        byte bytVelue = 10;
        short shortValue = 20;
        int intValue = 50;

        long longtotal = 5000 + 10 * (bytVelue + shortValue + intValue);
        short shortTotal = (short) (1000 + 100 * (bytVelue + shortValue + intValue));
        System.out.println("longtotal = " + longtotal );
        System.out.println("shortTotal = " + shortTotal);



    }
}
