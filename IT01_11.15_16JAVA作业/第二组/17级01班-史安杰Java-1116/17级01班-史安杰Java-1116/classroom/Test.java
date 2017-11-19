package animal;

public class Test {
	public static void main(String[] args) {
		
	
	Cat cat=new Cat("拉布拉多",75.2,3);
    cat.type ="拉布拉多";
    System.out.println(cat.type);
	cat.eat("food");
    cat.climbtree();
    cat.sleep();
    cat.setColor("猫");
    System.out.println(cat.getColor());
    
    cat.color();
    	
    
    
}
}