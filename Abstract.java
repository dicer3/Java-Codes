
// abstract class Sunstar {
// 	abstract void printInfo();
// }

// class Employee extends Sunstar {
// 	void printInfo() {
// 		System.out.println("pragun ");
// 	}
// }

abstract class Parent {
    Parent() {
   	 System.out.println("constructor of Base");
   }
   public void sayHello(){
   	  System.out.println("Hello");
   }
   abstract public void greet();
}

class Child extends Parent {

    @Override
	public void greet() {
		System.out.println("Good morning");
	}
}

class Child2 extends Parent {
	public void th(){
		System.out.println("nice ");
	}
	public void greet() {
		System.out.println("Good morning fine");
	}
}
public class Abstract {
	public static void main(String args[]){
		System.out.println("nice ");
		Parent k = new Child2();
		k.greet();
		//k.th();
		//Sunstar s = new Employee();
		//s.printInfo();
	}
}