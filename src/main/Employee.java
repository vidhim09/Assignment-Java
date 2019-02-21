package main;

public class Employee {
    private String empId;
    private String empName;
    int salary;
    static int age = 20;
    static{
        System.out.println("Static Block of Employee");
    }

    {
        System.out.println("Init Block Called");
    }
    Employee(){
        this.empId = "001";
        this.empName = "V";
    }

    Employee(String empId){
        this.empId = empId;
    }

    Employee(String empId,String empName){
        this.empId = empId;
        this.empName = empName;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void attendance(){
        System.out.println(getEmpName()+" Attendance Marked");

    }

    public void work(){
        System.out.println(getEmpName()+" Working");
    }

    public void leave(){
        System.out.println(getEmpName()+" Left");
    }

    public void setAge(){
        System.out.println(age);
    }

}
