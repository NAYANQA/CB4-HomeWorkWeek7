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
    int a = 10;
    static String name = "Test";

    public static void main(String[] args) {
        Question03 qusmain = new Question03();
        qusmain.insQus03();
        staticQus03();
    }

    public void insQus03(){
        System.out.println(a);
        System.out.println(name);
    }
    public static void staticQus03(){
        Question03 qus = new Question03();
        System.out.println(qus.a);
        System.out.println(name);
    }
}
