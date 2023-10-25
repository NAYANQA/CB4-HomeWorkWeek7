package string;
/*
3. Write a java program which replace a “I love java” to “we love java”
Expected output: We love java
 */
public class String03 {

    public static void main(String[] args) {
        String name = "I love java";
        System.out.println(name);
        String output = name.replace("I","we");
        System.out.println("Expected output: "+output);
    }
}
