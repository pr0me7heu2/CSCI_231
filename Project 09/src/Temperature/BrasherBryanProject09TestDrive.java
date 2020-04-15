package Temperature;

import java.util.Scanner;

public class BrasherBryanProject09TestDrive {
    public static void main(String[] args) {

        //create scanner object
        Scanner input = new Scanner(System.in);

        //test Temperature() and setDegree(double degree, char scale)
        System.out.println("===Temperature 01===");
        Temperature temp01 = new Temperature();
        System.out.println(temp01.toString());
        System.out.println("User sets degree and scale (enter an integer followed by a space followed by C or F)");
        temp01.setDegree(input.nextInt(),input.next().charAt(0));
        System.out.println(temp01.toString());

        //test Temperature(char scale) and setDegree(char scale) and setDegree(double degree)
        System.out.println("===Temperature 02===");
        Temperature temp02 = new Temperature('F');
        System.out.println(temp02.toString());
        System.out.println("User sets degree:");
        temp02.setDegree(input.nextInt());
        System.out.println("User sets scale (C/F):");
        temp02.setDegree(input.next().charAt(0));
        System.out.println(temp02.toString());

        //test Temperature(double degree)
        System.out.println("===Temperature 03===");
        Temperature temp03 = new Temperature(100);
        System.out.println(temp03.toString());
        System.out.println("User sets degree and scale (enter an integer followed by a space followed by C or F)");
        temp03.setDegree(input.nextInt(),input.next().charAt(0));
        System.out.println(temp03.toString());

        //test Temperature(double degree, char scale)
        System.out.println("===Temperature 04===");
        Temperature temp04 = new Temperature(-459.67,'F');
        System.out.println(temp04.toString());
        System.out.println("User sets degree and scale (enter an integer followed by a space followed by C or F)");
        temp04.setDegree(input.nextInt(),input.next().charAt(0));
        System.out.println(temp04.toString());


        //creates array of all test temperatures for comparison in double for loop
        Temperature[] temperatures = {temp01,temp02,temp03,temp04};

        //loops through temperatures and compares to every temperature that follows
        //end result that every temp0n is compared to every other
        for (int i = 0; i < temperatures.length ; i++) {
            for (int j = i + 1; j < temperatures.length; j++) {
                System.out.println("Temp " + (i+1) + " is equal to Temp " + (j+1) +": "
                        + temperatures[i].equals(temperatures[j]));
                System.out.println("Temp " + (i+1) + " is less than Temp " + (j+1) +": "
                        + temperatures[i].isLessThan(temperatures[j]));
                System.out.println("Temp " + (i+1) + " is greater than Temp " + (j+1) +": "
                        + temperatures[i].isGreaterThan(temperatures[j]));
            }
            System.out.println();
        }

    }
}
