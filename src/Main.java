import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        int[] intArray = new int[]{ 0,1,2,3,4,5,6,7,8,9,10 };

        for (int i = 0; i < intArray.length; i++) {
            if(intArray[i] % 2 == 1) {
                System.out.println(intArray[i] + " is an uneven number");
            } else {
                System.out.println(intArray[i] + " is an even number");
            }
        }
    }

}
