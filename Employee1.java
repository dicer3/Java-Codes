public class Employee1 implements Comparable<Employee1> {
    
    private int id;
    private String name;

    public Employee1(int id, String name)  {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + "]";
    }


    @Override
    public int compareTo(Employee1 o) {
        return this.id - o.id;
    }

    
}