package day8.abstraction;
public class AbstractDemo {

	public static void main(String[] args) {
		Square sq=new Square();
		
		sq.calArea();
		sq.show();
		
		
		System.out.println("------------------------------------------------");
		//Runtime Polymorphism / Dynamic binding / late binding
		//Ex: Method Overriding
		
		Shape shape;
		shape=new Square(12.5f);
		
		shape.calArea(); // invoked Square class calArea()
		shape.show();
		
		
		
		
		
		

	}
//fjtgjfgew


}