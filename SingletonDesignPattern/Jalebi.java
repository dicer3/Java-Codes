package SingletonDesignPattern;

public class Jalebi {
    // eager way of creating siingleton
    private static Jalebi jalebi = new Jalebi();
    private static Jalebi getJalebi(){
         return jalebi;
    }
}
