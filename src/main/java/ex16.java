/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Nicholas Viggiani
 */
import java.util.Scanner;

public class ex16 {

    public static void main(String[] args) {

        final double MALE_R = 0.73;
        final double FEMALE_R = 0.66;
        final double LEGAL_LIMIT = 0.08;

        Scanner input = new Scanner(System.in);
        //boolean stringChecker=true;

        System.out.print("Enter total alcohol consumed in (oz): ");
        String check = input.nextLine();

        while (!isNum(check)) {
            System.out.print("enter a valid numerical value: ");
            check = input.nextLine();
        }

        int consumedAlcohol = Integer.parseInt(check);

        System.out.print("Enter your body weight in pounds (lbs): ");
        check = input.nextLine();

        while (!isNum(check)) {
            System.out.print("enter a valid numerical value: ");
            check = input.nextLine();
        }

        int bodyWeight = Integer.parseInt(check);

        System.out.print("Enter number of hours since the last drink: ");
        check = input.nextLine();

        while (!isNum(check)) {
            System.out.print("enter a valid numerical value: ");
            check = input.nextLine();
        }

        int numHours = Integer.parseInt(check);


        System.out.print("Enter your gender (M or F): ");
        check = input.nextLine();


        double ratio= check.toUpperCase().equals("M") ? MALE_R : FEMALE_R;


        double BAC = ( ((consumedAlcohol * 5.14) / (bodyWeight*ratio))- (0.015*numHours));
        BAC = (double) Math. round(BAC * 100) / 100;

        System.out.println("Your BAC is "+ BAC);

        System.out.println( (BAC>=LEGAL_LIMIT) ? "It is not legal for you to drive." : "You can drive!");




    }


    public static boolean isNum(String numTest) {
        if (numTest == null) {
            return false;
        }
        try {
            int d = Integer.parseInt(numTest);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
