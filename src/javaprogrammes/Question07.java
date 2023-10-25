package javaprogrammes;
/*
7. Write a program to insert any temperature value in degree Fahrenheit and convert
to degree Celsius ((F − 32) × 5/9 = 0°C).
 */
public class Question07 {



    public static void main(String[] args) {
        double f = 98.6;

        // Convert Fahrenheit to Celsius
        double celsius = (f - 32) * 5 / 9;
        System.out.println("Temperature value in degree Fahrenheit and convert to degree Celsius ((F − 32) × 5/9 = "+celsius+"°C.");
    }


}


