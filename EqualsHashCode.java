public class EqualsHashCode {
    static class Employee{
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

        public boolean equals(Object o){
            if(o == null || getClass() != o.getClass())
               return false;
            if(o == this)
                return true;
            Employee e = (Employee)o;
            return this.getId() == e.getId() && this.getName() == e.getName();       
        }

        public int hashCode(){
            return id;
        }
    }
    public static void main(String[] args) {

        Employee e1 = new Employee();
        e1.setId(1);
        e1.setName("John");

        Employee e2 = new Employee();
        e1.setId(1);
        e1.setName("John");

        System.out.println("shallow campare "+(e1 == e2));

        System.out.println("shallow campare "+(e1.equals(e2)));


    }
}
