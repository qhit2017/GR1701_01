
public class Student {
	
	private String name; 
	private String id; 
	private double mathScore; 
	private double chineseScore; 
	private double englishScore; 
	private double sumscore;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, String id, double mathScore,
			double chineseScore, double englishScore, double sumscore) {
		super();
		this.name = name;
		this.id = id;
		this.mathScore = mathScore;
		this.chineseScore = chineseScore;
		this.englishScore = englishScore;
		this.sumscore = sumscore;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getMathScore() {
		return mathScore;
	}

	public void setMathScore(double mathScore) {
		this.mathScore = mathScore;
	}

	public double getChineseScore() {
		return chineseScore;
	}

	public void setChineseScore(double chineseScore) {
		this.chineseScore = chineseScore;
	}

	public double getEnglishScore() {
		return englishScore;
	}

	public void setEnglishScore(double englishScore) {
		this.englishScore = englishScore;
	}

	public double getSumscore() {
		
		sumscore=englishScore+chineseScore+mathScore;
		return sumscore;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", mathScore="
				+ mathScore + ", chineseScore=" + chineseScore
				+ ", englishScore=" + englishScore + ", sumscore=" +getSumscore()
				+ "]";
	}
	
	

}
