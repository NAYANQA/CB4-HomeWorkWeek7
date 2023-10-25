package javaprogrammes;
/*
19. Write a Java Program using below steps.
19.1 Declare one of your group member names as instance variable.
19.2 Declare one of your group member names as static variable.
19.3 Declare one instance method name with group name (e.g. selenium())and call both global
variables.
19.4 Declare static method name agile() and call both variable
19.5 Call both user defined methods into main method.
Note: Declare 1 local variables in all user defined method and main method and print in to statement
 */
public class Question19 {

    String insName = "Nayan";
    static String stName = "Ayan";

    public static void main(String[] args) {
        Question19 mobj = new Question19();
        mobj.selenium();
        agile();

    }

    public void selenium(){
        int a = 20;

        System.out.println(insName);
        System.out.println(stName);
        System.out.println(a);

    }

    public static void agile(){
        Question19 grn = new Question19();
        System.out.println(grn.insName);
        System.out.println(stName);
        int b = 10;
        System.out.println(b);

    }

}
