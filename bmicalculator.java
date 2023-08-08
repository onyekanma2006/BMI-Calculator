package com.henry;

import java.util.Scanner;

public class bmicalculator {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        double bmi, height, weight;

        System.out.print("PLEASE ENTER THE WEIGHT NUMBER HERE: ");
        weight = scanner.nextDouble();

        System.out.print("PLEASE ENTER THE HEIGHT NUMBER HERE: ");
        height = scanner.nextDouble();

        bmi = weight / (height * height);

        if (bmi <= 18.5) {
            System.out.println("YOUR BMI RESULT IS " + bmi + " AND YOU ARE UNDER WEIGHT:");
        } else if (bmi <= 24.5)
            System.out.println("YOUR BMI RESULT IS " + bmi + " AND YOU ARE HEALTHY, KEEP IT UP:");
        else
            System.out.println("YOUR BMI RESULT IS " + bmi + " AND YOU ARE OVER WEIGHT: ");
    }
}