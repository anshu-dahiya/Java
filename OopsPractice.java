//problem 1
//Create a class Employee with following properties and methods
//Properties - salary(int), name(String)
//Methods- getSalary(return salary), getName(return name),setName(change name)

class Employee{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}

public class OopsPractice {
    public static void main(String[] args){
        Employee obj = new Employee();
        obj.setName("Anshu");
        obj.salary = 56000;
        System.out.println(obj.getName());
        System.out.println(obj.getSalary());
    }
}
