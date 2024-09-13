package DecoraterDesignPattern;
interface Pizza{
    String getDescription();
    double cost();
}

class PlainPizza implements Pizza{

    @Override
    public String getDescription() {
       return "Plain Pizza";
    }

    @Override
    public double cost() {
       return 8.0;
    }
    
}

abstract class PizzaDeccoter implements Pizza{

    Pizza pizzaDecorater;

    PizzaDeccoter(Pizza pizzaDecorater){
        this.pizzaDecorater = pizzaDecorater;
    }

    @Override
    public String getDescription() {
        return pizzaDecorater.getDescription();
    }

    @Override
    public double cost() {
        return pizzaDecorater.cost();
    }
}

class ChessePizza extends PizzaDeccoter{

    ChessePizza(Pizza decoratedPizza){
      super(decoratedPizza);
    }

    @Override
    public String getDescription() {
        return pizzaDecorater.getDescription()+ " Cheese";
    }

    @Override
    public double cost() {
        return pizzaDecorater.cost()+2.0;
    }

}

class PeppoReniPizza extends PizzaDeccoter{

    PeppoReniPizza(Pizza decoratedPizza){
      super(decoratedPizza);
    }

    @Override
    public String getDescription() {
        return pizzaDecorater.getDescription()+ " PeppoReni";
    }

    @Override
    public double cost() {
        return pizzaDecorater.cost()+7.0;
    }

}

public class DecDesign {
    public static void main(String[] args) {
        Pizza ob = new PlainPizza();

        ob = new ChessePizza(ob);
    }
}
