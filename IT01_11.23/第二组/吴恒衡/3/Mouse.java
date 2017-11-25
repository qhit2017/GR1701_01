package whh;
/** 
 * @author  作者 E-mail:2421922506@QQ.com
 * @date    创建时间：2017年11月23日 下午8:45:13 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public  class Mouse implements Zoology {
	private String name;
	private String breed;
	private int leg;
	private float weight;
	
	public Mouse (){
		
	}
	public Mouse(String name,String breed){
		this.name = name;
		this.breed = breed;
		
	}
	void Mouses(String name,String breed){
		System.out.println("这个老鼠的名字是："+name+"\n"+"品种是："+breed);
	}

	@Override
	public void getEat() {
		System.out.println("吃");
		// TODO Auto-generated method stub
		
	}
	@Override
	public void getcall() {
		System.out.println("喵喵喵");
		// TODO Auto-generated method stub
		
	}

	
}
