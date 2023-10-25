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

    static String name = "test";
    static  String sur ="QA";

    public static void main(String[] args) {

        qau02();
    }

    public static void qau02(){
        System.out.println(name);
        System.out.println(sur);
    }
}
