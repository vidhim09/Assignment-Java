package ExerciseJava2;

import java.util.Scanner;


//======================================================================
//  Question 4 Class for Reference
//======================================================================
class Single {
    private static Single ourInstance = new Single();


    public static Single getInstance() {
        return ourInstance;
    }

    private Single() {
        System.out.println("Singleton Class");
    }
}

//======================================================================
//  Question 12 Class for Reference
//======================================================================
class Parent extends Grandparent {
    {
        System.out.println("instance - parent");
    }

    public Parent() {
        System.out.println("constructor - parent");
    }

    static {
        System.out.println("static - parent");
    }
}

class Grandparent {
     static {
        System.out.println("static - grandparent");
     }

     {
         System.out.println("instance - grandparent");
     }

     public Grandparent() {
        System.out.println("constructor - grandparent");
     }
}
class Child extends Parent {
    public Child() {
        System.out.println("constructor - child");
    }

    static {
        System.out.println("static - child");
    }

    {
        System.out.println("instance - child");
    }
}

//======================================================================
//  Question 13 Class for Reference
//======================================================================
class MyExceptionClass extends Exception{
    public MyExceptionClass(String msg){
        super(msg);
    }
}

//======================================================================
//  Main Class
//======================================================================

public class Main implements Cloneable{

    private int data;

    //copy constructor
    Main(Main m){
        data = m.data;
    }

