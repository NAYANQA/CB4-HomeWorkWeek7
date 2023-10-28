package string;

/*
6. Write a java program which replace a “I@love@java” to “we love java”
Expected output: We love java
 */
public class String06 {
    public static void main(String[] args) {


        String name = "I@love@java";
        System.out.println(name);
        String output1 = name.replaceAll("I","we");
        String output = output1.replaceAll("@", " ");
        System.out.println("Expected output: " + output);

    }
}