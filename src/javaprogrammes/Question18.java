package javaprogrammes;
/*
18. Write a Java Program using below steps.
18.1 Declare your council name as static variables.
18.2 Declare your house number as instance variables.
18.3 Declare one instance method name borough() and call Static variable
18.4 Declare static method name address() and call instance variable
18.5 Call both user defined methods into main method.
 */
public class Question18 {
    static String council= "Harrow";
    int houseNo= 03;

    public static void main(String[] args) {

        address();
        Question18 add = new Question18();
        add.borough();

    }

    public void borough(){
        System.out.println(council);

    }
    public static void address(){
        Question18 husno = new Question18();
        System.out.println(husno.houseNo);

    }
}
