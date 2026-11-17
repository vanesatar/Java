package sef.module5.activity;
// main class
public class InheritanceActivity {
    public static void main(String[] args) {
        Person_I myPerson = new Person_I("Sarah Johnson", 21);
        IO.println("-----------------------------");

        Employee_I myEmployee = new Employee_I();
        myEmployee.setSalary(70000.00);
        myEmployee.setTitle("Developer");
        myEmployee.setAge(32);
        myEmployee.setName("Shawn Cun");

        IO.println("-----------------------------");
        IO.println("Employee's Name is : " + myEmployee.getName());
        IO.println("Employee's Age is : " + myEmployee.getAge());
        IO.println("Employee's Title is : " + myEmployee.getTitle());
        IO.println("Employee's Salary is : " + myEmployee.getSalary());

        IO.println("-----------------------------");
        IO.println("Person's Name is : " + myPerson.getName());
        IO.println("Person's Age is : " + myPerson.getAge());
    }
}
