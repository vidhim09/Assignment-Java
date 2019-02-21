package main;

import static sun.misc.Version.print;

public class Test {
    static{
        System.out.println("Static Block of test");
    }

    private static final int b = 991;

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

        System.out.println(s1.replace("D","A"));
    }
}
