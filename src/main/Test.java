package main;

import java.util.Scanner;

import static sun.misc.Version.print;

public class Test {
    static{
        System.out.println("Static Block of test");
    }

    private static final int b = 991;

    //8. WAP to read words from the keyboard until the word done is entered. For each word except done, report whether its first character is equal   to  its last character. For the required loop, use a
    //a)while statement
    //b)do-while statement
    static void question8(){
        System.out.println("Using While");
        boolean flag = true;
        Scanner keyb1 = new Scanner(System.in);
        System.out.println("Using While");
        System.out.println("Enter a word.(Enter done to stop)");
        String word1;
        //System.out.println("Outside"+flag);
        StringBuffer s = new StringBuffer();
        while(flag){
            word1 = keyb1.next();
            if(word1.equals("done")){
                flag = false;
            }
            else {
                s.append(word1);
                //word1 = keyb1.next();
            }
        }
        if(s.charAt(0) == s.charAt(s.length() - 1)) {
            System.out.println("First & Last character equal.");
        }else {
            System.out.println("First & Last character not equal." );
        }
        System.out.println(s);
//        while((!word1.equals("done"))&&(flag))
//        {
//            if(word1.equals("done")){
//                s.append(word1);
//                flag = false;
//            }else{
//                word1 = keyb1.next();
//            }
////            System.out.println("Inside"+flag);
////            if(word1.charAt(0) == word1.charAt(word1.length() - 1))
////            {
////                flag = false;
////                System.out.println("First & Last character equal.");
////            }else
////            {
////                flag=false;
////                System.out.println("First & Last character not equal." );
////            }
//
//
//        }
//        keyb1.close();

        //System.out.println("Enter a word.(Enter done to stop)");
//        String word2 = keyb.next();
//
//        while(!word2.equals("done"))
//        {
//            if(word2.charAt(0) == word2.charAt(word2.length() - 1))
//            {
////                flag = false;
//                System.out.println("First & Last character equal.");
//            }else
//            {
////                flag = false;
//                System.out.println(" First & Last character not equal." );
//            }
//            word2 = keyb.next();
//        }





        System.out.println();
        System.out.println("------------------------------------------");
    }
    static  int a = 10;
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        //Object emp1 = Class.forName("main.Employee").newInstance();
        Employee emp1 = new Employee();
        emp1.setEmpName("Vidhi");
        emp1.attendance();
        emp1.work();
        emp1.leave();
        Employee emp2 = new Employee("002");
        System.out.println(emp2.getEmpId());
        Employee emp3 = new Employee("003","Ravi");
        System.out.println(emp3.getEmpId()+" "+emp3.getEmpName());
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        System.out.println(emp3.hashCode());
        System.out.println(a);
        System.out.println(Test.a);
        Class.forName("main.Employee");
        emp1.setAge();
        System.out.println("A"+"B"+"c".hashCode());
        int[] arr = new int[5];
        arr[0]=1;
        arr[1]=2;
        arr[2]=4;
        arr[3]=5;
        arr[4]=5;
        System.out.println(arr.toString());
        String s1 = "ABC";
        System.out.println(s1);
        s1 = "DEFGHD";
        int in = s1.indexOf("F");
        System.out.println(s1.substring(0,in));
        System.out.println(s1.substring(in+1));
        String s2 = s1.substring(0,in) + s1.substring(in+1);
        System.out.println(s2);
        s1=s2;
        System.out.println(s1);
        StringBuffer s = new StringBuffer();
        s.append("ajd");
        System.out.println("A".hashCode());
        System.out.println("Z".hashCode());
        System.out.println("a".hashCode());
        System.out.println("z".hashCode());
        System.out.println("0".hashCode());
        System.out.println("9".hashCode());


        Scanner keyScan = new Scanner(System.in);
        boolean notDone = true;

        while(notDone) {
            System.out.println("");
            String word = keyScan.next();
            String checkFirst = word.substring(0, 1);
            String checkLast = word.substring(word.length() - 1);

            if (word.equalsIgnoreCase("done")) {
                notDone = false;
            } else if (checkFirst.equalsIgnoreCase(checkLast)) {
                System.out.println(word + " does match");
            } else {
                System.out.println(word + " does not match");
            }
        }
    }
}
