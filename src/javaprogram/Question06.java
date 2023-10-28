package javaprogrammes;

/*
6. Write a program to enter any radius value of the circle and find out the area. (Formula
of Area A=PI*r*r).
 */
public class Question06 {
    public static void main(String[] args) {
        double radius = 0.5;
        double area = Math.PI * Math.pow(radius, 2);

        System.out.println(area);

    }
}
