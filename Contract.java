class Employee {
    private int id;
    private String name;
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
    public boolean equals(Object obj) {
        if(this == obj)
           return true;
        if(obj == null || obj.getClass() != this.getClass())
           return false;
        Employee ob1 = (Employee) obj;
        return this.id == ob1.id && this.name == ob1.name;
    }

    
}

public class Contract {
    public static void main(String[] args) {
        System.out.println("nice");
        Employee e1 = new Employee();

        e1.setId(1);
        e1.setName("John");

        Employee e2 = new Employee();

        e1.setId(1);
        e1.setName("John");

        System.out.println("to see "+e2.getClass());
        System.out.println("shalow campre "+(e1 == e2));

    }
}
