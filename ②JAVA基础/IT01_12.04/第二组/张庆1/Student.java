package zhangqing;

public class Student {
	private String name;
	private String Id;
	private double math;
	private double chinese;
	private double english;
	private double sum;

	public Student() {

	}

	public Student(String name, String id, double math, double chinese,
			double english) {
		super();
		this.name = name;
		Id = id;
		this.math = math;
		this.chinese = chinese;
		this.english = english;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public double getMath() {
		return math;
	}

	public void setMath(double math) {
		this.math = math;
	}

	public double getChinese() {
		return chinese;
	}

	public void setChinese(double chinese) {
		this.chinese = chinese;
	}

	public double getEnglish() {
		return english;
	}

	public void setEnglish(double english) {
		this.english = english;
	}

	public double getSum() {
		sum = math + chinese + english;
		return sum;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", Id=" + Id + ", math=" + math
				+ ", chinese=" + chinese + ", english=" + english + ", sum="
				+ getSum() + "]";
	}

}
