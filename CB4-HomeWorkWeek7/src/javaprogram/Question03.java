package javaprogrammes;

/*
3. Write a Java programme using the following steps.
3.1 Declare one instance and one static variable.
3.2 Declare one instance method.
3.3 Declare one static method.
3.4 Call both instance and static variables into both instance and static methods inside the
print statement.
3.5 Declare the Main method.
3.6 Call both instance and static methods into the Main method and run the programme.
 */

public class Question03 {
    //Declare one instance
    int a = 10;
    //Declare static variable.
    static String name = "Test";

    //Declare the Main method.
    public static void main(String[] args) {

        //Call both instance and static methods into the Main method and run the programme.
        Question03 qusmain = new Question03();
        qusmain.insQus03();
        staticQus03();
    }
    //Declare one instance method.

    public void insQus03() {
        //Call both instance and static variables into both instance and static methods inside the print statement.
        System.out.println(a);
        System.out.println(name);
    }

    // Declare one static method.
    public static void staticQus03() {
//Call both instance and static variables into both instance and static methods inside the print statement.
        Question03 qus = new Question03();
        System.out.println(qus.a);
        System.out.println(name);
    }
}
