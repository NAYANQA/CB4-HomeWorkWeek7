package string;

/*
5. Write a java program to concat 2 string.
Expected output: I love java I dream java
 */
public class String05 {

    public static void main(String[] args) {

        String name1 = "I love java";
        System.out.println(name1);
        String name2 = " I dream java";
        System.out.println(name2);

        String output = name1.concat(name2);
        System.out.println("Expected output: " + output);
    }
}
