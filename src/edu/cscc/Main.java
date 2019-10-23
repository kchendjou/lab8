package edu.cscc;

import java.util.Scanner;

/**
 * author: KYRIA CHENDJOU, 9/17/2019, code that validate all users input
 */

public class Main {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double lbs = 0, inches, meters, kgs, bmi, weight, height;
        String classification;
        Scanner input = null;
        System.out.println("calculate BMI");
        lbs = inputWeight();
        inches = inputHeight();


        //method
        kgs = convertTOkgs(lbs);
        meters = convertTOMeters(inches);
        bmi = calcBMI(kgs, meters);
        classification = bmiClassification(bmi);
        //output
        System.out.println("Your bmi is " + bmi);
        System.out.println("your bmi classification is" + classification);
    }

    //conversion pound to kilograms
    public static double convertTOkgs(double lbs) {
        double kilograms;
        kilograms = lbs / 2.2046;
        return kilograms;
    }

    //conversion inches to meters
    public static double convertTOMeters(double inches) {
        double meters;
        meters = inches / 39.37;
        return meters;
    }

    //return bmi
    public static double calcBMI(double kilograms, double meters) {
        double bmi;
        bmi = kilograms / (Math.pow(meters, 2));
        return bmi;
    }

    //bmi classification
    public static String bmiClassification(double bmi) {
        String classification;
        if (bmi <= 18.5) {
            classification = "underweight";
        } else if (bmi <= 25.0) {
            classification = "normal";
        } else if (bmi <= 30.0) {
            classification = "overweight";
        } else {
            classification = "obese";
        }
        return classification;
    }

    /**
     * inputHeight
     * @return inches
     */
    //input height
    public static double inputHeight() {
        double inches=0;
        while(inches <=0) {
            try {
                System.out.println("calculate bmi(inches):");
                String avar = input.nextLine();
                inches = Double.parseDouble(avar);
            } catch (Exception e) {
                inches = -1;
            }
            if (inches <=0)
                System.out.println("Input is invalid, try again");
        }

        return inches;
    }

    /**
     * inputWeight
     * @return lbs
     */

    public static double inputWeight() {
        System.out.println("calculate bmi");
        double lbs = 0;
        while (lbs <= 0) {
            try {
                System.out.println("Enter weight(lbs):");
                String avar = input.nextLine();
                lbs = Double.parseDouble(avar);

            } catch (Exception e) {
                lbs = -1;
            }
            if (lbs <= 0)
                System.out.println("Input is invalid, try again");
        }

        return lbs;
    }


}







