package string;

/*
1. Write a Java program print your full name on screen and then print your
surname on a separate line.
 */
public class String01 {

    public static void main(String[] args) {


        String name = "Nayan Patel";
        System.out.println(name);
        String output = name.substring(6);

        System.out.println(output);

    }
}