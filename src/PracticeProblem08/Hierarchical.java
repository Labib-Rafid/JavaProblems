package PracticeProblem08;

class Employee{
    String name, department;
    int id;
    Employee(String name, int id, String department){
        this.name = name;
        this.id = id;
        this.department = department;
    }
    void calculatePay(){
        System.out.println("CalculatePay has been implemented.");
    }
}

class FullTimeEmployee extends Employee{
    double FixedSalary = 100000.123;
    FullTimeEmployee(String name, int id, String department, double FixedSalary){
        super(name, id, department);
    }
}

class PartTimeEmployee extends Employee{
    PartTimeEmployee(String name, int id, String department){
        super(name, id, department);
    }
    double hourlyRate = 300.35;
    int hoursWorked = 5;
}
class ContractEmployee extends Employee{
    String projectName;
    double contractAmount;
    ContractEmployee(String name, int id, String department){
        super(name, id, department);
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        Employee ob1 = new Employee("Labib", 2022831048, "SWE");
        PartTimeEmployee obj2 = new PartTimeEmployee("Rafid", 320, "SS");
        ContractEmployee ob3 = new ContractEmployee("Sovon", 341232, "EEE");
        obj2.calculatePay();
        ob3.projectName = "Reference";    ob3.contractAmount = 20000;
        System.out.println("Project Name : " + ob3.projectName + " " + "Contract Amount: " + ob3.contractAmount + " " );
    }
}
