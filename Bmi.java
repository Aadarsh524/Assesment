
// student_firstname_surname :Arjun Thapa STUDENT_ID:21524045 Programming Coursework
// Task 2

import java.util.Scanner;
public class Bmi {
        public static void main(String[] args) {
            Scanner s  = new Scanner(System.in);
            System.out.print("Enter your weight in Kilogram:" );
            float weight = s.nextFloat();

            System.out.print("Enter your weight in Meter:" );
            float height = s.nextFloat();

            float BMI = weight /( height * height);
            System.out.println("Your bmi is "+ BMI );


            // Displaying health status according to BMI
            if(BMI < 18){
                System.out.println("And you are underweight");
            }
            if(BMI > 18 &&  BMI < 24){
                System.out.println("And you are healthy weight");
            }
            if(BMI > 24){
                System.out.println("And you are overweight");
            }

        }
}
