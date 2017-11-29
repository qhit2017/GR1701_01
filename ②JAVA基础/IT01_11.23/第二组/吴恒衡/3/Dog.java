package whh;
/** 
 * @author  作者 E-mail:2421922506@QQ.com
 * @date    创建时间：2017年11月23日 下午8:31:45 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public  class Dog implements Zoology{
	private String name;
	private int age;
	private String breed;
	private String colour;
	
	public  Dog(){
		
	}
	public  Dog(String name){
		this.name = name;
	}
	void Dogs (String name){
		System.out.println("狗的名字是："+name);
	}
	@Override
	public void getEat() {
		System.out.println("吃骨头");
		// TODO Auto-generated method stub
		
	}
	@Override
	public void getcall() {
		System.out.println("汪汪汪");
		// TODO Auto-generated method stub
		
	}

}
