package string;
/*
2. Write a java program which remove extra space from both side “ I love
java ”
Expected output: “I love java”
 */
public class String02 {
    public static void main(String[] args) {
        String name = " I love java ";
        System.out.println(name);
        String output = name.trim();
        System.out.println("Expected output: "+output);
    }
}
