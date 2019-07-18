package Variable;

public class FloatandD {

    public static void main(String[] args) {
        // width of int = 32 (4byte)
        int myValue = 5;
        // width of float = 32 (4byte)
        float myFloatvalue = 5f;
        // width of double = 64 (8 byte)
        double myDouble = 5d;
        System.out.println("myvalue = " + myValue);
        System.out.println("myFloatValue = " + myFloatvalue);
        System.out.println("mydouble = " + myDouble);

        // 1. create a variable to store the number of pounds
        double numPounds = 200;
        // 2. calculate the number of kilograms for the number above and store in a variable
        double convertdkg = numPounds * 0.45359237;
        // 3. print the result
        System.out.println("kilograms = " + convertdkg);




    }
}
