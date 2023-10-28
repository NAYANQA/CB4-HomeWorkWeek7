package javaprogram;

/*
20. Write a Java Program using below steps.
20.1 Declare your Spain as static variable.
20.2 Declare your United Kingdom as instance variable.
20.3 Declare instance method name homeCountry()and call static variable.
20.4 Declare static method name holidays() and call instance variable
20.5 Call both methods in main method.
 */
public class Question20 {
    static String city = "Spain";
    String country = "United Kingdom";

    public static void main(String[] args) {

        Question20 hcountry = new Question20();
        hcountry.homeCountry();
        holidays();

    }

    public void homeCountry() {
        System.out.println(city);
    }

    public static void holidays() {
        Question20 hoday = new Question20();
        System.out.println(hoday.country);
    }

}
