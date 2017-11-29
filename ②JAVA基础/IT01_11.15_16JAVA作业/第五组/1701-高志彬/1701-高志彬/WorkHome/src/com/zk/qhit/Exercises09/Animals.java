package com.zk.qhit.Exercises09;

/**
 * @author 作者 E-mail:1456014420@qq.com
 * @date 创建时间：2017年11月16日 下午7:41:41
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Animals {
	//名字
		String name;
		//品种
		String breed;
		//颜色
		String color;
		//年龄
		private int age;
		
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		
		void eat(String food){
			System.out.println("我喜欢吃"+food);  
		}
		void sleep(){
			System.out.println("呼~呼~");
		}
		void jump(){
			System.out.println("我可以跳到桌子上！");
		}
		Animals(){
			System.out.println("父类无参构造~");
		}
		
		
}
