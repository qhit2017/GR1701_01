package animal;
/*Author£ºÁõıŒ´Ï
 *E-mail£º15539919713@163.com
 */
public class Dog implements IAnimal{
	
	public Dog() {
		super();
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", type=" + type + ", color=" + color
				+ ", age=" + age + "Ëê]";
	}

	public Dog(String name) {
		super();
		this.name = name;
	}

	private String name;
	private String type;
	private String color;
	private int age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public void shout() {
		// TODO Auto-generated method stub
		System.out.println("ÏòÄ°ÉúÈË¿ñ·Í£¡");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("ÎÒÏ²»¶³ÔÈâ£¡");
	}

}