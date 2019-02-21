package Exercise;

import java.util.Arrays;

enum House{
    Flat(1),PentHouse(15),Villa(7),Bunglow(9);

    private int price;
    House(int price){
        this.price = price;
        System.out.println("Current House is : "+ this.toString());
    }
    void getPrice(){
        System.out.println("Price of "+this.toString() +" is: " + price + " Crores");
    }
}

class Bank{
    float principle;
    float rateOfInterest;
    float time;
    void printDetails(){
        System.out.println("Details Of Bank");
    }
}

class BOI extends Bank{
    BOI(float p, float r , float t){
        System.out.println("From BOI");
        this.principle = p;
        this.rateOfInterest = r;
        this.time = t;
    }
    void printDetails(){
        System.out.println("Simple Interst for BOI = "+(principle*rateOfInterest*time)/100);
    }
}

class SBI extends Bank{
    SBI(float p, float r , float t){
        System.out.println("From SBI");
        this.principle = p;
        this.rateOfInterest = r;
        this.time = t;
    }
    void printDetails(){
        System.out.println("Simple Interst for SBI = "+(principle*rateOfInterest*time)/100);
    }
}

class ICICI extends Bank{
    ICICI(float p, float r , float t){
        System.out.println("From ICICI");
        this.principle = p;
        this.rateOfInterest = r;
        this.time = t;
    }
    void printDetails(){
        System.out.println("Simple Interst for ICICI = "+(principle*rateOfInterest*time)/100);
    }
}

public class Assignment {
    static String s = "Vidhi";

    static {
        String s = "Vidhi";
        System.out.println("Via Static Block : " + s);
        System.out.println("------------------------------------------");
    }
    //      Q1. Write a program to replace a substring inside a string with other string?*
    static void question1(String str , String substr, String replacewith) {

        String arr[] = str.split(substr);
        String newstr = "";
        int l = arr.length;
        for (int i = 0; i < l - 1; i++) {
            newstr = newstr.concat(arr[i] + replacewith);
        }
        newstr = newstr.concat(arr[l - 1]);
        System.out.println("Q1. Write a program to replace a substring inside a string with other string?");
        System.out.println("OLD STRING: " + str);
        System.out.println("NEW STRING: "+ newstr);
        System.out.println("------------------------------------------");
    }
    static void question2(String str){
        System.out.println("Q2. Write a program to find the number of occurrences of the duplicate words in a string and print them ?");
        System.out.println("STRING: " + str);
        System.out.println("Occurences: ");
        String arr[] = str.split(" ");
        for(int i = 0 ; i < arr.length ; i++){
            int wc = 1;
            for(int j = i+1 ; j < arr.length ; j++){
                if(arr[i].equals(arr[j])) {
                    wc++;
                    arr[j] = "";
                }
            }
            if(arr[i]!="" && wc>1){
                System.out.println(arr[i]+" : "+wc);
            }
        }
        System.out.println("------------------------------------------");
    }

//            Q3. Write a program to find the number of occurrences of a character in a string without using a loop?
    static void question3(String str,String c){
        System.out.println("Q3. Write a program to find the number of occurrences of a character in a string without using a loop?");
        System.out.println("STRING: "+str);
        int count = 0;
        System.out.println("Occurence of "+c+" : "+occurence(str,c,0));
        System.out.println("------------------------------------------");
    }

    static int occurence(String s, String c, int count){
        if(c==""){
            return s.length();
        }
        if(s.indexOf(c)==-1){
            return count;
        }
        int in = s.indexOf(c);
        count++;
        String s1 = s.substring(0,in) + s.substring(in+1);
        s = s1;
        return occurence(s,c,count);
    }

//    Q4. Calculate the number & Percentage Of Lowercase Letters, Uppercase Letters, Digits And Other Special Characters In A String
    static void question4(String s){
        System.out.println("Q4. Calculate the number & Percentage Of Lowercase Letters, Uppercase Letters, Digits And Other Special Characters In A String ");
        System.out.println("STRING: "+s);
        float cl = 0 , cu = 0 , cd = 0 , cs = 0;
        String arr[] =  s.split("");
        float l = arr.length;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i].hashCode() >= 65 && arr[i].hashCode() <= 90){
                cu++;
            }
            else if(arr[i].hashCode() >= 97 && arr[i].hashCode() <= 122){
                cl++;
            }
            else if(arr[i].hashCode() >= 48 && arr[i].hashCode() <= 57){
                cd++;
            }
            else{
                cs++;
            }
        }
        System.out.println("Percentage of Uppercase: " + (cu/l)*100 );
        System.out.println("Occurences of Lowercase: " + cl/l*100 );
        System.out.println("Occurences of Digits: " + cd/l*100 );
        System.out.println("Occurences of Special Characters: " + cs/l*100 );

        System.out.println("------------------------------------------");
    }

