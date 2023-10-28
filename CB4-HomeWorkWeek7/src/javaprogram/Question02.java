package javaprogrammes;

/*
2. Write a Java programme using the following steps.
2.1 Declare two static variables.
2.2 Declare one static method.
2.3 Call both static variables into the static method inside the print statement.
2.4 Declare the Main method.
2.5 Call the static method into the Main method and run the programme.
 */
public class Question02 {

    //Declare two static variables.
    static String name = "test";
    static String sur = "QA";

    // Declare the Main method.
    public static void main(String[] args) {
        //Call the static method into the Main method and run the programme.

        qau02();
    }

    //Declare one static method.
    public static void qau02() {
        //Call both static variables into the static method inside the print statement.
        System.out.println(name);
        System.out.println(sur);
    }
}
