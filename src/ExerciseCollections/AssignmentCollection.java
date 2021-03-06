package ExerciseCollections;

import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.*;


//=====================================================================
//  Question 4 Class for Reference
//=====================================================================

class SalaryComparator implements Comparator<Employee>{
    @Override
    public int compare(Employee o1, Employee o2) {
        return (int) (o2.getSalary() - o1.getSalary());
    }
}

class Employee{

    private Integer id;
    private String name;
    private Double age;
    private Double salary;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(id, employee.id) &&
                Objects.equals(name, employee.name) &&
                Objects.equals(age, employee.age) &&
                Objects.equals(salary, employee.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(salary);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAge() {
        return age;
    }

    public void setAge(Double age) {
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    Employee(int id,String name, double age , double salary){
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
}

//=====================================================================
//  Question 5 Class for Reference
//=====================================================================
class ScoreNameComparator implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        int ans = (int) (o2.getScore()-o1.getScore());
        return ans==0 ? o1.getName().compareTo(o2.getName()): (int) (o2.getScore() - o1.getScore());
    }
}
class Student{
    String name;
    Double score;
    Double age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", age=" + age +
                '}';
    }

    Student(String name, double score, double age){
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Double getAge() {
        return age;
    }

    public void setAge(Double age) {
        this.age = age;
    }
}

//=====================================================================
//  Question 6 Class for Reference
//=====================================================================
class SortComparator implements Comparator<Integer>{
    private Map<Integer, Integer> fmap;
    public SortComparator(Map<Integer, Integer> map) {
        this.fmap = map;
    }

    @Override
    public int compare(Integer o1, Integer o2) {
        int fcomp = fmap.get(o1).compareTo(fmap.get(o2));
        int vcomp = o1.compareTo(o2);
        return fcomp == 0 ? vcomp : fcomp;
    }
}

//======================================================================
//  Question 7 Class for Reference
//======================================================================

class SpecialStack{
    Stack<Integer> stack;
    int min;

    SpecialStack(){
        stack = new Stack<>();
        System.out.println("Stack Created with Size 5");
    }
    public boolean isEmpty(){
        if(stack.isEmpty()){
            System.out.println("Stack is Empty");
            return true;
        }
        return false;
    }

    public boolean isFull(){
        if(stack.size()==5){
            System.out.println("Stack is Full");
            return true;
        }
        return false;
    }

    public void push(int p){
        if(this.isFull()){
            System.out.println("Element can not be pushed "+p);
            return;
        }
        stack.push(p);
        System.out.println("Element Pushed "+p);
        if(stack.size()==1)
            min = p;
        if(p < min){
            min = p;
        }
    }

    public void pop(){
        if (this.isEmpty()){
            System.out.println("Element can not be popped");
            return;
        }
        int elem = stack.pop();
        System.out.println("Popped Element "+elem);
    }

    public void getMin(){
        if (this.isEmpty()){
            System.out.println("Element can not be popped");
            return;
        }
        System.out.println("Minimum Element "+min);
    }
    public void display(){
        System.out.println("Current Stack");
        System.out.println(stack.toString());
    }
}

//======================================================================
//  Main Class
//======================================================================

public class AssignmentCollection {

    public static Comparator<AssignmentCollection> FreqComparator = new Comparator<AssignmentCollection>() {
        @Override
        public int compare(AssignmentCollection o1, AssignmentCollection o2) {
            return 0;
        }
    };

    //1.Write Java code to define List . Insert 5 floating point numbers in List, and using an iterator, find the sum of the numbers in List.
    static void question1(){
        System.out.println("1.Write Java code to define List . Insert 5 floating point numbers in List, and using an iterator, find the sum of the numbers in List.");
        List<Float> al = new ArrayList<>();
        al.add(1f);
        al.add(2f);
        al.add(3f);
        al.add(4f);
        al.add(5f);
        System.out.println("Current List: "+al);
        //al.set(4,10f);
        System.out.println("Iterated list ");
        Iterator<Float> iterator = al.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println();
        System.out.println("--------------------------------------");
    }

    //2.Write a method that takes a string and returns the number of unique characters in the string.
    static void question2(){
        System.out.println("2.Write a method that takes a string and returns the number of unique characters in the string.");
        String s = "hello how are you?";
        System.out.println("String : "+s);
        System.out.println("Number of Unique Characters: "+ countUnique(s));
        System.out.println("--------------------------------------");
    }

    static int countUnique(String s){
        Set<String> set = new HashSet<>();
        String a[] = s.split("");
        for(int i = 0 ; i < a.length ; i++){
            set.add(a[i]);
        }
        System.out.println(set);
//        System.out.println("Map : "+ map.keySet());
        return set.size();
    }


