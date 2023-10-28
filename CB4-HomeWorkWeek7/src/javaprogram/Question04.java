package javaprogrammes;

/*
4. Write a Java programme using the following steps.
4.1 Declare two instance and two static variables.
4.2 Declare one instance method.
4.3 Declare one static method.
4.4 Call all four instance and static variables into both instance and static methods inside the
print statement.
4.5 Declare the Main method.
4.6 Call both instance and static methods into the Main method and run the programme.
 */
public class Question04 {
    //Declare two instance variables.
    int a = 10;
    int b = 20;
    //Declare two static variables.
    static String name = "Test";
    static String sur = "QA";

    //Declare the Main method.
    public static void main(String[] args) {
        //Call both instance and static methods into the Main method and run the programme.
        staticQus04();
        Question04 qus04 = new Question04();
        qus04.insQus04();


    }

    //Declare one instance method.
    public void insQus04() {
        //Call all four instance and static variables into both instance and static methods inside the print statement.
        Question04 insqus = new Question04();
        System.out.println(name);
        System.out.println(sur);
        System.out.println(a);
        System.out.println(b);
    }

    //Declare one static method.
    public static void staticQus04() {
        //Call all four instance and static variables into both instance and static methods inside the print statement.
        Question04 stqus = new Question04();
        System.out.println(stqus.a);
        System.out.println(stqus.b);
        System.out.println(name);
        System.out.println(sur);
    }
}
