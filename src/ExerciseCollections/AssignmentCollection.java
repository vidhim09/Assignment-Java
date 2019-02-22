package ExerciseCollections;

import java.util.*;


//=====================================================================
//  Question 5 Class for Reference
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
//  Question 6 Class for Refernece
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

        System.out.println("--------------------------------------");
    }

    //7.Design a Data Structure SpecialStack that supports all the stack operations like push(), pop(), isEmpty(), isFull() and an additional operation getMin() which should return minimum element from the SpecialStack. (Expected complexity ­ O(1))
    static void question7(){
        System.out.println("7.Design a Data Structure SpecialStack that supports all the stack operations like push(), pop(), isEmpty(), isFull() and an additional operation getMin() which should return minimum element from the SpecialStack. (Expected complexity \u00AD O(1))");
        System.out.println("--------------------------------------");
    }

    //8.Write a program to format date as example "21-March-2016"
    static void question8(){
        System.out.println("8.Write a program to format date as example \"21-March-2016\"");
        System.out.println("--------------------------------------");
    }

    //9.Write a program to display times in different country format.
    static void question9(){
        System.out.println("9.Write a program to display times in different country format.");
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