    //3.Write a method that takes a string and print the number of occurrence of each character character  s in the string.
    static void question3(){
        System.out.println("3.Write a method that takes a string and print the number of occurrence of each character character  s in the string.");
        Map<String,Integer> map = new HashMap<>();
        String s = "hellobyehellobyehellohey";
        System.out.println("String : "+s);
        String a[] = s.split("");
//        int count = 1;
        for(int i = 0 ; i < a.length ; i++){
            if(map.containsKey(a[i])) {
                int val =  map.get(a[i]);
                map.put(a[i], val+1);
            }else{
                map.put(a[i],1);
            }
        }
        System.out.println("Map : "+ map);
        System.out.println("--------------------------------------");
    }

    //4.Write a program to sort Employee objects based on highest salary using Comparator. Employee class{ Double Age; Double Salary; String Name
    static void question4(){
        Set<Employee> set = new TreeSet<>(new SalaryComparator());
        System.out.println("4.Write a program to sort Employee objects based on highest salary using Comparator. Employee class{ Double Age; Double Salary; String Name");
        set.add(new Employee(1,"Vidhi",20,30000));
        set.add(new Employee(2,"Anita",20,40000));
        set.add(new Employee(3,"Anuja",20,50000));
        set.add(new Employee(4,"Japneet",20,60000));
        set.add(new Employee(5,"Sakshi",20,70000));
        System.out.println(set);
        System.out.println("--------------------------------------");
    }

    //5.Write a program to sort the Student objects based on Score , if the score are same then sort on First Name . Class Student{ String Name; Double Score; Double Age
    static void question5(){
        System.out.println("5.Write a program to sort the Student objects based on Score , if the score are same then sort on First Name . Class Student{ String Name; Double Score; Double Age");
        Set<Student> set = new TreeSet<>(new ScoreNameComparator());
        set.add(new Student("Vidhi",90,20));
        set.add(new Student("XYZ",80,21));
        set.add(new Student("IJK",70,21));
        set.add(new Student("ABC",70,22));
        set.add(new Student("LMN",94,20));
        set.add(new Student("EFG",60,20));
        System.out.println(set);
        System.out.println("--------------------------------------");
    }

    //6.Print the elements of an array in the decreasing frequency if 2 numbers have same frequency then print the one which came first.
    static void question6(){
        System.out.println("6.Print the elements of an array in the decreasing frequency if 2 numbers have same frequency then print the one which came first.");
        int arr[] = {1,1,1,1,2,3,3,2,4};
        System.out.println("Current Array");
        for (int i = 0 ; i < arr.length ; i++)
            System.out.print(arr[i]+" ");
        List<Integer> list = new ArrayList<>();
        Map<Integer,Integer> map = new TreeMap<>();
        int count = 1;
        for (int i = 0 ; i < arr.length;i++){
            list.add(arr[i]);
            if(map.containsKey(arr[i]))
                map.put(arr[i],map.get(arr[i])+1);
            else
                map.put(arr[i],count);
        }
        System.out.println();
        System.out.println("Sorted Array According Frequency");
        SortComparator sc = new SortComparator(map);
        Collections.sort(list,sc);
        System.out.println(list);
        System.out.println("--------------------------------------");
    }

    //7.Design a Data Structure SpecialStack that supports all the stack operations like push(), pop(), isEmpty(), isFull() and an additional operation getMin() which should return minimum element from the SpecialStack. (Expected complexity ­ O(1))
    static void question7(){
        System.out.println("7.Design a Data Structure SpecialStack that supports all the stack operations like push(), pop(), isEmpty(), isFull() and an additional operation getMin() which should return minimum element from the SpecialStack. (Expected complexity \u00AD O(1))");
        SpecialStack specialStack = new SpecialStack();
        System.out.println("Calling isEmpty");
        specialStack.isEmpty();
        specialStack.push(20);
        specialStack.push(40);
        specialStack.push(30);
        specialStack.getMin();
        specialStack.pop();
        specialStack.push(10);
        specialStack.push(50);
        specialStack.push(60);
        specialStack.push(5);
        specialStack.display();
        System.out.println("Calling isFull");
        specialStack.isFull();
        specialStack.getMin();
        specialStack.display();
        System.out.println("--------------------------------------");
    }

    //8.Write a program to format date as example "21-March-2016"
    static void question8(){
        System.out.println("8.Write a program to format date as example \"21-March-2016\"");
        String datePattern = "dd-MMMM-yyyy";
        Date today = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(datePattern);
        String dateOutput = simpleDateFormat.format(today);
        System.out.println("Date Today : " + dateOutput);
        System.out.println("--------------------------------------");
    }

    //9.Write a program to display times in different country format.
    static void question9(){
        System.out.println("9.Write a program to display times in different country format.");
        String datePattern = "dd-MMMM-yyyy HH:mm:ss.SSSZ";
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(datePattern);
        String dateOutput = simpleDateFormat.format(date);
        System.out.println("Time according India : " + dateOutput);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("Europe/London"));
        System.out.println("Time according UK : " + simpleDateFormat.format(date));
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("Europe/Paris"));
        System.out.println("Time according France : " + simpleDateFormat.format(date));
        System.out.println("--------------------------------------");
    }


    public static void main(String[] args) {
        question1();
        question2();
        question3();
        question4();
        question5();
        question6();
        question7();
        question8();
        question9();
    }
}
