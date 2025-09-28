package exercicioListas;

public class Employee {

    private int id;
    private String name;
    private Double salary;

    public Employee(Integer id,String name, Double salary) {
        this.id = id;
        this.salary = salary;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getSalary() {
        return salary;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double salaryIncrease(Integer id, Double percent) {
        return salary += salary * (percent/100);
    }

    @Override
    public String toString() {
        return id + ", " + name + ", " + String.format("%.2f", salary);
    }

}
