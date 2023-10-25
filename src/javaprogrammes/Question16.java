package javaprogrammes;

/*
16. Write a Java Program to print as below. (All details to be stored in variable)

"+------------------------+"
"|                        |"
"| CORNER STORE           |"
"|                        |"
"| 2015-03-29 04:38PM     |"
"|                        |"
"| Gallons: 10.870        |"
"| Price/gallon: $ 2.89   |"
"|                        |"
"| Fuel total: $ 22.71    |"
"|                        |"
"+------------------------+"
 */
public class Question16 {
    public static void main(String[] args) {
        cornerSore();
    }

    public static void cornerSore() {
        String storeName = "CORNER STORE ";
        int year = 2015;
        int month = 03;
        int date = 28;
        float hrs = 04f;
        float min = 38f;
        double gallons = 10.870d;
        double price = 2.89d;
        double total = 22.71d;
        System.out.println("+-------------------------+");
        System.out.println("|                         |");
        System.out.println("|      " + storeName + "      |");
        System.out.println("|                         |");
        System.out.println("| " + year + "_" + month + "_" + date + " " + hrs + ":" + min + "PM" + "    |");
        System.out.println("|                         |");
        System.out.println("| Gallons: " + gallons + "          |");
        System.out.println("| Price/gallon: $ " + price + "    |");
        System.out.println("|                         |");
        System.out.println("| Fuel total: $ " + price + "      |");
        System.out.println("|                         |");
        System.out.println("+-------------------------+");


    }
}