    public Main() {

    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

//     1.Create Java classes having suitable attributes for Library management system.Use OOPs concepts in your design.Also try to use interfaces and abstract classes.
    static void question1() {
        System.out.println("Q1. Create Java classes having suitable attributes for Library management system.Use OOPs concepts in your design.Also try to use interfaces and abstract classes.");
        System.out.println("Refer LibraryManagementSytem.java in the same folder.");
        System.out.println("------------------------------------------");
    }

    //2. WAP to sorting string without using string Methods?.
    static void question2(String s){
        System.out.println("Q2. WAP to sorting string without using string Methods?.");
        s = s.toLowerCase();
        System.out.println("String: " + s);
        String arr[] = s.split("");
        String tmp = "";
        for(int i = 0; i < arr.length-1 ; i++){
            for(int j = 0 ; j < arr.length - i - 1 ; j++){
                if(arr[j].hashCode()>arr[j+1].hashCode()){
                    tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        String sorted = String.join("",arr);
        System.out.println("Sorted String: " + sorted);
        System.out.println("------------------------------------------");
    }

    //3. WAP to produce NoClassDefFoundError and ClassNotFoundException exception.
    static void question3(){
        System.out.println("Q3. WAP to produce NoClassDefFoundError and ClassNotFoundException exception.");
        System.out.println("Refer Question3.java in the same package.");
        System.out.println("------------------------------------------");
    }

    //4. WAP to create singleton class.
    static void question4(){
        System.out.println("Q4. WAP to create singleton class.");
        System.out.println("Refer Class Single");
        Single s1 = Single.getInstance();
        Single s2 =  Single.getInstance();
        if(s1==s2){
            System.out.println("Both the Objects made by singleton class share the same reference.");
            System.out.println("Therefore Singleton Class");
        }else{
            System.out.println("Not a Singleton Class");
        }
        System.out.println("------------------------------------------");
    }

    //5. WAP to show object cloning in java using cloneable and copy constructor both.
    static void question5(){
        System.out.println("5. WAP to show object cloning in java using cloneable and copy constructor both.");

        Main m1 = new Main();
        m1.setData(20);
        System.out.println("Object M1: "+m1.getData());

        System.out.println("Using Cloneable interface");
        try {
            System.out.println(m1.clone());
            Main m2 = (Main) m1.clone();
            System.out.println("Object M2: "+ m2.getData());
            System.out.println("Object M1 copied to M2");

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println("Using copy constructor");
        Main m3 = new Main(m1);
        System.out.println("Object M3: "+ m3.getData());
        System.out.println("Object M1 copied to M3");

        System.out.println("------------------------------------------");
    }

    //6. WAP showing try, multi-catch and finally blocks.
    static void question6(){
        System.out.println("6. WAP showing try, multi-catch and finally blocks.");
        int a;
        try{
            a = 5/0;
        }catch(ArithmeticException e){
            System.out.println("Arithemetic Exception: "+ e);
        }catch (Exception e){
            System.out.println("Exception: "+e);
        }finally {
            System.out.println("Finally Block");
        }
        System.out.println("------------------------------------------");
    }

    //7. WAP to convert seconds into days, hours, minutes and seconds.
    static void question7(long sec){
        System.out.println("Q7. WAP to convert seconds into days, hours, minutes and seconds.");
        System.out.println("Seconds: "+sec);
        long s = sec%60;
        sec = sec/60;
        long m = sec%60;
        sec = sec/60;
        long h = sec%24;
        sec = sec/24;
        long d = sec;
        System.out.println("Equal to");
        System.out.println("Days: "+ d);
        System.out.println("Hours: "+ h);
        System.out.println("Minutes: "+ m);
        System.out.println("Seconds: "+ s);
        System.out.println("------------------------------------------");
    }

    //8. WAP to read words from the keyboard until the word done is entered. For each word except done, report whether its first character is equal   to  its last character. For the required loop, use a
    //a)while statement
    //b)do-while statement
    static void question8(){
        boolean flag = true;
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Using While");
        System.out.println("Enter a word.(Enter done to stop)");
        while(flag){
            String word = sc1.next();
            if (word.equalsIgnoreCase("done")) {
                flag = false;
            } else if (word.charAt(0) == word.charAt(word.length() - 1)) {
                System.out.println(word + " first and last character match");
            } else {
                System.out.println(word + " first and last character do not match");
            }
        }
        System.out.println("While Complete");
        System.out.println("Using Do While");
        flag = true;
        Scanner sc2 = new Scanner(System.in);
        do{
            String word = sc2.next();
            if (word.equalsIgnoreCase("done")) {
                flag = false;
            } else if (word.charAt(0) == word.charAt(word.length() - 1)) {
                System.out.println(word + " first and last character match");
            } else {
                System.out.println(word + " first and last character do not match");
            }
        }while(flag);
        System.out.println("Do-While Complete");
        System.out.println("------------------------------------------");
    }

    //9.  Design classes having attributes for furniture where there are wooden chairs and tables, metal chairs and tables. There are stress and fire tests for each products.
    static void question9() {
        System.out.println("Q9.  Design classes having attributes for furniture where there are wooden chairs and tables, metal chairs and tables. There are stress and fire tests for each products.");
        System.out.println("Refer Furniture.java in the same package");
        System.out.println("------------------------------------------");
    }


/*    10. Design classes having attributes and method(only skeleton) for a coffee shop. There are three different actors in our scenario and i have listed the different actions they do also below
    * Customer
      - Pays the cash to the cashier and places his order, get a token number back
      - Waits for the intimation that order for his token is ready
      - Upon intimation/notification he collects the coffee and enjoys his drink
      ( Assumption:  Customer waits till the coffee is done, he wont timeout and cancel the order. Customer always likes the drink served. Exceptions like he not liking his coffee, he getting wrong coffee are not considered to keep the design simple.)

    * Cashier
      - Takes an order and payment from the customer
      - Upon payment, creates an order and places it into the order queue
      - Intimates the customer that he has to wait for his token and gives him his token
      ( Assumption: Token returned to the customer is the order id. Order queue is unlimited. With a simple modification, we can design for a limited queue size)

    * Barista
     - Gets the next order from the queue
     - Prepares the coffee
     - Places the coffee in the completed order queue
     - Places a notification that order for token is ready*/
    static void question10(){
        System.out.println("Q10. Design classes having attributes and method(only skeleton) for a coffee shop. There are three different actors in our scenario and i have listed the different actions");
        System.out.println("Refer CoffeeShop.java in the same package");
        System.out.println("------------------------------------------");
    }

   /* 11. Convert the following code so that it uses nested while statements instead of for statements:
        int s = 0;
        int t = 1;
        for (int i = 0; i < 10; i++)
        {
        s = s + i;
        for (int j = i; j > 0; j−−)
        {
        t = t * (j - i);
        }
        s = s * t;
        System.out.println("T is " + t);
        }
        System.out.println("S is " + s);*/
    static void question11(){
        System.out.println("11. Convert the following code so that it uses nested while statements instead of for statements");
        int s = 0;
        int t = 1;
        int i = 0;
        while( i < 10)
        {
            s = s + i;
            int j = i;
            while( j > 0)
            {
                t = t * (j - i);
                j--;
            }
            s = s * t;
            System.out.println("T is " + t);
            i++;
        }
        System.out.println("S is " + s);
        System.out.println("------------------------------------------");
    }

    /*12.What will be the  output on new Child(); ?
        class Parent extends Grandparent {

            {
            System.out.println("instance - parent");
            }

            public Parent() {
            System.out.println("constructor - parent");
            }

            static {
            System.out.println("static - parent");
            }
        }

        class Grandparent {

            static {
            System.out.println("static - grandparent");
            }

            {
            System.out.println("instance - grandparent");
            }

            public Grandparent() {
            System.out.println("constructor - grandparent");
            }
        }

        class Child extends Parent {

            public Child() {
            System.out.println("constructor - child");
            }

            static {
            System.out.println("static - child");
            }

            {
            System.out.println("instance - child");
            }
        }*/
    static void question12(){
        System.out.println("12.What will be the  output on new Child(); ?");
        Child c = new Child();
        //System.out.println(c);
        System.out.println("------------------------------------------");
    }

    //13. Create a custom exception that do not have any stack trace.
    static void question13(int age) throws MyExceptionClass {
        System.out.println("Q13. Create a custom exception that do not have any stack trace.");
        System.out.println("Exception will occur if age < 18");
        System.out.println("Current age "+age);
        if(age<18){
            throw new MyExceptionClass("Age Should be greater than 18");
        }
        System.out.println("------------------------------------------");
    }


    public static void main(String[] args) {
        question1();
        question2("abxsjdciehfie");
        question3();
        question4();
        question5();
        question6();
        question7(1003678);
        question8();
        question9();
        question10();
        question11();
        question12();
        try {
            question13(17);
        } catch (MyExceptionClass e) {
            System.out.println("Exception Occurred");
            e.fillInStackTrace();
            System.out.println(e);
        }
    }
}
