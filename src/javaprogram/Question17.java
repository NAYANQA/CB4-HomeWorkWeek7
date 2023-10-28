package javaprogrammes;

/*
17. Write a Java Program using below steps.
17.1 Declare your city as instance variables.
17.2 Declare your country as static variables.
17.3 Declare one instance method and call static variable in print statement
17.4 Declare static method and call instance variable in print Statement.
17.5 Call both user defined methods into main method.
 */
public class Question17 {
    String city = "Uxbridge";
    static String country = "London";


    public static void main(String[] args) {
        insCty();
        Question17 incout = new Question17();
        incout.stCout();

    }

    public void stCout() {
        System.out.println(country);

    }

    public static void insCty() {
        Question17 cty = new Question17();

        System.out.println(cty.city);

    }

}
