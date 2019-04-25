package com.epam.nataliya_shchukina.lesson1.task3;

import java.util.Scanner;

public class Application {
    public void runApplication() {

        Scanner scanner = new Scanner(System.in);
        String inputString;
        calcProcessing calcprocessing = new calcProcessing();
        do {

            try {
                System.out.println("Enter the first value:");
                float value1 = Float.parseFloat(scanner.nextLine());
                System.out.println("Enter the required operation:");
                String operation = scanner.nextLine();
                System.out.println("Enter the second value:");
                float value2 = Float.parseFloat(scanner.nextLine());

                if ( operation.equals("/") & value2 == 0) {
                    throw new Exception("Division by zero is disallowed.");
                }

                float result = calcprocessing.GetResult(operation, value1, value2);
                String r1 = Float.toString(result);
                System.out.println("Result is = " +  r1);
            } catch (Exception ex) {
                System.out.println("An error occurred: " + ex.getMessage());
            }
            System.out.println("Would you like to perform another operation(y/n)?");
            inputString = scanner.nextLine();

        } while (inputString.equals("y"));
    }

}





