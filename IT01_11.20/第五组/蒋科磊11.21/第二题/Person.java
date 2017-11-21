package person;

public abstract class Person {
	
	abstract String getContent();
	
	void say(){
		System.out.println(getContent());
	}
}