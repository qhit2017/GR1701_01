
public class Dog implements IAnimal {
	
	
	
	private String name;
	private String breed;
	private String color;
	private int     age;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
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
	
	Dog() {
		// TODO Auto-generated constructor stub
	} 
	 Dog(String name) {
		this.name=name;
		// TODO Auto-generated method stub
	

	}
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("小声的吃");
	}
	@Override
	public void shout() {
		// TODO Auto-generated method stub
		System.out.println("大声的叫");
		
	}
	


}
