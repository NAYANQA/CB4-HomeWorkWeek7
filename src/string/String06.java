package string;
/*
6. Write a java program which replace a “I@love@java” to “we love java”
Expected output: We love java
 */
public class String06 {
    public static void main(String[] args) {


    String name = "I@love@java";
 String output = name.replace("I@love@","We love ");

        System.out.println("Expected output: "+output);

}
}