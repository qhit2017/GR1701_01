
public class Test {
	public static void main(String[] args) {
		Cat cat=new Cat("拉布拉多",75,3, "家犬", 4);
	    cat.type ="拉布拉多";
	    System.out.println(cat.type);
		cat.eat("food");
	    cat.climbtree();
	    cat.sleep();
	    cat.setColor("猫");
	    System.out.println(cat.getColor());
	    
	    cat.color();
	    
	    Animal a=new Animal("白色",70);
	    Object object=new Object(); 
	    System.out.println(Math.PI);
	  
	    Cat cat_a=new Cat("拉布拉多",75, 3, "家犬",4);
	    Cat cat_b=new Cat("拉布拉多",75, 3, "家犬",4);
	    boolean isqual;
	    //boolean isquel = (cat_a==cat_b)?true:false;
	   isqual=cat_a.equals(cat_b);
	    
	    //System.out.println(isquel);
	    System.out.println(cat_a);
	    System.out.println(cat_b);
	    
	}

}
