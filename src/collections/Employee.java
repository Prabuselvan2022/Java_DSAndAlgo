package collections;

public class Employee {
    private int id;
    private String name;
    private long salary;
    private  int age;

    public Employee(int id, String name, int salary, int age) {
            this.id=id;
            this.name=name;
            this.salary=salary;
            this.age=age;

    }

//    setters and getters

    public void setId(int id) {
        this.id=id;
    }
    public int getId() {
        return id;
    }
    public  void setName(String name) {
        this.name=name;
    }
    public String getName(){
        return  name;
    }

    public void setSalary(int salary){
        this.salary=salary;
    }
    public  long getSalary(){
        return  salary;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public int getAge() {
        return age;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
