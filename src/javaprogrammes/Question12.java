package javaprogrammes;

/*
12. Write a Java program that takes three numbers as input to calculate and print the
average of the numbers.
 */
public class Question12 {
    public static void main(String[] args) {
       /* double a = 10;
        double b = 20;
        double c = 30;

        double avg = (a + b + c) / 3;

        System.out.println(avg);

*/
        Question12 avg = new Question12();
        avg.avrg(12, 20, 30);
    }

    public void avrg(double a, double b, double c) {

        System.out.println("Three value average is = " + (a + b + c) / 3);

    }
}
