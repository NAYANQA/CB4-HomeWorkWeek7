package javaprogrammes;

/*
1. Write a Java programme using the following steps.
1.1 Declare two instance variables.
1.2 Declare one instance method.
1.3 Call both instance variables into the instance method inside the print statement.
1.4 Declare the Main method.
1.5 Call the above instance method into the Main method and run the programme.
 */
public class Question01 {
    //Declare two instance variables.
    int a = 10;
    int b = 20;

    //Declare the Main method.
    public static void main(String[] args) {
        //Call the above instance method into the Main method and run the programme.
        Question01 qut = new Question01();
        qut.qau1();
    }

    //Declare one instance method.
    public void qau1() {
        //Call both instance variables into the instance method inside the print statement.

        System.out.println(a);
        System.out.println(b);

    }
}
