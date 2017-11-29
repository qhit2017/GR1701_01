package wangshenliang;
/** 
 * @author  作者 王深良E-mail:793708547@QQ.com
 * @date    创建时间：2017年11月14日 下午7:23:20 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class Car {
		static int number=0;
		String color;
		int wheelNumber;
		float price;
		String id;
		
		public Car(){
			this.number++;
		}
		public static void main(String[] args) {
			Car car1=new Car();
			System.out.println("number:"+Car.number);
			
			Car car2=new Car();
			System.out.println("number:"+Car.number);
			
			Car car3=new Car();
			System.out.println("number:"+Car.number);
			
			Car car4=new Car();
			System.out.println("number:"+Car.number);
			
			Car car5=new Car();
			System.out.println("number:"+Car.number);
		}

}
