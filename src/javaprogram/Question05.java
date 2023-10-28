package javaprogrammes;

/*
5. Write a program for a calculator with addition, subtraction, multiplication, and division
methods all with parameters and use string concatenation methods. (Note: Two static
and Two instance methods.)
 */
public class Question05 {
    public static void main(String[] args) {

        addition(2, 3);
        subtraction(3, 1);
        Question05 cal = new Question05();
        cal.multiplication(2, 2);
        cal.division(10, 5);


    }

    public static void addition(int a, int b) {
        System.out.println("Addition of a+b=" + (a + b));
    }

    public static void subtraction(int a, int b) {

        System.out.println("Subtraction of a-b = " + (a - b));
    }

    public void multiplication(int a, int b) {

        System.out.println("Multiplication of a*b = " + (a * b));
    }

    public void division(int a, int b) {

        System.out.println("division of a/b = " + (a / b));
    }
}
