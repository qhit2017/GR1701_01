package zhangtongtong;

public class PoliceDog extends Dog {

	//属性
	double speed;
	
	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	void work(){
		System.out.println("工作效率高");
		System.out.println("速度："+speed+"km/h");
		
	}
	public PoliceDog(String breed,String color,int age,double wight,double speed){
		super();
		this.speed = 30.0;
	}
}
