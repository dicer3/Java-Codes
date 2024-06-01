public class StaticPolymorphisam {
    static class Animal {
        public static void swim(){
            System.out.println("animal is swimming");
        }
    }
    static class AquaticAnimal extends Animal{
        public static void swim(){
            System.out.println("aq animal is swimming");
        }
    }
    public static void main(String[] args) {
        Animal ob = new AquaticAnimal();
        ob.swim();
    }
}
