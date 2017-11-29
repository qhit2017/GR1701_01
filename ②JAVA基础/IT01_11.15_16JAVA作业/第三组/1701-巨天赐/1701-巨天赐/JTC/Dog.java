package JTC;
/** 
 * @author  作者:JTC
 * @date    创建时间：2017年11月16日 下午5:42:03 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Dog {
	//定义一个类：狗，属性包括： 品种，毛的颜色， 年龄，重量
		private String breed;
		private String color;
		private int age;
		private int weight;
		
		public void message(){
			System.out.println("狗狗的品种是:"+breed+"，皮毛的颜色是："+color+"，现在"+age+"岁了"+",重量是："+weight+"磅。");
		}
		//品种
		public String getBreed() {
			return breed;
		}
		public void setBreed(String breed) {
			this.breed = breed;
		}
		//颜色
		public String getColor() {
			return color;
		}
		public void setColor(String color) {	
			this.color = color;
		}
		//年龄
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;			
			}
		//体重
		public double getWeight() {
			return weight;
		}
		public void setWeight(int weight) {
			if(weight<=100){
				this.weight = weight;			
			}
		}

		//方法包括：叫、吃、睡觉
		public void bark(){
			System.out.println("如果有陌生人后有人故意挑衅，我会对他狂吠........");
		}
		public void eat(){
			System.out.println("我向来不挑食！！！");
		}
		public void sleep(){
			System.out.println("这取决于主人.......");
}
}