//      Q5. Find common elements between two arrays.
    static void question5(int a[],int b[]){
//        int arr[a.length];
        System.out.println("Q5. Find common elements between two arrays.");

        System.out.println("Array 1: ");
        for (int i = 0 ; i < a.length ; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("Array 2: ");
        for (int i = 0 ; i < b.length ; i++){
            System.out.print(b[i]+" ");
        }
        System.out.println();
        System.out.println("Common Elements are : ");

        for (int i = 0 ; i < a.length ; i++){
            for (int j = 0 ; j < b.length ; j++){
                if(a[i]==b[j]) {
                    System.out.print(b[j] + " ");
                    break;
                }
            }
        }
        System.out.println();
        System.out.println("------------------------------------------");
    }

//  Q6. There is an array with every element repeated twice except one. Find that element
    static void question6(int ar[]){
        System.out.println("Q6. There is an array with every element repeated twice except one. Find that element");
        Arrays.sort(ar);
        int elem = 0;
        int flag=0;
        for(int i = 0 ; i < ar.length ; i+=2){
            if(i<ar.length-1){
                if(ar[i]!=ar[i+1]){
                    elem = ar[i];
                    break;
                }
            }else{
                elem = ar[i];
            }
            if(flag == 1){
                break;
            }
        }
        System.out.println("Element: " + elem);
        System.out.println("------------------------------------------");
    }

//  Q7. Write a program to print your Firstname, LastName & age using static block, static method & static variable respectively
    static void question7(){
        String s = "Hello Vidhi";
        System.out.println("Q7. Write a program to print your Firstname, LastName & age using static block, static method & static variable respectively");
        System.out.println("Static Block : On the top");
        System.out.println("Static method: "+s);
        System.out.println("Static Variable: " +Assignment.s);
        System.out.println("------------------------------------------");
    }

//  Q8. Write a program to reverse a string and remove a character from index 4 to index 9 from the reversed string using String Buffer
    static void question8(String s){
        System.out.println("Q8. Write a program to reverse a string and remove a character from index 4 to index 9 from the reversed string using String Buffer");
        System.out.println("OLD STRING: "+s);
        String[] arr = s.split("");
        StringBuffer rev = new StringBuffer();
        for(int i = arr.length-1 ; i > -1 ; i--){
            rev.append(arr[i]);
        }
        System.out.println("REVERSED STRING: "+rev);
        rev.delete(4,9);
        System.out.println("AFTER DELETION: "+rev);
        System.out.println();
        System.out.println("------------------------------------------");
    }

//  Q9.Write a program to display values of enums using a constructor & getPrice() method (Example display house & their prices)
    static void question9(){
        System.out.println("Q9. Write a program to display values of enums using a constructor & getPrice() method (Example display house & their prices) ");
        House ph = House.PentHouse;
        ph.getPrice();
        House f = House.Flat;
        f.getPrice();
        House b = House.Bunglow;
        b.getPrice();
        House v = House.Villa;
        v.getPrice();
        System.out.println("------------------------------------------");
    }


//    Q10.Write a single program for the following operation using overloading
//    A) Adding 2 integer number
//    B) Adding 2 double
//    C) multiplying 2 float
//    D) multiplying 2 int
//    E) concate 2 string
//    F) Concate 3 String
    static void question10(){
        System.out.println("Q10.Write a single program for the following operation using overloading\n");
        System.out.println("A) Adding 2 integer number");
        System.out.println(add(2 ,5));
        System.out.println("B) Adding 2 double");
        System.out.println(add(2D ,4D));
        System.out.println("C) multiplying 2 float");
        System.out.println(mult(2.3f, 4.5f));
        System.out.println("D) multiplying 2 int");
        System.out.println(mult(2 , 5));
        System.out.println("E) concate 2 string");
        System.out.println(concatenate("Hello ","World"));
        System.out.println("F) Concate 3 String");
        System.out.println(concatenate("To "," The "," New "));
        System.out.println("------------------------------------------");
    }

    static int add(int a, int b){
        return a+b;
    }

    static double add(double a ,double b){
        return a+b;
    }

    static float mult(float a, float b){
        return a*b;
    }

    static int mult(int a,int b){
        return a*b;
    }

    static String concatenate(String a, String b){
        return a.concat(b);
    }

    static String concatenate(String a,String b,String c){
        return a.concat(b.concat(c));
    }

//    Q11.Create 3 subclasses of bank SBI, BOI,ICICI all 4 should have a method called getDetails which provide there specific details like rateofinterest etc, print details of every bank
    static void question11(){
        System.out.println("Q11. Create 3 subclasses of bank SBI, BOI , ICICI all 4 should have a method called getDetails which provide there specific details like rateofinterest etc, print details of every bank");
        Bank b1 = new BOI(5000,5,2);
        b1.printDetails();

        Bank b2 = new SBI(10000, 5 , 3);
        b2.printDetails();

        Bank b3 = new ICICI(7000, 4, 5);
        b3.printDetails();
        System.out.println("------------------------------------------");
    }


    public static void main(String[] args) {
            question1("Hello World to the new World.Bye","World","all");
            question2("Hello Bye Hello Bye Hello Hey");
            question3("Hello Bye Hello Bye Hello Hey","l");
            question4("Hello1* Bye2_ Hello3& Bye4% Hello5$ Hey6#");
            question5(new int[]{1,2,3,4,5}, new int[]{1,3,5,7});
            question6(new int[]{2 , 5 , 2 , 6 , 4, 5 , 6 , 4 , 7});
            question7();
            question8("Hello1* Bye2_ Hello3& Bye4% Hello5$ Hey6#");
            question9();
            question10();
            question11();
    }
}
