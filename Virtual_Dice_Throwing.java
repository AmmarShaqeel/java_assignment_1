import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.Math;

public class Virtual_Dice_Throwing {

    public int Virtual_Dice_Throwing()
      throws IllegalArgumentException, ArithmeticException {

        Scanner input = new Scanner(System.in);
		System.out.println("Please input the number of sides");
        int sides = input.nextInt();
		System.out.println("Please input the number of throws (should be a multiple of the number of sides!)");
        int times = input.nextInt();
        int numberOfTimes[] = new int[sides];

        if (times % sides != 0 || times == 0 ) {
          System.out.println("The number of sides should be a multiple of the dice Throws");
            return 1;
        }

        if (sides < 2) {
          System.out.println("The number of sides should be bigger or equal to 2");
            return 1;
        }

        else {
            for (int i=0; i<times; i++) {
                Random randGen = new Random();
                int diceThrow = randGen.nextInt(sides) + 1;
                System.out.println(diceThrow);
                numberOfTimes[diceThrow - 1] = numberOfTimes[diceThrow - 1] + 1;
            }

            System.out.println("The final array is:");
			System.out.print("[ ");
            for (int l=0; l<sides; l++) {
              System.out.print(numberOfTimes[l] + " ");
            }
			System.out.print("]");
			System.out.println("");
			
            for (int m=0; m<sides; m++) {
            System.out.println("\nSide " + (m+1) + " occured " + numberOfTimes[m] + " times");
            }

            System.out.println(" ");
            int sum=0;
            for (int k=0; k<sides; k++) {
              sum += numberOfTimes[k];
            }

            System.out.println("sum: " + sum);

            float average = sum / sides;
            System.out.println("average: " + average);

            double temp = 0;
            for (int j = 0; j < sides; j++) {
                temp += average - numberOfTimes[j];
                temp = Math.pow(temp, 2); //Math.pow returns a double so you have to assign it to temp
              }

            System.out.println("The variance of the array is: " + temp/(sides));
        }
        return 0;
    }
    public static void main(String[] args) {

      Virtual_Dice_Throwing dicethrow = new Virtual_Dice_Throwing();

      int flag = 1;

          while (flag == 1) {

            try {
              flag = dicethrow.Virtual_Dice_Throwing();
            }

            catch (ArithmeticException e) {
              System.err.printf("Exception: %s \n", e);
              System.err.printf("Numbers should be positive integers different than zero   \n");
            }

            catch (InputMismatchException e) {
              System.err.printf("Exception: %s \n", e);
              System.err.printf("Inputs should be integers \n");
            }

        }
      }
}
