package javaprogrammes;

/*
11. Write a Java program to compute the specified expressions and print the output.
Test Data:
((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
Expected Output: 2.138888888888889
 */
public class Question11 {
    public static void main(String[] args) {

        output(25.5f,3.5f,40.5f,4.5f);
    /*    float a = 25.5f;
        float b = 3.5f;
        float c = 40.5f;
        float d = 4.5f;
        float output = ((a * b - b * b) / (c - d));

        System.out.println("Expected Output: " + output);

*/
    }
    public static void output(float a , float b, float c, float d){
        System.out.println("Expected Output: " +((a * b - b * b) / (c - d)));
    }
}
